package RepasoJedi;

import java.util.Arrays;

public class Ejercicio_7 {
	/*
	 * Escribe un programa que cree un array del tamaño indicado por teclado y luego
	 * lo rellene con valores aleatorios (utiliza Math.random()).
	 * 
	 * Implementa la función que rellena un array con valores aleatorios.
	 */

	public static void main(String[] args) {
		int tam = 5;
		int[] array = aleatorio(tam);
		System.out.println(Arrays.toString(array));

	}
	
	public static int[] aleatorio(int tam) {
		int[] array = new int[tam];
		
		for(int i=0;i<array.length;i++) {
			int random = (int)(Math.random()*101);
			array[i]=random;
		}
		
		
		return array;
	}

}
