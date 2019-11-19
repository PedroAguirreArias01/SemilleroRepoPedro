import { FacturaDTO } from './factura.dto';
import { ComicDTO } from './comic.dto';
/**
 * @description Clase que determina los atributos de la entidad factura
 * @author Pedro Aguirre Arias
 */
export class FacturaDetalleDTO {
    /**
	 * Atributo que determina el id  
	 */
	public id: number;
	/**
	 * Atributo que determina la factura
	 */
	public  factura: FacturaDTO;
	/**
	 * Atributo que determina el comic
	 */
	public  comic: ComicDTO;
	/**
	 * Atributo que determina la cantidad 
	 */
	public  cantidad: number;
	/**
	 * Atributo que determina el precio unitario
	 */
	public  precioUnitario: number;

}