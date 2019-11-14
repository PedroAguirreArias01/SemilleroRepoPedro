import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

/**
 * @description clase encargada de gestionar la consulta de comic
 * @author Pedro Aguirre  Arias <pedro.aguirre@uptc.edu.co>
 */
@Component({
  selector: 'consultar',
  templateUrl: './consultar.component.html',
  styleUrls: ['./consultar.component.css']
})
export class ConsultarComponent implements OnInit {

  /**
   * @description Atributo que contiene los datos para el control del formulario
   * @author Pedro Aguirre  Arias <pedro.aguirre@uptc.edu.co>
   */
  public gestionarComicForm: FormGroup;
  
  /**
   * @description Este es el constructor del componente consultar
   * @author Pedro Aguirre  Arias <pedro.aguirre@uptc.edu.co>
   * @param router 
   * @param fb 
   * @param activatedRoute 
   */
  constructor(private router: Router,private fb: FormBuilder, private activatedRoute: ActivatedRoute) {
    this.gestionarComicForm = this.fb.group({
      nombre: [null, Validators.required],
      editorial: [null],
      tematica: [null],
      coleccion: [null],
      numeroPaginas: [null],
      precio: [null],
      autores: [null],
      color: [null]
    });
   }

   /**
    * @description Evento angular que se ejecuta al invocar el componente
    * @author Pedro Aguirre  Arias <pedro.aguirre@uptc.edu.co>
    */
  ngOnInit() {
    let comic = this.activatedRoute.snapshot.params;
    console.log(JSON.stringify(comic));
    this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
    this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
    this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
    this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
    this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
    this.gestionarComicForm.controls.precio.setValue(comic.precio);
    this.gestionarComicForm.controls.autores.setValue(comic.autores);
    this.gestionarComicForm.controls.color.setValue(comic.color);
    this.gestionarComicForm.controls.nombre.disable();
    this.gestionarComicForm.controls.editorial.disable();
    this.gestionarComicForm.controls.tematica.disable();
    this.gestionarComicForm.controls.coleccion.disable();
    this.gestionarComicForm.controls.numeroPaginas.disable();
    this.gestionarComicForm.controls.precio.disable();
    this.gestionarComicForm.controls.autores.disable();
    this.gestionarComicForm.controls.color.disable();
  }

}
