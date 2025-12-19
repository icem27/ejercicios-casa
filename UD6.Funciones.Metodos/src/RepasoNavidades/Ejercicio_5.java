package RepasoNavidades;

import java.util.Arrays;

public class Ejercicio_5 {
	/*
	 * Hacer un programa con las funciones:
	 * 
	 * generarArray(): genera un array unidimensional de un tamaño aleatorio entre 5
	 * y 10 (incluidos) y lo devuelve. 
	 * rellenaArray(): rellena un array pasado como
	 * parámetro de números aleatorios enteros entre 10 y 200 (incluidos)
	 * mostrarArray():ordena un array de mayor a menor y lo muestra por consola. El
	 * programa ejecutará estas 3 funciones en orden, de manera que el resultado
	 * final sea mostrar el array.
	 * 
	 * Ejemplo de ejecución:
	 * 
	 * [200, 198, 181, 134, 133, 47]
	 */

	public static void main(String[] args) {
		generarArray();
		int[] array = rellenaArray(generarArray());
		System.out.print("Array aleatoriamente: ");
		System.out.println(Arrays.toString(array));
		mostrarArray(array);

	}
	public static int[] generarArray() {
		int tam = (int)(Math.random()*(10-5+1)+5);
		int[] array = new int[tam];
		return array;
	}
	public static int[] rellenaArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			int aleatorio=(int)(Math.random()*(200-10+1)+10);
			array[i]=aleatorio;
		}
		return array;
	}
	public static void mostrarArray(int[] array) {
		Arrays.sort(array);
		System.out.println("Array ascendente " + Arrays.toString(array));
		for(int i=0;i<array.length/2;i++) {
			int ultimo = array[array.length-i-1];
			int primero = array[i];
			array[i]=ultimo;
			array[array.length-i-1]=primero;
		}
		System.out.println("Array descendente " + Arrays.toString(array));
	}

}
