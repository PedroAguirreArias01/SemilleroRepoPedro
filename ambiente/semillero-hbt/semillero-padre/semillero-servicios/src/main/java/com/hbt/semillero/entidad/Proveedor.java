package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * <b>Descripción:<b> Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."TC_PROVEEDOR" <b>Caso de Uso:<b>
 * 
 * @author pedro
 * @version
 */
@Entity
@Table(name = "TC_PROVEEDOR")
public class Proveedor implements Serializable{

	/**
	 * Serializar es pasar un Objeto a un array de bytes y viceversa. Atributo que
	 * determina serialVersionUID es el id único que identifica una clase cuando lo
	 * serializamos. ;ediante este id podemos identificar el objeto convertido en un
	 * array de bytes.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atrinuto que representa el id del usuario
	 */
	private Long id;
	/**
	 * Atrinuto que representa la fecha de creacion del usuario
	 */
	private LocalDate fechaCreacion;
	/**
	 * Atrinuto que representa el nombre del usuario
	 */
	private String dirreccion;

	/**
	 * Atrinuto que representa el estado del usuario
	 */
	private EstadoProveedorEnum estado;
	/**
	 * Atrinuto que representa la persona asociada al usuario
	 */
	private Persona persona;
	
	/**
	 * Atributo que representa el monto del credito
	 */
	private BigDecimal montoCredito;

	/**
	 * Constructor de la clase.
	 */
	public Proveedor() {
	}

	/**
	 * 
	 * Metodo encargado de  retornar el id
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Id
	@Column(name="SPID")
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
	 * Metodo encargado de retornar la fecha de creacion de la clase
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SPFECHA_CREACION")
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * 
	 * Metodo encargado de la modificacion del atributo fecha de creacion
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param fechaCreacion
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * 
	 * Metodo encargado de retornar la direccion
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SPDIRECCION")
	public String getDirreccion() {
		return dirreccion;
	}

	/**
	 * 
	 * Metodo encargado de modificar la direccion
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param dirreccion
	 */
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	/**
	 * 
	 * Metodo encargado de reronar el estdo del proveedor
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SPESTADO")
	public EstadoProveedorEnum getEstado() {
		return estado;
	}

	/**
	 * 
	 * Metodo encargado de modificar el estado
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param estado
	 */
	public void setEstado(EstadoProveedorEnum estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * Metodo encargado de retornar la persona
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@OneToOne
	@JoinColumn(name="SPIDPERSONA")
	public Persona getPersona() {
		return persona;
	}
	
	/**
	 * 
	 * Metodo encargado de modificar el atributo persona
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param persona
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * 
	 * Metodo encargado de retornar el monto de credito
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SPMONTO_CREDITO")
	public BigDecimal getMontoCredito() {
		return montoCredito;
	}

	/**
	 * 
	 * Metodo encargado de modicar el atreibuto monto credito
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param montoCredito
	 */
	public void setMontoCredito(BigDecimal montoCredito) {
		this.montoCredito = montoCredito;
	}

	/**
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dirreccion == null) ? 0 : dirreccion.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((montoCredito == null) ? 0 : montoCredito.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
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
		Proveedor other = (Proveedor) obj;
		if (dirreccion == null) {
			if (other.dirreccion != null)
				return false;
		} else if (!dirreccion.equals(other.dirreccion))
			return false;
		if (estado != other.estado)
			return false;
		if (fechaCreacion == null) {
			if (other.fechaCreacion != null)
				return false;
		} else if (!fechaCreacion.equals(other.fechaCreacion))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (montoCredito == null) {
			if (other.montoCredito != null)
				return false;
		} else if (!montoCredito.equals(other.montoCredito))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		return true;
	}

	

}
