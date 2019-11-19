package com.hbt.semillero.ejb;

import java.math.BigDecimal;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.dto.ResultadoDTO;

/**
 * 
 * <b>Descripción:<b> interfaz que determina los metodos para gestionar el pido
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public interface IGestionarPedidoLocal {

	/**
	 * 
	 * Metodo encargado de crear los detalles de la factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public void crearFactura(FacturaDTO facturaDTO);
	
	/**
	 * 
	 * Metodo encargado de eliminar la factura donde se cambia el estado de la mismma
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public void eliminarFactura(Long idFactura);
	
	/**
	 * 
	 * Metodo encargado de  calcular el total del pedido
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public Double totalPedido(Long idFactura)throws Exception;
	/**
	 * 
	 * Metodo encargado de  cambiar el estado del pedido
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public ResultadoDTO cambiarEstadoPedido(Long idFactura, String estado);
	
	/**
	 * 
	 * Metodo encargado de modifcar el pedido
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param cantidadComics
	 * @param nombreProveedor
	 * @return
	 */
	public void modificarPedido(Long idComic, Long cantidadComics,String nombreProveedor, Long idFactura);
	
	
	/**
	 * 
	 * Metodo encargado de validar si el pedido fue despachado
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idFactura
	 */
	public ResultadoDTO validarPedidosDespachado(Long idFactura);
}
