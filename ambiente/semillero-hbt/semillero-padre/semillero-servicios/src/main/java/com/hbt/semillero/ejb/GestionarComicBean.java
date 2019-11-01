package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.Comic;

/**
 * 
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
@Stateless
public class GestionarComicBean {

	@PersistenceContext
	private EntityManager entityManager;
	
	/**
	 * 
	 * Metodo encargado de crear un comic y persistirlo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param comicDTO
	 */
	//TODO agregar interfaz
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());
		comic.setAutores(comicDTO.getAutores());
		//llenar todos los campos 
		entityManager.persist(comic);
	}
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void modificarComic(ComicDTO comicDTOModificar) {
		Comic comic = new Comic();
		comic.setId(comicDTOModificar.getId());
		entityManager.merge(comic);
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ComicDTO consultarComic(String idComic) {
		Comic comic = entityManager.find(Comic.class, idComic);
		ComicDTO comicDTO = new ComicDTO(comic.getId(), comic.getNombre());
		return comicDTO;
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<ComicDTO> consultarComicAll(String idComic) {
		List<Comic> resultados = (List<Comic>) entityManager.createQuery("select c from Comic").getResultList();
		return null;
	}
	
}
