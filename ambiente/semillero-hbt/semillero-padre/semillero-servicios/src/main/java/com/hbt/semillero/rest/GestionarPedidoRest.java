package com.hbt.semillero.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.ProveedorDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.ejb.GestionarPedidoBean;

/**
 * 
 * <b>Descripción:<b> Clase que determina los serviccios de la gestion del pedido
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Path("/GestionarPedido")
public class GestionarPedidoRest {

	/**
	 * Atriburo que permite gestionar un pedido
	 */
	@EJB
	private GestionarPedidoBean gestionarPedidoBean;
	
	/**
	 * 
	 * Metodo encargado de crear el pedido
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param facturaDTO
	 * @return
	 */
	@POST
	@Path("/crear")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearFactura(FacturaDTO facturaDTO) {
		gestionarPedidoBean.crearFactura(facturaDTO);
		return new ResultadoDTO(true, "Factura creada con exito");
	}
	
	/**
	 * 
	 * Metodo encargado de cambair el estado de la factjura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idFactura
	 * @param estado
	 * @return
	 */
	@POST
	@Path("/cambiarEstado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO cambiarestadoPedido(@QueryParam("idFactura") Long idFactura, @QueryParam("estado") String estado) {
		return gestionarPedidoBean.cambiarEstadoPedido(idFactura, estado);
	}
	
	/**
	 * 
	 * Metodo encargado de calcualr el total de la factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idFactura
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path("/consultarTotal")
	@Produces(MediaType.APPLICATION_JSON)
	public Double calcularTotal(@QueryParam("idFactura")Long idFactura) throws Exception {
		return this.gestionarPedidoBean.totalPedido(idFactura);
	}
	
	/**
	 * 
	 * Metodo encargado de elimianr la factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idFactura
	 * @return
	 */
	@POST
	@Path("/eliminar")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO eliminarFactura(@QueryParam("idFactura") Long idFactura) {
		gestionarPedidoBean.eliminarFactura(idFactura);
		return new ResultadoDTO(true, "Factura eliminada con exito");
	}
	
	@POST
	@Path("/modificarPedido")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO modificarPedido(@QueryParam("idComic") Long idComic, @QueryParam("cantidadComics")Long cantidadComics, @QueryParam("nombreProveedor")String nombreProveedor, @QueryParam("idFactura") Long idFactura) {
		gestionarPedidoBean.modificarPedido(idComic, cantidadComics, nombreProveedor, idFactura);
		return new ResultadoDTO(true, "Pedido modificado con exito");
	}
	
	/**
	 * 
	 * Metodo encargado de validar el pedido si esta despachado o no
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idFactura
	 * @return
	 */
	@POST
	@Path("/validarPedido")
	@Produces(MediaType.APPLICATION_JSON)
	public ResultadoDTO validarPedidoDespachado(@QueryParam("idComic") Long idFactura) {
		return gestionarPedidoBean.validarPedidosDespachado(idFactura);
	}
	
	/**
	 * 
	 * Metodo encargado de consultar todos los pedidos
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@GET
	@Path("/consultarPedidos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaDTO> consultarPedidos(){
		return gestionarPedidoBean.consultarPedidos();
	}
	
	/**
	 * 
	 * Metodo encargado de crear el proveedor
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@POST
	@Path("/crearProveedor")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO crearProveedor(ProveedorDTO proveedorDTO) {
		gestionarPedidoBean.crearProveedor(proveedorDTO);
		return new ResultadoDTO(true, "Proveedor creado con exito");
	}
}
