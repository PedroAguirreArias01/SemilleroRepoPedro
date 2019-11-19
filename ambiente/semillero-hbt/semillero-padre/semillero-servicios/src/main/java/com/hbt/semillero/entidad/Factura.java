/**
 * 
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * <b>Descripción:<b> Clase que determina la entidad que permite representar la
 * tabla "DB_SEMILLERO"."TC_FACTURA"
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Entity
@Table(name="TC_FACTURA")
public class Factura implements Serializable{
	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributo que representa el id
	 */
	private Long id;
	/**
	 * tributo que representa el cliente
	 */
	 @ManyToOne
	private Persona cliente;
	/**
	 * Atributo que representa el proveedor
	 */
	 @ManyToOne
	private Proveedor proveedor;
	/**
	 * Atributo que representa el iva
	 */
	private BigDecimal iva;
	/**
	 * Atributo que representa el total
	 */
	private BigDecimal total;
	/**
	 * Atributo que representa el tipo de factuar
	 */
	private TipoFacturaEnum tipoFacturaEnum;
	/**
	 * Atributo que representa el estado de la factura
	 */
	private EstadoFacturaEnum estadoFacturaEnum;
	
	/**
	 * Atributo que representa la lista de detalles
	 */
	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
	private List<FacturaDetalle> facturaDetalle;
	
	/**
	 * 
	 * Constructor de la clase.
	 */
	public Factura() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Metodo encargado de retorna el id de la factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Id
	@Column(name="SFID")
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
	 * Metodo encargado de retornar el cliente
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFCLIENTE")
	public Persona getCliente() {
		return cliente;
	}

	/**
	 * 
	 * Metodo encargado de modificar el cliente
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param cliente
	 */
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	/**
	 * 
	 * Metodo encargado de reornar le proveedor
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFPROVEEDOR")
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * 
	 * Metodo encargado de modificar el proveedor
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param proveedor
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * 
	 * Metodo encargado de retornar el iva
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFIVA")
	public BigDecimal getIva() {
		return iva;
	}

	/**
	 * 
	 * Metodo encargado de modificar ek iva
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param iva
	 */
	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	/**
	 * 
	 * Metodo encargado de rotornar el total
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFTOTAL")
	public BigDecimal getTotal() {
		return total;
	}

	/**
	 * 
	 * Metodo encargado de modificar el total
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param total
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	/**
	 * 
	 * Metodo encargado de retornar el tipo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFTIPO")
	public TipoFacturaEnum getTipoFacturaEnum() {
		return tipoFacturaEnum;
	}

	/**
	 * 
	 * Metodo encargado de modificar el tipo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param tipoFacturaEnum
	 */
	public void setTipoFacturaEnum(TipoFacturaEnum tipoFacturaEnum) {
		this.tipoFacturaEnum = tipoFacturaEnum;
	}

	/**
	 * 
	 * Metodo encargado de retornar el estado
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@Column(name="SFESTADO")
	public EstadoFacturaEnum getEstadoFacturaEnum() {
		return estadoFacturaEnum;
	}

	/**
	 * 
	 * Metodo encargado de modificar el estado
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param estadoFacturaEnum
	 */
	public void setEstadoFacturaEnum(EstadoFacturaEnum estadoFacturaEnum) {
		this.estadoFacturaEnum = estadoFacturaEnum;
	}
	
	/**
	 * 
	 * Metodo encargado de la lista de detalles
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public List<FacturaDetalle> getFacturaDetalle() {
		return facturaDetalle;
	}
	
	/**
	 * 
	 * Metodo encargado de modificar la lista detalles
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param facturaDetalle
	 */
	public void setFacturaDetalle(List<FacturaDetalle> facturaDetalle) {
		this.facturaDetalle = facturaDetalle;
	}

	/**
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((estadoFacturaEnum == null) ? 0 : estadoFacturaEnum.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iva == null) ? 0 : iva.hashCode());
		result = prime * result + ((proveedor == null) ? 0 : proveedor.hashCode());
		result = prime * result + ((tipoFacturaEnum == null) ? 0 : tipoFacturaEnum.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (estadoFacturaEnum != other.estadoFacturaEnum)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (iva == null) {
			if (other.iva != null)
				return false;
		} else if (!iva.equals(other.iva))
			return false;
		if (proveedor == null) {
			if (other.proveedor != null)
				return false;
		} else if (!proveedor.equals(other.proveedor))
			return false;
		if (tipoFacturaEnum != other.tipoFacturaEnum)
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}
	
	
}
