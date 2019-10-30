package com.hbt.semillero.pojo;

import java.util.List;

import com.hbt.semillero.dto.ComicDTO;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public class GestionarComicPOJO {

	private List<ComicDTO> listaComics;
	
	//TODO Continuar llenado el comidDTO 
	public void crearComicDTO() {
		ComicDTO comicDTO = new ComicDTO();
		
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public List<ComicDTO> getListaComics() {
		return listaComics;
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param listaComics
	 */
	public void setListaComics(List<ComicDTO> listaComics) {
		this.listaComics = listaComics;
	}
	
	
}
