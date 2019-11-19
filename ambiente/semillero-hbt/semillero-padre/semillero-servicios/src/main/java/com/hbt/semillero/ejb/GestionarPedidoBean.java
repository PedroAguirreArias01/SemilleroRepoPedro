package com.hbt.semillero.ejb;

import java.lang.annotation.Retention;
import java.time.LocalDate;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidad.EstadoFacturaEnum;
import com.hbt.semillero.entidad.Factura;
import com.hbt.semillero.entidad.FacturaDetalle;
import com.hbt.semillero.entidad.Persona;
import com.hbt.semillero.entidad.Proveedor;

/**
 * 
 * <b>Descripción:<b> Clase que determina el Bean para realizar la gestion de pedidos
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarPedidoBean  implements IGestionarPedidoLocal{

	/**
	 * Atributo em que se usa para interacturar con el contexto de persistencia.
	 */
	@PersistenceContext
	private EntityManager em;
	
	
	/**
	 * 
	 * Metodo encargado de convertir una factura a una FacturaDTO
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param factura
	 * @return
	 */
	public FacturaDTO convertirFacturaToFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		if (factura.getId() != null) {
			facturaDTO.setId(factura.getId());
		}
		facturaDTO.setCliente(factura.getCliente());
		facturaDTO.setEstadoFacturaEnum(factura.getEstadoFacturaEnum());
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setProveedor(factura.getProveedor());
		facturaDTO.setTipoFacturaEnum(factura.getTipoFacturaEnum());
		facturaDTO.setTotal(factura.getTotal());
		return facturaDTO;
	}
	
	/**
	 * 
	 * Metodo encargado de convertir FacturaDTO a factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param facturaDTO
	 * @return
	 */
	public Factura convertirFacturaDTOToFactura(FacturaDTO facturaDTO) {
		Factura factura = new Factura();
		if (facturaDTO.getId() != null) {
			factura.setId(facturaDTO.getId());
		}
		factura.setEstadoFacturaEnum(facturaDTO.getEstadoFacturaEnum());
		factura.setCliente(facturaDTO.getCliente());
		factura.setIva(facturaDTO.getIva());
		factura.setProveedor(facturaDTO.getProveedor());
		factura.setTotal(facturaDTO.getTotal());
		factura.setTipoFacturaEnum(factura.getTipoFacturaEnum());
		return factura;
	}

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#crearFactura(com.hbt.semillero.dto.FacturaDTO)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void crearFactura(FacturaDTO facturaDTO) {
		Factura factura = convertirFacturaDTOToFactura(facturaDTO);
		// Se almacena la informacion y se maneja la enidad factura
		em.persist(factura);
	}

	/**
	 * se cambia el estado de la factura a entregado
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#eliminarFactura()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarFactura(Long idFactura) {
		Factura factura = em.find(Factura.class, idFactura);
		if (factura != null) {
			factura.setEstadoFacturaEnum(EstadoFacturaEnum.ENTREGADO);
			em.merge(factura);
		}
		
	}

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#totalPedido()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Double totalPedido(Long idFactura) throws Exception{
		Factura factura = em.find(Factura.class, idFactura);
		List<FacturaDetalle> listDetalles = factura.getFacturaDetalle();
		Double total = 0D;
		Double iva = 0D; 
		for (FacturaDetalle facturaDetalle : listDetalles) {
			iva = facturaDetalle.getPrecioUnitario().doubleValue()*0.17;
			total += (facturaDetalle.getPrecioUnitario().doubleValue()+iva)*facturaDetalle.getCantidad();
		}
		if (total >250.000) {
			 new Exception("Error el pedido supera el monto");
		}
		return total;
	}

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#cambiarEstadoPedido()
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public ResultadoDTO cambiarEstadoPedido(Long idFactura, String estado) {
		Factura factura = em.find(Factura.class, idFactura);
		switch (EstadoFacturaEnum.valueOf(estado)) {
		case ENTREGADO:
			factura.setEstadoFacturaEnum(EstadoFacturaEnum.ENTREGADO);
			break;
		case PENDIENTE:
			factura.setEstadoFacturaEnum(EstadoFacturaEnum.PENDIENTE);
			break;
		case SOLICITADO:
			factura.setEstadoFacturaEnum(EstadoFacturaEnum.SOLICITADO);
			break;
		default:
			break;
		}
		em.merge(factura);
		return new ResultadoDTO(true, "Estado Cambiado con exito");
	}

	/**
	 * 
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#modificarPedido(java.lang.Long, java.lang.String)
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarPedido(Long idComic, Long cantidadComics, String nombreProveedor, Long idFactura) {
		Factura factura = em.find(Factura.class, idFactura);
		Persona persona = factura.getProveedor().getPersona();
		persona.setNombre(nombreProveedor);
		List<FacturaDetalle> listDetalles = factura.getFacturaDetalle();
		for (FacturaDetalle facturaDetalle : listDetalles) {
			if (facturaDetalle.getComic().getId() == idComic) {
				facturaDetalle.setCantidad(cantidadComics);
			}
		}
		
	}

	/**
	 * metodo que se encarga de validar si el pedido fue despachado
	 * @see com.hbt.semillero.ejb.IGestionarPedidoLocal#validarPedidosDespachado(java.lang.Long)
	 */
	@Override
	public ResultadoDTO validarPedidosDespachado(Long idFactura) {
		Factura factura = em.find(Factura.class, idFactura);
		Persona persona = factura.getProveedor().getPersona();
		if (factura.getProveedor().getFechaCreacion().getDayOfMonth()> factura.getProveedor().getFechaCreacion().getDayOfMonth()+5 ) {
			if(factura.getEstadoFacturaEnum().equals(EstadoFacturaEnum.PENDIENTE)) {
				return new ResultadoDTO(true, "Pedido Fue despachado");
			}else {
				return new ResultadoDTO(false, "Pedido No despachado");
			}
		}
		return new ResultadoDTO(false, "No han pasado los 5 dias para verificacion");
	}
	
}
