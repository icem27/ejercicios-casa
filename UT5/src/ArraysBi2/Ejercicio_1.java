package ArraysBi2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {
	/*
	 * Crea un programa que administre un array bidimensional de 5 filas, pero
	 * irregular :
	 * 
	 * la primera fila tendrá una columna la segunda fila tendrá dos columnas y así
	 * sucesivamente hasta que la última fila tenga cinco columnas. Realiza la carga
	 * de datos por teclado e imprime posteriormente los valores del array.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[][] matriz = new int[5][];

		for (int fila = 0; fila < matriz.length; fila++) {
			matriz[fila] = new int[fila + 1];
		}

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.println("Introduce el elemento " + fila + "x" + col + ":");
				matriz[fila][col] = leer.nextInt();
			}
		}
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.printf("%4d", matriz[fila][col]);
			}
			System.out.println();
		}

	}

}
