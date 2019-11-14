package com.hbt.semillero.pojo;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * <b>Descripción:<b> Clase que determina la logica de los ejercicios
 * <b>Caso de Uso:<b> 
 * @author pedro
 * @version
 */
public class EjerciciosPOJO {

	public EjerciciosPOJO() {
		// TODO Auto-generated constructor stub
	}
	
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	/**
	 * 
	 * Metodo encargado de validar numeros primos
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param numero
	 * @return
	 */
	public boolean validarPrimo(int numero) {
		boolean result = false;
		if (numero%1 == 0 && numero%numero == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 
	 * Metodo encargado de validar fecha nacimiento
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param fechaNacimiento
	 * @return
	 */
	public int validarFechaNacimiento(LocalDate fechaNacimiento, int numeroAnnios) {
		return fechaNacimiento.getYear()+numeroAnnios;
	}
	
	/**
	 * agrega los numeros a la lista
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param numero
	 */
	public void addNumeros(int numero) {
		list.add(numero);
	}

	/**
	 * ordenar lista
	 * Metodo encargado de 
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @param lista
	 * @return
	 */
	public int[] ordenarLista(ArrayList<Integer> lista) {
		int[] aux = new int[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			aux[i] = lista.get(i);
		}
		Arrays.sort(aux);
		return aux;
	}
	
	/**
	 * 
	 * Metodo encargado de restorna la lista
	 * <b>Caso de Uso</b>
	 * @author pedro
	 * 
	 * @return
	 */
	public ArrayList<Integer> getList() {
		return list;
	}
	
	
}
