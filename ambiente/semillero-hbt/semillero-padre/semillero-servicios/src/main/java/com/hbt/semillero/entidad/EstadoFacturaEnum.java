package com.hbt.semillero.entidad;

/**
 * 
 * <b>Descripción:<b> Clase que determina el destado de la factura
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public enum EstadoFacturaEnum {
	SOLICITADO("enum.factura.solicitado"), 
	PENDIENTE("enum.factura.pendiente"), 
	ENTREGADO("enum.factura.entregado");
	
	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion
	 */
	private String codigoMensaje;

	
	/**
	 * 
	 * Constructor de la clase.
	 * @param codigoMensaje
	 */
	EstadoFacturaEnum(String codigoMensaje){
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
