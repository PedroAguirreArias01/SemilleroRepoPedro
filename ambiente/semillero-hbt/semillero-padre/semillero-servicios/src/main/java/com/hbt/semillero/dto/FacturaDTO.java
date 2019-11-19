package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.hbt.semillero.entidad.EstadoFacturaEnum;
import com.hbt.semillero.entidad.Persona;
import com.hbt.semillero.entidad.Proveedor;
import com.hbt.semillero.entidad.TipoFacturaEnum;
/**
 * 
 * <b>Descripción:<b> Clase que determina la FacturaDTO
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public class FacturaDTO implements Serializable{

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
	private Persona cliente;
	/**
	 * Atributo que representa el proveedor
	 */
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
	 * 
	 * Metodo encargado de retronar el id
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
	 * Metodo encargado de retornar el cliente
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
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
	 * Metodo encargado de retornar el proveeedor
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
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
	public BigDecimal getIva() {
		return iva;
	}
	/**
	 * 
	 * Metodo encargado de  modificar el iva 
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
	 * Metodo encargado de retornar el total
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
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
	 * Metodo encargado de retornar el tipo factura
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public TipoFacturaEnum getTipoFacturaEnum() {
		return tipoFacturaEnum;
	}
	/**
	 * 
	 * Metodo encargado de modificatr el tipo factura
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
	 * Metodo encargado de retornar el estdo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public EstadoFacturaEnum getEstadoFacturaEnum() {
		return estadoFacturaEnum;
	}
	/**
	 * 
	 * Metodo encargado de modificar el estdo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param estadoFacturaEnum
	 */
	public void setEstadoFacturaEnum(EstadoFacturaEnum estadoFacturaEnum) {
		this.estadoFacturaEnum = estadoFacturaEnum;
	}
	
	
	
	
}
