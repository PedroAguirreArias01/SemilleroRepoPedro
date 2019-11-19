package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.EstadoEnum;
import com.hbt.semillero.entidad.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	
	@Test(enabled=false)
	public void primeraPU() {
		Long resultadoEsperado = 150L;
		Long sumando1 = 100L;
		Long sumando2 = 50L;
		Long resultado = sumando1+sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
		resultadoEsperado = 200L;
		Assert.assertNotEquals(resultado, resultadoEsperado);
	}
	
	@Test(enabled=false)
	public void segundaPU() {
		//verifica que la cadena actual sea igual a la cadena esperada
		String actual = "abcde";
		String cadenaEsperada = "edcba";
		String resultadoCadena = invertirCadena(actual);
		Assert.assertEquals(resultadoCadena, cadenaEsperada);
		
		//se verifica que la cadena actual no sea igual a la esperada
		actual = "abcde hola";
		Assert.assertNotEquals(actual, cadenaEsperada);
		
		//verifica si la cadena vacia invertida es igual
		actual = " ";
		cadenaEsperada = " ";
		resultadoCadena = invertirCadena(actual);
		Assert.assertEquals(actual, resultadoCadena);
		
		//se verifica si la cadena vacia no es igual
		cadenaEsperada = "";
		Assert.assertNotEquals(actual, cadenaEsperada);
		
		actual = "098";
		int esperada = 890;
		resultadoCadena = invertirCadena(actual);
		Assert.assertEquals(resultadoCadena, esperada);
		
		//verifica que no son iguales las cadenas
		Assert.assertNotEquals(resultadoCadena, esperada);
		
		//verifica el objeto
		String cadena = "hola";
		Object esperado = "aloh";
		resultadoCadena = invertirCadena(cadena);
		Assert.assertEquals(resultadoCadena, esperado);
		Assert.assertNotEquals(resultadoCadena, esperado);
		
		
	}
	
	private String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + cadena.charAt(x);
        }
        return cadenaInvertida;
	}
	
	/**
	 * Modificar la clase AppTest.java y crear un método test
	 * que permita manipular el EstadoEnum, y validando las siguientes condiciones:
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test(enabled=false)
    public void terceraPU() {
       
        //Instanciar un enum de la clase EstadoEnum
        EstadoEnum estadoEnum = EstadoEnum.ACTIVO;
       
        //Devolver un String con el nombre de la constante (ACTIVO)
        String estadoAsString = estadoEnum.name();
       
        //Devolver un entero con la posición del enum según está declarada
        int posEstadoEnum = estadoEnum.ordinal();
       
        //Comparar el enum con el parámetro según el orden en el que están declarados lo enum
      
        int posEsperada = 0;
       
        //Assert para la posición de ACTIVO
        Assert.assertEquals(posEstadoEnum, posEsperada);
       
       
        //Assert para la posición de ACTIVO
        estadoEnum = EstadoEnum.INACTIVO;
        posEstadoEnum = estadoEnum.ordinal();
        posEsperada = 1;
               
        Assert.assertEquals(posEstadoEnum, posEsperada);
        
       //Devolver un array que contiene todos los enum
        EstadoEnum[] estados = EstadoEnum.values();
        for (EstadoEnum estadoEnum2 : estados) {
			System.out.println(estadoEnum2);
		}
    }
	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test(enabled=false)
	public void crearTestComic() {
		
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.crearComicDTO();
		Assert.assertNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().isEmpty());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() != 0);
	}
	

//	@Test(enabled=false)
//	public void creartComicDTOTest() {
//		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
//			
//		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTOComic("101", "Captain America Corps 1-5 USA", "Panini Comics", TematicaEnum.FANTASTICO, "BIBLIOTECA MARVEL", 128, new BigDecimal(5000), "Phillippe Briones, Roger Stern", Boolean.FALSE, LocalDate.now(), EstadoEnum.ACTIVO, 5L);
//		
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//
//		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
//		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 1);
//
//		comicDTO = new ComicDTO();
//
//		comicDTO.setId("100");
//		comicDTO.setNombre("Dragon ball Yamcha");
//		comicDTO.setEditorial("Planeta Cómic");
//		comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
//		comicDTO.setColeccion("Manga Shonen");
//		comicDTO.setNumeroPaginas(100);
//		comicDTO.setPrecio(new BigDecimal(2100));
//		comicDTO.setAutores("Dragon Garow Lee");
//		comicDTO.setColor(Boolean.TRUE);
//		comicDTO.setFechaVenta(LocalDate.now());
//		comicDTO.setEstado(EstadoEnum.ACTIVO);
//		comicDTO.setCantidad(20L);
//
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() > 1);
//
//		comicDTO = new ComicDTO();
//
//		comicDTO.setId("100");
//		comicDTO.setNombre("Dragon ball Yamcha");
//		comicDTO.setEditorial("Planeta Cómic");
//		comicDTO.setTematicaEnum(TematicaEnum.AVENTURAS);
//		comicDTO.setColeccion("Manga Shonen");
//		comicDTO.setNumeroPagina(100);
//		comicDTO.setPrecio(new BigDecimal(2100));
//		comicDTO.setAutores("Dragon Garow Lee");
//		comicDTO.setColor(Boolean.TRUE);
//		comicDTO.setFechaVenta(LocalDate.now());
//		comicDTO.setEstado(EstadoEnum.ACTIVO);
//		comicDTO.setCantidad(20L);
//
//		gestionarComicPOJO.agregarComicDTO(comicDTO);
//
//		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
//	}
	
	/**
	 * 
	 * Metodo encargado de comparar cadenas mediante el igual 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test(enabled = false)
	public void comparandoCadenas() {
		String s1 = "street";
		String s2;
		s2 = new String("street");
		//if (s1 == s2) {
			Assert.assertTrue(s1 == s2);
		//}
		
	}
	
	@Test(enabled=false)
	public void ComparandoCadena2() {
		String s1 = "street";
		String s2;
		s2 = new String("street");
		Assert.assertEquals(s1, s2);
	}
	
	/**
	 * 
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	public void agregarComidDTO() {
		
	}
	
	//TODO
	/**
	 * pedrinete hacer un metodo que use el metodo toString de la entidad comic
	 */
	
}
