package ArraysBi2;

import java.util.Arrays;

public class Ejercicio_3 {
	/*
	 * Crea un programa que sume 2 arrays bidimensionales y obtenga y muestre como
	 * resultado un array bidimensional de manera que sume los elementos siempre que
	 * pueda (si existen en ambos arrays). Si algún elemento no existe en alguno de
	 * los arrays tómalo como 0.
	 */

	public static void main(String[] args) {
		int[][] a = { { 9, 7, 3, 4 }, { 2, 5, 2, 1, 9, 7 }, { 1, 9, 8 } };
		int[][] b = { { 1, 2 }, { 2, 5, 9, 1, 4 }, { 2, 8, 5 }, { 4, 5 } };
		int maxFilas = Math.max(a.length, b.length);
		int minFilas = Math.min(a.length, b.length);
		int[][] suma = new int[maxFilas][];
		int columnas = 0;
		int colMax = 0;
		for (int i = 0; i < maxFilas - 1; i++) {
			columnas = Math.max(a[i].length, b[i].length);
			if (columnas > colMax) {
				colMax = columnas;
			} else {
				colMax = columnas;
			}
			suma[i] = new int[colMax];
		}

            		for (int fila = minFilas; fila < maxFilas; fila++) {
			if (maxFilas == a.length) {
				suma[fila] = new int[a[fila].length];
			} else {
				suma[fila] = new int[b[fila].length];
			}
		}

		for (int fila = 0; fila < a.length; fila++) {
			for (int col = 0; col < a[fila].length; col++) {
				suma[fila][col] = a[fila][col];
			}
		}
		
		for (int fila = 0; fila < b.length; fila++) {
			for (int col = 0; col < b[fila].length; col++) {
				suma[fila][col] += b[fila][col];
			}
		}
		
		System.out.println(maxFilas + " " + columnas + " " + colMax);
		System.out.println(Arrays.deepToString(suma));
                

	}

}
