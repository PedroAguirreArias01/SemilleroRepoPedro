import { Component, OnInit } from '@angular/core';
import { GestionarComicService } from '../../services/gestionar.comic.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FacturaDTO } from '../../dto/factura.dto';
import { ComicDTO } from '../../dto/comic.dto';
import { FacturaDetalleDTO } from '../../dto/facturaDetalle.dto';
import { GestionarPedidoService } from '../../services/GestionarPedidoService';
import { ProveedorDTO } from '../../dto/proveedor.dto';
import { PersonaDTO } from '../../dto/persona.dto';
/**
 * @description Componente Gestionar pedido el cual contiene la logica del pedido
 * @author Pedro Aguirre Arias
 */
@Component({
  selector: 'gestionarPedido',
  templateUrl: './gestionar-pedido.component.html',
  styleUrls: ['./gestionar-pedido.component.css']
})
export class GestionarPedidoComponent implements OnInit {

  /**
   * Atributo que contiene los controles del formulario factura
   */
  public gestionarFacturaForm: FormGroup;

  /**
     * Atributo que contendra la lista de comics creados
     */
  public listaComics: Array<ComicDTO>;

  /**
   * Lista de facturas
   */
  public facturas: Array<FacturaDTO> = [];

  /**
   * Atributo que representa los clintes
   */
  public listaClientes: Array<PersonaDTO> = [];

  /**
   * Atributo que representa los proveedores
   */
  public listaProveedores: Array<ProveedorDTO> = [];

  /**
   * Atributo detalle 
   */
  public facturaDetalle: FacturaDetalleDTO;

  /**
   * Atributo que define la factura
   */
  public facturaDTO: FacturaDTO;

  /**
   * Atributo que define el proveedor
   */
  public proveedor: ProveedorDTO;

   /**
   * id que se autoincrementara para ser asignado como id de la fatnura
   * ya que en el backend no se tiene un auto-increment
   */
  public id: number = 0;

  /**
   * @description contructor de la calse GestionarPedidoComponent
   * @param gestionarComicService 
   * @param fb 
   * @param router 
   */
  constructor(private gestionarComicService: GestionarComicService, private fb: FormBuilder,
    private router: Router, private gestionarPedidoService: GestionarPedidoService) {
    this.gestionarFacturaForm = this.fb.group({
      cliente: [null],
      proveedor: [null],
      tipoFactura: [null],
      estadoFactura: [null],
      cantidadComic:[null,Validators.required],
      comic: [null], 
      detalle: [null] 
    });

  }

   /**
     * @description Evento angular que se ejecuta al invocar el componente
     * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
     */
  ngOnInit() {
    this.consultarComics();

    /**
     * se encarga de consultar todos los proveedores que hay en la base de datos
     */
    this.gestionarPedidoService.getProveedores().subscribe(
      proveedores => this.listaProveedores = proveedores
    );

  }
    /**
     * Consulta todos los pedidos que se encuentran en la base de datos
     * @author pedro Aguirre Arias
     */
  consultarPedidos(){
 
    this.gestionarPedidoService.consultarPedidos().subscribe(
      facturas => {
        this.facturas = facturas
      }
    );
  }

  /**
     * @description Metodo encargado de consultar los comics existentes para 
     * seleccionarlos y agrgarlos al detalle de la factura
     * @author pedro Aguirre Arias
     */
    public consultarComics(): void {
      this.gestionarComicService.consultarComics().subscribe(listaComics => {
          this.listaComics = listaComics;
      }, error => {
          console.log(error);
      });
  }

  realizarPedido() {
    if (this.facturaDTO.facturaDetalle.length == 0) {
      //Vuelve invalido el formulario para que no haga el submit
      alert("La factura esta sin detalles")
    } else{
      this.facturaDTO.id = this.id++;
      this.facturaDTO.cliente = this.gestionarFacturaForm.controls.cliente.value;
      this.facturaDTO.estadoFacturaEnum = this.gestionarFacturaForm.controls.estadoFactura.value;
      this.facturaDTO.tipoFacturaEnum = this.gestionarFacturaForm.controls.tipoFactura.value;
      this.facturaDTO.proveedor = this.gestionarFacturaForm.controls.proveedor.value;
      this.facturaDTO.facturaDetalle = this.gestionarFacturaForm.controls.detalle.value;
      this.gestionarPedidoService.crearPedido(this.facturaDTO).subscribe(resultadoDTO =>{
        this.consultarPedidos();
      }, error => {
        console.log(error);
    });
    }
  }
}
