package com.hbt.semillero.rest;


import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.ejb.IGestionarComicLocal;

/**
 * 
 * <b>Descripción:<b> Clase que determina la gestion de comics
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Path("/GestionarComic")
public class GestionarComicRest {

	//atributo del EJB 
	@EJB
	private IGestionarComicLocal gestionarComicEJB;
	
	/**
	 * Metodo encargado de se define el metodo saludo definiendo el tipo de dato que se va a retornar
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	@GET
	@Path("/Saludo")
	@Produces
	public String miPrimerRest() {
		return "Hello world";
	}
	
	/**
	 * 
	 * Metodo encargado de consular el comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param idComic
	 * @return
	 */
	@GET
	@Path("/consultarComic")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ComicDTO consultarComic(@QueryParam("idComic") Long idComic) {
		if (idComic != null) {
			return gestionarComicEJB.consultarComic(idComic.toString());
		}
		return null;
	}
}

