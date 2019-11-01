package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

/**
 * clase representa los datos de un comic
 * @author pedro
 *
 */
public class ComicDTO implements Serializable{

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Identificador del comic 
	private String id;
	//Nombre del comic
	private String nombre;
	//Editorial del comic
	private String editorial;
	// TODO
	private TematicaEnum tematicaEnum;
	//Colleccion a que pertenece el comid
	private String coleccion;
	//Numero de paginas que contiene el comic
	private Integer numeroPaginas;
	//precio del comic
	private BigDecimal precio;
	//Los autores que tiene el comic
	private String autores;
	//Color del comic el cual puede ser sin color o con color 
	private Boolean color;
	private LocalDate fechaVenta;
	// TODO
	private EstadoEnum estadoEnum;
	//cantidad de unidades de cada comic
	private Long cantidad;
	
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPagina
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 */
	public ComicDTO(String id, String nombre, String editorial, TematicaEnum tematica, String coleccion, Integer numeroPagina,
			BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta, EstadoEnum estado, Long cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematicaEnum = tematica;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPagina;
		this.precio = precio;
		this.autores = autores;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estadoEnum = estado;
		this.cantidad = cantidad;
	}
	
	/**
	 * 
	 * @param id
	 * @param nombre
	 */
	public ComicDTO(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * 
	 * Constructor de la clase.
	 */
	public ComicDTO() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param editorial
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param tematica
	 */
	public void setTematicaEnum(TematicaEnum tematica) {
		this.tematicaEnum = tematica;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param coleccion
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public Integer getNumeroPagina() {
		return numeroPaginas;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param numeroPagina
	 */
	public void setNumeroPagina(Integer numeroPagina) {
		this.numeroPaginas = numeroPagina;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param precio
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public String getAutores() {
		return autores;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param autores
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public Boolean getColor() {
		return color;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param color
	 */
	public void setColor(Boolean color) {
		this.color = color;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param fechaVenta
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public EstadoEnum getEstado() {
		return estadoEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param estado
	 */
	public void setEstado(EstadoEnum estado) {
		this.estadoEnum = estado;
	}
	

	/**
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public Long getCantidad() {
		return cantidad;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param cantidad
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

}
