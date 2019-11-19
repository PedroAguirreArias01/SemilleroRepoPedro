package com.hbt.semillero.entidad;

/**
 * 
 * <b>Descripción:<b> Clase que determina el estado del proveedor 
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public enum EstadoProveedorEnum {

	ACTIVO("enum.proveedor.activo"),
	INACTIVO("enum.proveedor.inactivo");
	
	/**
	 * Atributo que contiene la clave del mensaje para la internacionalizacion
	 */
	private String codigoMensaje;
	
	/**
	 * Constructor de la clase.
	 * @param codigoMensaje
	 */
	private EstadoProveedorEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	/**
	 * Metodo que retorna el valor del atributo
	 * 
	 * @return cadena con el codigo del mensaje
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/**
	 * Metodo que establece el valor del atributo
	 *
	 * @param codigoMensaje
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

}
