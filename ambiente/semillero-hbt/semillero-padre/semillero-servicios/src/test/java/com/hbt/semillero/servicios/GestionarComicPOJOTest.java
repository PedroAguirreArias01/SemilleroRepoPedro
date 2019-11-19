/**
 * GestionarComicPOJOTest.java
 */
package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.EstadoEnum;
import com.hbt.semillero.entidad.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

/**
 * <b>Descripción:<b> Clase que determina las pruebas de la clase gestionar comic
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version 
 */
public class GestionarComicPOJOTest {

	/**
	 * 
	 * Metodo encargado de hacer las pruebas de crear comic
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
//	@Test(enabled=false)
//	public void crearComicDTOTest() {
//		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
//
//		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTOComic("1", "Dragon Ball Yamcha", "Planeta C�mic", TematicaEnum.AVENTURAS,
//				"Manga Shonen", 144, new BigDecimal(2100), "Dragon Garow Lee", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO,
//				20L);
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//		
//		//prueba de validacion para verfcar si se agrego a la lista 
//		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
//		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 1);
//
//		comicDTO = new ComicDTO();
//
//		comicDTO.setId("2");
//		comicDTO.setNombre("Captain America Corps 1-5 USA");
//		comicDTO.setEditorial("Panini Comics");
//		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
//		comicDTO.setColeccion("BIBLIOTECA MARVEL");
//		comicDTO.setNumeroPagina(128);
//		comicDTO.setPrecio(new BigDecimal(5000));
//		comicDTO.setAutores("Phillippe Briones, Roger Stern");
//		comicDTO.setColor(Boolean.FALSE);
//		comicDTO.setFechaVenta(LocalDate.now());
//		comicDTO.setEstado(EstadoEnum.ACTIVO);
//		comicDTO.setCantidad(5L);
//
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//
//		//Se prueba que se haya agregado el elemento
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 2);
//
//		comicDTO = new ComicDTO();
//
//		comicDTO.setId("3");
//		comicDTO.setNombre("The Spectacular Spider-Man v2 USA");
//		comicDTO.setEditorial("Panini Comics");
//		comicDTO.setTematicaEnum(TematicaEnum.FANTASTICO);
//		comicDTO.setColeccion("MARVEL COMICS");
//		comicDTO.setNumeroPagina(208);
//		comicDTO.setPrecio(new BigDecimal(6225));
//		comicDTO.setAutores("Straczynski,Deodato Jr.,Barnes,Eaton");
//		comicDTO.setColor(Boolean.TRUE);
//		comicDTO.setFechaVenta(LocalDate.now());
//		comicDTO.setEstado(EstadoEnum.INACTIVO);
//		comicDTO.setCantidad(0L);
//
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//
//		//Se prueba que se haya agregado el elemento
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
//
//		// nombre nuevo que se le va a asignar al comic
//		String nuevoNombre = "Nuevo nombre comic";
//		gestionarComicPOJO.modificarComicDTO("2", nuevoNombre);
//	
//		//se verifica el cambio del comic
//		Assert.assertEquals(gestionarComicPOJO.getListaComics().get(2).getNombre(), nuevoNombre);
//		
//		// se elimina el comic con id 1
//		gestionarComicPOJO.eliminarComicDTOPorId("1");
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 2);
//
//	}
}
