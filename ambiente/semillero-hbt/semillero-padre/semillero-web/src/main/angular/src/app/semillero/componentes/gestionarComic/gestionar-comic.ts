
import { ComicDTO } from '../../dto/comic.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';
import { GestionarComicService } from '../../services/gestionar.comic.service';
import { ResultadoDTO } from '../../dto/resultado.dto';
/**
 * @description Componenete gestionar comic, el cual contiene la logica CRUD
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
    selector: 'gestionar-comic',
    templateUrl: './gestionar-comic.html',
    styleUrls: ['./gestionar-comic.css']
})
export class GestionarComicComponent implements OnInit {

    /**
     * Atributo que contiene los controles del formulario
     */
    public gestionarComicForm: FormGroup;

    /**
     * Atributo que contendra la informacion del comic
     */
    public comic: ComicDTO;

    /**
     * Atributo que contendra la lista de comics creados
     */
    public listaComics: Array<ComicDTO>;

    /**
     * Atributo que indica si se envio a validar el formulario
     */
    public submitted: boolean;

    /**
     * Atributo que indica si se esta editando un comic
     */
    public editar: boolean;

    /**
     * Atributo que indica cual es la posicion del comic a editar
     */
    public posComicEdit: number;

    /**
     * @description Este es el constructor del componente GestionarComicComponent
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    constructor(private fb: FormBuilder, private gestionarComicService: GestionarComicService,
        private router: Router) {
        this.gestionarComicForm = this.fb.group({
            nombre: [null, Validators.required],
            editorial: [null],
            tematica: [null],
            coleccion: [null],
            numeroPaginas: [null],
            precio: [null],
            autores: [null],
            color: [null],
            cantidad: [null, Validators.required]
        });
    }

    /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    ngOnInit(): void {
        this.comic = new ComicDTO();
        this.listaComics = new Array<ComicDTO>();
        this.consultarComics();
    }

    /**
     * @description Metodo que permite validar el formulario y crear o actulizar un comic
     */
    public crearActualizarComic(): void {
        this.submitted = true;
        if (this.gestionarComicForm.invalid) {
            return;
        }
        this.comic = new ComicDTO();
        this.comic.nombre = this.gestionarComicForm.controls.nombre.value;
        this.comic.editorial = this.gestionarComicForm.controls.editorial.value;
        this.comic.tematica = this.gestionarComicForm.controls.tematica.value;
        this.comic.coleccion = this.gestionarComicForm.controls.coleccion.value;
        this.comic.numeroPaginas = this.gestionarComicForm.controls.numeroPaginas.value;
        this.comic.precio = this.gestionarComicForm.controls.precio.value;
        this.comic.autores = this.gestionarComicForm.controls.autores.value;
        this.comic.color = this.gestionarComicForm.controls.color.value;
        this.comic.cantidad = this.gestionarComicForm.controls.cantidad.value;
        this.comic.numeroPaginas = 20;
        if (!this.editar) {
            this.gestionarComicService.crearComic(this.comic).subscribe(resultadoDTO => {
                if (resultadoDTO.exitoso) {
                    Swal.fire(
                        'Comic creado con exito!',
                        'success'
                    );
                    this.consultarComics();
                    this.limpiarFormulario();
                }
            }, error => {
                console.log(error);
            });

        } else {
            console.log('antes')
            this.gestionarComicService.editar(this.comic).subscribe(resultadoDTO => {
                console.log('despues')
                if (resultadoDTO.exitoso) {
                    this.consultarComics();
                    Swal.fire(
                        'Comic modificado con exito!',
                        'success'
                    );
                    this.limpiarFormulario();
                    this.editar = false;
                }
            });
        }
    }

    /**
     * @description Metodo encargado de consultar los comics existentes
     * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
     */
    public consultarComics(): void {
        this.gestionarComicService.consultarComics().subscribe(listaComics => {
            this.listaComics = listaComics;
        }, error => {
            console.log(error);
        });
    }

    /**
     * Metodo que permite consultar un comic de la tabla y sus detalles e inhabilitar el formulario
     * @param posicion en la lista del comic seleccionado
     */
    public consultarComic(posicion: number): void {
        let comic = this.listaComics[posicion];
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
        //        this.gestionarComicForm.controls.color.enable(); para habilitar el campo

    }

    /**
     * @description metodo encargado de actualizar la información del comic
     * @author Pedro aguirre Arias;
     * @param comic 
     */
    public editarComic(comic: any, posicion: number): void {
        this.posComicEdit = posicion;
        this.gestionarComicForm.controls.nombre.setValue(comic.nombre);
        this.gestionarComicForm.controls.editorial.setValue(comic.editorial);
        this.gestionarComicForm.controls.tematica.setValue(comic.tematica);
        this.gestionarComicForm.controls.coleccion.setValue(comic.coleccion);
        this.gestionarComicForm.controls.numeroPaginas.setValue(comic.numeroPaginas);
        this.gestionarComicForm.controls.precio.setValue(comic.precio);
        this.gestionarComicForm.controls.autores.setValue(comic.autores);
        this.gestionarComicForm.controls.color.setValue(comic.color);
        this.editar = true;
    }

    /**
     * @description metodo encargado de limpiar el formualrio
     * @author Pedro Aguirre Arias
     */
    private limpiarFormulario(): void {
        this.submitted = false;
        this.gestionarComicForm.controls.nombre.setValue(null);
        this.gestionarComicForm.controls.editorial.setValue(null);
        this.gestionarComicForm.controls.tematica.setValue(null);
        this.gestionarComicForm.controls.coleccion.setValue(null);
        this.gestionarComicForm.controls.numeroPaginas.setValue(null);
        this.gestionarComicForm.controls.precio.setValue(null);
        this.gestionarComicForm.controls.autores.setValue(null);
        this.gestionarComicForm.controls.color.setValue(null);
    }

    /**
     * @description Metodo que obtiene los controles y sus propiedades
     * @author Diego Fernando Alvarez Silva
     */
    get f() {
        return this.gestionarComicForm.controls;
    }

    /**
     * @description metodo encargado de elimar comic mediante la posición de la lista
     * @author Pedro Aguirre Arias
     * @param posicion 
     */
    eliminarComic(comic: ComicDTO) {
        const swalWithBootstrapButtons = Swal.mixin({
            customClass: {
                confirmButton: 'btn btn-success',
                cancelButton: 'btn btn-danger'
            },
            buttonsStyling: false
        })

        swalWithBootstrapButtons.fire({
            title: 'Estás seguro?',
            text: "No podrás revertir esto!",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonText: 'Si, bórralo!',
            cancelButtonText: 'No, cancelar!',
            reverseButtons: true
        }).then((result) => {
            if (result.value) {
                let comicAux: ComicDTO = comic;
                this.gestionarComicService.eliminarComic(comic.id).subscribe(resultadoDTO =>{
                    if(resultadoDTO.exitoso){
                        swalWithBootstrapButtons.fire(
                            'Eliminado!',
                            'El comic: ' + comicAux.nombre + '  ha sido eliminado.',
                            'success'
                        )
                        this.consultarComics();
                    }else{
                        swalWithBootstrapButtons.fire(
                            'No se ha eliminado!',
                            'El comic: ' + comicAux.nombre + '  No ha sido eliminado.',
                            'success'
                        )
                    }
                });
            } else if (
                /* Read more about handling dismissals below */
                result.dismiss === Swal.DismissReason.cancel
            ) {
                swalWithBootstrapButtons.fire(
                    'Cancelado',
                    'Tu comic esta seguro :)',
                    'error'
                )
            }
        })
    }
}