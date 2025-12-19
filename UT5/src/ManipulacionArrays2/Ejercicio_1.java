package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_1 {
	/*
	 * Dado el siguiente array de Strings [“tren”, “coche”, “barco”, “avioneta”]
	 * obtener otro de enteros y del mismo tamaño pero que en cada posición esté la
	 * longitud de cada String.
	 */

	public static void main(String[] args) {
		String[] palabras = {"tren", "coche", "barco", "avioneta"};
		int[] num = new int[palabras.length];
		
		for(int i=0;i<num.length;i++) {
			num[i]=palabras[i].length();
		}
		System.out.println(Arrays.toString(num));

	}

}
