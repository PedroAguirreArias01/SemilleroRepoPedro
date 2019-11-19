/**
 * PersonaDTO.java
 */
package com.hbt.semillero.dto;

import java.io.Serializable;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version 
 */
public class PersonaDTO implements Serializable {

	/**
	 * Serializar es pasar un Objeto a un array de bytes y viceversa. Atributo que
	 * determina serialVersionUID es el id único que identifica una clase cuando lo
	 * serializamos. ;ediante este id podemos identificar el objeto convertido en un
	 * array de bytes.
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	private String nombre;
	private Long numIdentificacion;
	
	
	/**
	 * Constructor de la clase.
	 */
	public PersonaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param numIdentificacion
	 */
	public PersonaDTO(Long id, String nombre, Long numIdentificacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numIdentificacion = numIdentificacion;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numIdentificacion
	 * @return El numIdentificacion asociado a la clase
	 */
	public Long getNumIdentificacion() {
		return numIdentificacion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numIdentificacion
	 * @param numIdentificacion El nuevo numIdentificacion a modificar.
	 */
	public void setNumIdentificacion(Long numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}
	
}
