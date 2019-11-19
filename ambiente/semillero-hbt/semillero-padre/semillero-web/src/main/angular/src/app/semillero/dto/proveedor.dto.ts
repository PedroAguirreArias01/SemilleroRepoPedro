/**
 * @description clase ProveedorDTO que contiene la informacion del proveedor
 * @author Pedro Aguirre Arias
 */
export class  ProveedorDTO {
   /**
	 * Atrinuto que representa el id del usuario
	 */
	public  id: number;
	/**
	 * Atrinuto que representa la fecha de creacion del usuario
	 */
	public  fechaCreacion: Date;
	/**
	 * Atrinuto que representa el nombre del usuario
	 */
	private  dirreccion: String;

	/**
	 * Atrinuto que representa el estado del usuario
	 */
	public  estado: string;
	/**
	 * Atrinuto que representa la persona asociada al usuario
	 */
	public  persona: string;
	
	/**
	 * Atributo que representa el monto del credito
	 */
	public  montoCredito: number;

}