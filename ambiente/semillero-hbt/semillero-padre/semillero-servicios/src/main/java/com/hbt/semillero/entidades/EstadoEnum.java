package com.hbt.semillero.entidades;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public enum EstadoEnum {

	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.activo");
	
	private String codigoMensage;

	/**
	 * 
	 * Constructor de la clase.
	 * @param codigoMensage
	 */
	private EstadoEnum(String codigoMensage) {
		this.codigoMensage = codigoMensage;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getCodigoMensage() {
		return codigoMensage;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param codigoMensage
	 */
	public void setCodigoMensage(String codigoMensage) {
		this.codigoMensage = codigoMensage;
	}
	
	
}
