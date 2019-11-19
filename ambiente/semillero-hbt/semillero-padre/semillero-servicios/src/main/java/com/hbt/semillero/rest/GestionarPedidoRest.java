package com.hbt.semillero.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.dto.FacturaDTO;
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
	 * Metodo encargado de 
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
	
	@POST
	@Path("/cambiarEstado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResultadoDTO cambiarestadoPedido(Long idFactura, String estado) {
		return gestionarPedidoBean.cambiarEstadoPedido(idFactura, estado);
	}
	
	@GET
	@Path("/consultarTotal")
	@Produces(MediaType.APPLICATION_JSON)
	public Double calcularTotal(Long idFactura) throws Exception {
		return this.gestionarPedidoBean.totalPedido(idFactura);
	}
	
	
	
}
