package com.hbt.semillero.entidad;

/**
 * 
 * <b>Descripción:<b> Clase que determina la enumeracion para representar los
 * tipos de factura
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public enum TipoFacturaEnum {

	PEDIDO("enum.factura.pedido"),
	VENTA("enum.factura.venta");
	
	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion
	 */
	private String codigoMensaje;

	
	/**
	 * 
	 * Constructor de la clase.
	 * @param codigoMensaje
	 */
	TipoFacturaEnum(String codigoMensaje){
		this.codigoMensaje = codigoMensaje;
	}


	/**
	 * 
	 * Metodo encargado retorna el valor del atributo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}


	/**
	 * 
	 * Metodo encargado de establecer el valor del atributo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param codigoMensaje
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	
}
