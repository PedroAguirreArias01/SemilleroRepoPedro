package com.hbt.semillero.pojo;

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
	
}
