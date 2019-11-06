import { Component, OnInit } from '@angular/core';

/**
 * Clase encargada de perfil
 * @author Pedro
 */
@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.css']
})
export class PerfilComponent implements OnInit {

  /**
   * objeto persona que contiene nombre y apellidos
   * @author Pedro
   */
  public persona: any = {nombre: 'Pedro', apellido: 'Aguirre Arias'};
  
  /**
   * Constructor dde la clase PerfilComponent
   */
  constructor() { }

  /**
   * metodo encargado de inicializar los objetos.
   */
  ngOnInit() {
    
  }

}
