import { Component, OnInit } from '@angular/core';
import { LibroDTO } from '../../dto/libro.dto';

/**
 * @description clase encargada de gestionar todos los libros
 * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
 */
@Component({
  selector: 'gestionar-libro',
  templateUrl: './gestionar-libro.component.html',
  styleUrls: ['./gestionar-libro.component.css']
})
export class GestionarLibroComponent implements OnInit {

  /**
   * lista de libros
   */
  public listaLibros : Array<LibroDTO>;
  /**
   * mensaje que se mostrara al usuario
   */
  public mensaje: string;

  constructor() { }

  ngOnInit() {
    this.listaLibros = Array<LibroDTO>();
    this.crearLibros();
    this.printLibros();

  }

  /**
   * @description metodo encargado de crear los 5 libros 
   * y gregar a la listaLibros
   * @author Pedro
   */
  public crearLibros(): void {
    let libro1DTO: LibroDTO = new LibroDTO();
    libro1DTO.id = 1;
    libro1DTO.nombre = "batman";
    libro1DTO.editorial = "marvel";
    libro1DTO.tematica = "acción";
    libro1DTO.numeroPaginas = 50;
    libro1DTO.precio = 60,500.99;
    libro1DTO.autores = "Pedrito barrera";
    libro1DTO.aColor = true;
    libro1DTO.fechaVenta = new Date('05-10-2019');
    libro1DTO.estado = "activo";

    let libro2DTO: LibroDTO = new LibroDTO();
    libro2DTO.id = 2;
    libro2DTO.nombre = "Robin";
    libro2DTO.editorial = "marvel";
    libro2DTO.tematica = "acción";
    libro2DTO.numeroPaginas = 50;
    libro2DTO.precio = 60,500.99;
    libro2DTO.autores = "Pedrito barrera";
    libro2DTO.aColor = true;
    libro2DTO.fechaVenta = new Date('10-10-2019');
    libro2DTO.estado = "activo";

    let libro3DTO: LibroDTO = new LibroDTO();
    libro3DTO.id = 3;
    libro3DTO.nombre = "Cards";
    libro3DTO.editorial = "marvel";
    libro3DTO.tematica = "acción";
    libro3DTO.numeroPaginas = 50;
    libro3DTO.precio = 60,500.99;
    libro3DTO.autores = "Pedrito barrera";
    libro3DTO.aColor = true;
    libro3DTO.fechaVenta = new Date('10-10-2019');
    libro3DTO.estado = "Inctivo";

    let libro4DTO: LibroDTO = new LibroDTO();
    libro4DTO.id = 4;
    libro4DTO.nombre = "avengers";
    libro4DTO.editorial = "marvel";
    libro4DTO.tematica = "acción";
    libro4DTO.numeroPaginas = 50;
    libro4DTO.precio = 60,500.99;
    libro4DTO.autores = "Jhon Camero";
    libro4DTO.aColor = true;
    libro4DTO.fechaVenta = new Date();
    libro4DTO.estado = "activo";

    let libro5DTO: LibroDTO = new LibroDTO();
    libro5DTO.id = 5;
    libro5DTO.nombre = "la vuelta al mundo en 80 dias";
    libro5DTO.editorial = "norma";
    libro5DTO.tematica = "Novela";
    libro5DTO.numeroPaginas = 50;
    libro5DTO.precio = 60,500.99;
    libro5DTO.autores = " Julio Verne";
    libro5DTO.aColor = true;
    libro5DTO.fechaVenta = new Date(10-10-2019);
    libro5DTO.estado = "activo";

    this.listaLibros.push(libro1DTO);
    this.listaLibros.push(libro2DTO);
    this.listaLibros.push(libro3DTO);
    this.listaLibros.push(libro4DTO);
    this.listaLibros.push(libro5DTO);
  }

  /**
   * @description metodo encargado de imprimir la lista por consola
   * @author pedro
   */
  public printLibros(): void {
    console.log(JSON.stringify(this.listaLibros));
  }


  /**
   * @description metodo encargado de eliminar el libor en la posicion dada
   * @param post 
   */
  public eliminarLibro(post: number) : void {
    if(this.listaLibros.length > post){
      this.mensaje = "Se ha eliminado el comic nombreDelComic: "+this.listaLibros[post].nombre;
      this.listaLibros.splice(post, 1);
    }else{
      this.mensaje = "No hay elementos en la Posición 3!"
    }

  }

}
