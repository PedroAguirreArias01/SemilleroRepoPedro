package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TC_FACTURA_DETALLE")
public class FacturaDetalle  implements Serializable{

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo que determina el id  
	 */
	private Long id;
	/**
	 * Atributo que determina la factura
	 */
	private Factura factura;
	/**
	 * Atributo que determina el comic
	 */
	private Comic comic;
	/**
	 * Atributo que determina la cantidad 
	 */
	private Long cantidad;
	/**
	 * Atributo que determina el precio unitario
	 */
	private BigDecimal precioUnitario;
	
	public FacturaDetalle() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * Metodo encargado de retornar el id
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Id
	@Column(name="SDID")
	public Long getId() {
		return id;
	}
	/**
	 * 
	 * Metodo encargado de modificar el id
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 
	 * Metodo encargado de retornar la factura 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SDFACTURA_ID")
	public Factura getFactura() {
		return factura;
	}
	/**
	 * 
	 * Metodo encargado de modificar la factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param factura
	 */
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	/**
	 * 
	 * Metodo encargado de retornar el comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SDCOMIC_ID")
	@ManyToOne
	public Comic getComic() {
		return comic;
	}
	/**
	 * 
	 * Metodo encargado de modificar el comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param comic
	 */
	public void setComic(Comic comic) {
		this.comic = comic;
	}
	/**
	 * 
	 * Metodo encargado de retornar la cantidad de comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SDCANTIDAD")
	public Long getCantidad() {
		return cantidad;
	}
	/**
	 * 
	 * Metodo encargado de modificar la cantidad
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param cantidad
	 */
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * 
	 * Metodo encargado de retornar el precion unitario
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name=" SDPRECIO_UNITARIO")
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * 
	 * Metodo encargado de modificar el precio unitario
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param precioUnitario
	 */
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	
}
