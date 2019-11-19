import { Injectable } from '@angular/core';
import { Injector } from "@angular/core";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ComicDTO } from '../dto/comic.dto';
import { AbstractService } from '../services/template.service';
import { FacturaDTO } from '../dto/factura.dto';
import { ProveedorDTO } from '../dto/proveedor.dto';
import { PersonaDTO } from '../dto/persona.dto';

/**
 * @description Servicio encargado de llamar a los servicios REST de gestionar pedido
 * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
 */
@Injectable({
  providedIn: 'root'
})
export class GestionarPedidoService {

  public urlEndPoint: string = "http://localhost:8085/semillero-servicios/rest/GestionarPedido/";
  /**
   * Constructor de la clase
   */
  constructor(injector: Injector, private httpClient : HttpClient) {
  }
  
  /**
   * @description Metodo encargado de invocar el servicio REST consultar los pedidos
   * @author Pedro Aguirre Arias
   */
  public consultarPedidos(): Observable<any> {
    return this.httpClient.get(this.urlEndPoint+'consultarComics');
  }

  /**
   * @description Metodo encargado de invocar el servicio REST crear comic
   * @author Pedro Aguirre Arias
   * @param facturaDTO contiene la informacion del la factura a persistir
   */
  public crearPedido(facturaDTO : FacturaDTO): Observable<any> {
    return this.httpClient.post(this.urlEndPoint+'crear',facturaDTO);
  }

  /**
   * @description Metodo encargado de eliminar una factura mediante el id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   */
  public eliminarFactura(idFactura: number): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'eliminar',idFactura);
  }

  /**
   * @description Metodo encargado de modificar el nombre del comic mediante el id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   * @param nombre 
   */
  public modificarFactura(idComic: string, cantidadComics: number, nombreProveedor: string, idFactura: number): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'modificarPedido',{"idComic": idComic, "cantidadComics": cantidadComics, "nombreProveedor": nombreProveedor, "idFactura": idFactura});
  }

   /**
   * @description Metodo encargado de consultar una factura por id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idFactura 
   * @param nombre 
   */
  public consultarForID(idFactura: number): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'consultarComic',idFactura);
  }

   /**
   * @description Metodo encargado de modificar el comic
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   * @param nombre 
   */
  public editar(comic: ComicDTO): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'editar',comic);
  }

  /**
   * @description Metodo encargado de obtener los proveedores
   * @author Pedro Aguirre Arias
   */
  public getProveedores(): Observable<any>{
    return this.httpClient.get(this.urlEndPoint+"consultarProveedores");
  }

  /**
   * @description Metodo que se encarga de consultar las personas que estan 
   * en la base de datos.
   * @author Pedro Aguirre Arias
   */
  public consultarPersonas(): Observable<any>{
    return this.httpClient.get(this.urlEndPoint+"consultarPersonas");
  }

  /**
   * @description Metodo encargado de crear un proveedor
   * @param proveedorDTO 
   */
  public crearProveedor(personaDTO: PersonaDTO): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+"crearProveedor", personaDTO);
  }

}
