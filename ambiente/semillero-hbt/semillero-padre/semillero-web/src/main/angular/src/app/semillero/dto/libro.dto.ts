/**
 * @description Clase LibroDTO que contiene la informacion de si un proceso
 * se ha ehecutado exitosamente o se ha generado error.
 * @author Pedro Aguirre Arias
 */
export class LibroDTO {
    //numero de identificacion
    public id: number
    //nombre del libro
    public nombre: string;
    //editorial del libro
    public editorial: string;
    //tematica del libro
    public tematica: string;
    //representa el número de paginas del libro
    public numeroPaginas: number;
    //precio del libro
    public precio: number;
    // autores del libro
    public autores: string;
    //color del libro 
    public aColor: boolean;
    //fecha de venta del libro
    public fechaVenta: Date;
    //estado del libro
    public estado: string;
}