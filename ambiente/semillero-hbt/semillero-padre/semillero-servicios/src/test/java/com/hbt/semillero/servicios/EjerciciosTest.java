package com.hbt.semillero.servicios;

import java.time.LocalDate;
import java.time.Month;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.pojo.EjerciciosPOJO;
import com.hbt.semillero.pojo.WaterBottle;

/**
 * 
 * <b>Descripción:<b> Clase que determina el test de la logica
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public class EjerciciosTest {
	

	
	@Test
	public static void ejercicioDos() {
		WaterBottle wb = new WaterBottle();
		System.err.println("Empty="+wb.empty);
		System.err.println("Empty="+wb.brand);
		//Sale error de compilación porque no se ha creado la clase WaterBottle
	}

	/**
	 * son validos A$B, _helloWorld, 
	 * 
	 * Metodo encargado de validar identificadores
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test
	public void validarIdentificadores() {
		String identificadorValido = "A$B";
		Assert.assertEquals(identificadorValido, identificadorValido);
	}
	
	/**
	 * 
	 * Metodo encargado de validar numeor primo
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test
	public void testEjercicioTres() {
		EjerciciosPOJO logica = new EjerciciosPOJO();
		boolean resultadoEsperado = logica.validarPrimo(5);
		boolean resultadoActual = true;
		Assert.assertEquals(resultadoActual, resultadoEsperado);
		
		resultadoEsperado = logica.validarPrimo(222);
		resultadoActual = false;
		Assert.assertEquals(resultadoActual, resultadoEsperado);
		
		resultadoEsperado = logica.validarPrimo(0);
		resultadoActual = false;
		Assert.assertEquals(resultadoActual, resultadoEsperado);
	}
	
	/**
	 * 
	 * Metodo encargado de validar un annio a partir de la fecha de nacimiento
	 * <b>Caso de Uso</b>
	 * @author pedro
	 *
	 */
	@Test
	public void validarAnnio() {
		int resultActaul = 2019;
		EjerciciosPOJO ejerciciosPOJO = new EjerciciosPOJO();
		int esperado = ejerciciosPOJO.validarFechaNacimiento(LocalDate.of(2017, Month.DECEMBER, 15), 23);
		Assert.assertEquals(resultActaul, esperado);
	}
}
