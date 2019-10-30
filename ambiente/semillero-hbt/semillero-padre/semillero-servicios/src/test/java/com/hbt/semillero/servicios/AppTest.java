package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.entidades.EstadoEnum;

public class AppTest {

	public void shouldAnswerWithTrue() {

	}
	
	@Test
	public void primeraPU() {
		Long resultadoEsperado = 150L;
		Long sumando1 = 100L;
		Long sumando2 = 50L;
		Long resultado = sumando1+sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
		resultadoEsperado = 200L;
		Assert.assertNotEquals(resultado, resultadoEsperado);
	}
	
	@Test
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
	@Test
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
	
	//TODO
	/**
	 * pedrinete hacer un metodo que use el metodo toString de la entidad comic
	 */
	
}
