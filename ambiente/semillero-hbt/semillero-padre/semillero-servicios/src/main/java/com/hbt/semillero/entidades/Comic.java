package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Entity
@Table(name ="COMIC")
public class Comic implements Serializable{

	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String nombre;
    private String editorial;
    private TematicaEnum tematicaEnum;
    private String coleccion;
    private Integer numeroPaginas;
    private BigDecimal precio;
    private String autores;
    private Boolean color;
    private LocalDate fechaVenta;
    private EstadoEnum estadoEnum;
    private Long cantidad;

	public Comic() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "SCID")
	@SequenceGenerator(allocationSize = 1, name = "COMIC_SCID_GENERATOR", sequenceName = "SEQ_COMIC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SCID_GENERATOR")
	public Long getId() {
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
	public void setId(Long id) {
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
	@Column(name = "SCNOMBRE")
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
	@Column(name = "SCEDITORIAL")
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
	@Column(name = "SCTEMATICA")
	@Enumerated(value = EnumType.STRING)
	public TematicaEnum getTematicaEnum() {
		return tematicaEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param tematicaEnum
	 */
	public void setTematicaEnum(TematicaEnum tematicaEnum) {
		this.tematicaEnum = tematicaEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name = "SCCOLECCION")
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
	@Column(name = "SCNUMEROPAGINAS")
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name = "SCPRECIO")
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
	@Column(name = "SCAUTORES")
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
	@Column(name = "SCCOLOR")
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
	@Column(name = "SCFECHA_VENTA")
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * 
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
	@Column(name = "SCESTADO")
	@Enumerated(value = EnumType.STRING)
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param estadoEnum
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name = "SCCANTIDAD")
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

	/**
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comic [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematicaEnum=" + tematicaEnum
				+ ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio + ", autores="
				+ autores + ", color=" + color + ", fechaVenta=" + fechaVenta + ", estadoEnum=" + estadoEnum
				+ ", cantidad=" + cantidad + "]";
	}

	/**
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autores == null) ? 0 : autores.hashCode());
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((coleccion == null) ? 0 : coleccion.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + ((estadoEnum == null) ? 0 : estadoEnum.hashCode());
		result = prime * result + ((fechaVenta == null) ? 0 : fechaVenta.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroPaginas == null) ? 0 : numeroPaginas.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
		result = prime * result + ((tematicaEnum == null) ? 0 : tematicaEnum.hashCode());
		return result;
	}

	/**
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comic other = (Comic) obj;
		if (autores == null) {
			if (other.autores != null)
				return false;
		} else if (!autores.equals(other.autores))
			return false;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (coleccion == null) {
			if (other.coleccion != null)
				return false;
		} else if (!coleccion.equals(other.coleccion))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (estadoEnum == null) {
			if (other.estadoEnum != null)
				return false;
		} else if (!estadoEnum.equals(other.estadoEnum))
			return false;
		if (fechaVenta == null) {
			if (other.fechaVenta != null)
				return false;
		} else if (!fechaVenta.equals(other.fechaVenta))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (numeroPaginas == null) {
			if (other.numeroPaginas != null)
				return false;
		} else if (!numeroPaginas.equals(other.numeroPaginas))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		if (tematicaEnum == null) {
			if (other.tematicaEnum != null)
				return false;
		} else if (!tematicaEnum.equals(other.tematicaEnum))
			return false;
		return true;
	}
	
}