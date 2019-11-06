import { Component, OnInit } from '@angular/core';

/**
 * @description Componente bienvenida, el cual contiene la imagen de bienvenida al semillero
 * 
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Component({
  selector: 'bienvenida',
  templateUrl: './bienvenida-component.html',
})
export class BienvenidaComponent {

  //url de la imagen de bienvenida
  public urlImagen : string;

  ngOnInit(): void {
    this.urlImagen = "https://www.elempleo.com/sitios-empresariales/colombia/heinsohn-business-technology/img/elempleo-02.jpg";
  }

  /**
   * funcion que recibe por parametro el nombre 
   * @author Pedro
   * @param parametroEvento
   */
  public ejecucionEventoClick(parametroEvento: any): void{
    alert("Hola: "+ parametroEvento);
  }
}