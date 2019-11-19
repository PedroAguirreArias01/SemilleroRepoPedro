import { PersonaDTO } from './persona.dto';
import { ProveedorDTO } from './proveedor.dto';
import { FacturaDetalleDTO } from './facturaDetalle.dto';

/**
 * @description clase FacturaDTO que contiene la informacion de la factura
 * @author Pedro Aguirre Arias
 */
export class FacturaDTO {
    /**
	 * Atributo que representa el id
	 */
	public  id: number;
	/**
	 * tributo que representa el cliente
	 */
	public cliente: PersonaDTO;
	/**
	 * Atributo que representa el proveedor
	 */
	public  proveedor: ProveedorDTO;
	/**
	 * Atributo que representa el iva
	 */
	public  iva: number;
	/**
	 * Atributo que representa el total
	 */
	public total: number;
	/**
	 * Atributo que representa el tipo de factuar
	 */
	public tipoFacturaEnum: string;
	/**
	 * Atributo que representa el estado de la factura
	 */
	public  estadoFacturaEnum: string;

	/**
	 * Atributo que representa la lista de detalles del pedido o la factura
	 */
	public facturaDetalle: Array<FacturaDetalleDTO> = [];
}