package com.hbt.semillero.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;

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
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	public void crearComicDTO() {
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId("100");
        comicDTO.setNombre("Dragon Ball Yamcha");
        comicDTO.setEditorial("Planeta C�mic");
        comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
        comicDTO.setColeccion("Manga Shonen");
        comicDTO.setNumeroPagina(100);
        comicDTO.setPrecio(new BigDecimal(2100));
        comicDTO.setAutores("Dragon Garow Lee");
        comicDTO.setColor(Boolean.FALSE);
        comicDTO.setFechaVenta(LocalDate.now());
        comicDTO.setEstado(EstadoEnum.ACTIVO);
        comicDTO.setCantidad(20L);
        if (listaComics == null) {
			listaComics = new ArrayList<ComicDTO>();
		}
        listaComics.add(comicDTO);
	}
	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematica
	 * @param coleccion
	 * @param numeroPagina
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estado
	 * @param cantidad
	 * @return
	 */
	public ComicDTO crearComicDTOComic(String id, String nombre, String editorial, TematicaEnum tematica, String coleccion, Integer numeroPagina,
			BigDecimal precio, String autores, Boolean color, LocalDate fechaVenta, EstadoEnum estado, Long cantidad) {
		ComicDTO comicDTO = new ComicDTO(id, nombre, editorial, tematica, coleccion, numeroPagina, precio, autores, color, fechaVenta, estado, cantidad);
		return comicDTO;
	}
	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param comicDTO
	 */
	public void agregarComicDTO(ComicDTO comicDTO) {
		if(listaComics == null) {
			listaComics= new ArrayList<ComicDTO>();
		}
		listaComics.add(comicDTO);
	}

	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param id
	 * @param nombre
	 */
	public void modificarComicDTO(String id, String nombre) {
		ComicDTO comicModificar = null;
		for (int i = 0; i < listaComics.size(); i++) {
			comicModificar = listaComics.get(i);
			if (comicModificar.getId().equals(id)) {
				comicModificar.setNombre(nombre);
			}
		}
	}
	
	
	/**
	 * 
	 * Metodo encargado de eliminar un comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param id
	 */
	public void eliminarComicDTOPorId(String id) {
		int size = this.listaComics.size();
		int pos = 0;
		while (pos<=size) {
			if (this.listaComics.get(pos).getId().equals(id)) {
				this.listaComics.remove(pos);
				return;
			}
			pos++;
		}
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
