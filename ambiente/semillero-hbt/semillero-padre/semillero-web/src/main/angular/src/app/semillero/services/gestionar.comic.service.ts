import { Injectable } from '@angular/core';
import { Injector } from "@angular/core";
import { Observable } from 'rxjs';
import 'rxjs/add/operator/toPromise';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ComicDTO } from '../dto/comic.dto';
import { AbstractService } from '../services/template.service';

/**
 * @description Servicio encargado de llamar a los servicios REST de gestionar comic
 * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
 */
@Injectable({
  providedIn: 'root'
})
export class GestionarComicService {

  public urlEndPoint: string = "http://localhost:8085/semillero-servicios/rest/GestionarComic/";
  /**
   * Constructor de la clase
   */
  constructor(injector: Injector, private httpClient : HttpClient) {
  }
  
  /**
   * @description Metodo encargado de invocar el servicio REST consultar comics
   * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
   */
  public consultarComics(): Observable<any> {
    return this.httpClient.get(this.urlEndPoint+'consultarComics');
  }

  /**
   * @description Metodo encargado de invocar el servicio REST crear comic
   * @author Diego Fernando Alvarez Silva <dalvarez@heinsohn.com.co>
   * @param comicDTO contiene la informacion del comic a persistir
   */
  public crearComic(comicDTO : ComicDTO): Observable<any> {
    return this.httpClient.post(this.urlEndPoint+'crear',comicDTO);
  }

  /**
   * @description Metodo encargado de eliminar un comic mediante el id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   */
  public eliminarComic(idComic: number): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'eliminar',idComic);
  }

  public eliminar(idComic: number): Observable<any>{
    let url = "http://localhost:8085/semillero-servicios/rest/GestionarComic/eliminarComic?idComic=";
    return this.httpClient.delete(`${url}${idComic}`);
  }

  /**
   * @description Metodo encargado de modificar el nombre del comic mediante el id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   * @param nombre 
   */
  public modificarComic(idComic: string, nombre: string): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'modificar',{"idComic": idComic, "nombre": nombre});
  }

   /**
   * @description Metodo encargado de consultar comic por id
   * @author Pedro Aguirre Arias <pedro.aguirre@uptc.edu.co>
   * @param idComic 
   * @param nombre 
   */
  public consultarForID(idComic: number): Observable<any>{
    return this.httpClient.post(this.urlEndPoint+'consultarComic',idComic);
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

}
