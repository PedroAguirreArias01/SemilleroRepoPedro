package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;

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
		
		//verifica si la cadena vacia invertida es ifgual
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
}
