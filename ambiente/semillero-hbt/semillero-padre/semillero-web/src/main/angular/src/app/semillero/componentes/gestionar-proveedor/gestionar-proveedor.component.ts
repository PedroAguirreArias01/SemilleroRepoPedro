import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { PersonaDTO } from '../../dto/persona.dto';
import { ProveedorDTO } from '../../dto/proveedor.dto';
import { GestionarPedidoService } from '../../services/GestionarPedidoService';
import { Router } from '@angular/router';
/**
 * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
 * @description Clase que se encarga de gestionar los proveedores
 */
@Component({
  selector: 'gestionar-proveedor',
  templateUrl: './gestionar-proveedor.component.html',
  styleUrls: ['./gestionar-proveedor.component.css']
})
export class GestionarProveedorComponent implements OnInit {

   /**
    * Atributo que contiene los controles del formulario
    */
   public gestionarPersonaForm: FormGroup;

     /**
   * Atributo que contendra la informacion de la persona
   */
  public persona: PersonaDTO;

  /**
   * lista de personas que se tienen en la base de datos
   */
  public listaPersonas: Array<PersonaDTO>;

  /**
   * lista de usuarios que se tienen en la base de datos
   */
  public listaProveedores: Array<ProveedorDTO>;

  /**
   * id que se autoincrementara para ser asignado como id de persona y al roveedor
   */
  public id: number = 0;
  
  /**
   * contructor de la clase GestionarProveedorComponent
   */
  constructor(private gestionarPedidoService: GestionarPedidoService,private fb: FormBuilder,
    private router: Router ) {
      this.gestionarPersonaForm = this.fb.group({
        nombre: [null, Validators.required],
        numIdentificacion: [null, Validators.required]
      });
     }

   /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
     */
  ngOnInit() {
    this.persona = new PersonaDTO();
    this.listaPersonas = new Array<PersonaDTO>();
    this.listaProveedores = new Array<ProveedorDTO>();

    
  }

  /**
   * @description metodo encargado de cargar las listas con la informacion que esta en la base de datos
   */
  cargarListas(){
    this.gestionarPedidoService.getProveedores().subscribe(data => {
      this.listaProveedores = data;
    });
    this.gestionarPedidoService.consultarPersonas().subscribe(data => {
      this.listaPersonas = data;
    });
  }

  /**
   * @description metodo que crea una persona y luego llama al servicio que la añade a la 
   * base de datos y que posteriormente crea un proveedor con dicha persona
   * @author Pedro Arias Arias
   */
  crearPersonaYProveedor(): void {
    this.persona = new PersonaDTO();
    this.persona.id = this.id++;
    this.persona.nombre = this.gestionarPersonaForm.controls.nombre.value;
    this.persona.numIdentificacion = this.gestionarPersonaForm.controls.numIdentificacion.value;
    this.gestionarPedidoService.crearProveedor(this.persona).subscribe(data => {
      this.cargarListas();
    });
    this.limpiarFormulario();
  }

  /**
  * metodo que permite limpiar el formulario
  * @author Pedro Aguirre Arias
  */
  private limpiarFormulario(): void {
    this.gestionarPersonaForm.controls.SCNOMBRE.setValue(null);
    this.gestionarPersonaForm.controls.SCNUMIDENTIFICACION.setValue(null);
  }

}
