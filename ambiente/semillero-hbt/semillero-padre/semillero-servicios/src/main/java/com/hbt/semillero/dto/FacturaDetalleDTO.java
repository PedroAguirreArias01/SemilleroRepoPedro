package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Factura;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public class FacturaDetalleDTO  implements Serializable{

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
	/**
	 * 
	 * Constructor de la clase.
	 */
	public FacturaDetalleDTO() {
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
	 * Metodo encargado de retornar la contidad
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
	 * Metodo encargado de retornar el precio uniatario
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	/**
	 * 
	 * Metodo encargado de modificar el valor unitario
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param precioUnitario
	 */
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((comic == null) ? 0 : comic.hashCode());
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((precioUnitario == null) ? 0 : precioUnitario.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FacturaDetalleDTO other = (FacturaDetalleDTO) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (comic == null) {
			if (other.comic != null)
				return false;
		} else if (!comic.equals(other.comic))
			return false;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (precioUnitario == null) {
			if (other.precioUnitario != null)
				return false;
		} else if (!precioUnitario.equals(other.precioUnitario))
			return false;
		return true;
	}
	
	
}
