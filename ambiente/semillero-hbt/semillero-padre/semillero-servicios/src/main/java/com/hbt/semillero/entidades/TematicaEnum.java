package com.hbt.semillero.entidades;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public enum TematicaEnum {
	AVENTURAS("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	HUMORISTICO("enum.tematica.humoristico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.cienci_ficcion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror");
	
	private String codigoMensage;

	/**
	 * 
	 * Constructor de la clase.
	 * @param codigoMensage
	 */
	private TematicaEnum(String codigoMensage) {
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
