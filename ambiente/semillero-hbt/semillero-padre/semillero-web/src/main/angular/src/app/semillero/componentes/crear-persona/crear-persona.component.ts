import { Component, OnInit } from '@angular/core';
import {ComicDTO} from '../../dto/comic.dto'
import { from } from 'rxjs';
/**
 * @description esta clase permite crear personas
 * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
 */
@Component({
  selector: 'crear-persona',
  templateUrl: './crear-persona.component.html',
  styleUrls: ['./crear-persona.component.css']
})
export class CrearPersonaComponent implements OnInit {

  public persona : any = {};
  public listaApellidos : Array<any> = new Array<any>();
  public listaNombres = [];

  public comicDTO: ComicDTO;

  constructor() { }

  ngOnInit() {
    this.persona.nombre = "Pedro";
    this.persona.apellidos = "Aguirre Arias";

    let nombreInstructor = "Diego Alvarez";

    let miVariable : any = {
      id: 1,
      nombre: "pedro",
      apello: "aguirre"
    }

    this.listaApellidos.push(miVariable);
    for (let i = 0; i < this.listaApellidos.length; i++) {
      const element = this.listaApellidos[i];
      console.log(element);
    }

    let miMapa : Map<string, string>;
    miMapa = new Map<string, string>();

    miMapa.set("1", "Semillero");
    miMapa.get("1");
    let miFecha = new Date();
    console.log(miFecha);
    this.inicializarComponente();

  }

  public inicializarComponente() : Array<string> {
    let retorno : any;
    let objeto = undefined;
    if(objeto !== null && objeto !== undefined){
        console.log("No es nulo")
    } else {
        console.log("Si es nulo");
    }

    console.log(1 == 1);
    //console.log("1" == 1);
    console.log(1 === 1);
    //console.log("1" == 1);
    this.comicDTO = new ComicDTO();
    this.comicDTO.autores = "Pedro";
    this.comicDTO.fechaVenta  = new Date();
    console.log(this.comicDTO.autores);
    return retorno;
}
}
