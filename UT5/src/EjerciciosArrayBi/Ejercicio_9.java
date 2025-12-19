package EjerciciosArrayBi;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_9 {
	/*
	 * Crea una tabla bidimensional de longitud 3x3 y nombre 'matriz'. Carga la
	 * tabla con valores numéricos enteros introducidos por teclado Obtiene la
	 * matriz traspuesta (filas X columnas) guardando valores en nueva matriz
	 * llamada “matrizT” Muestra ambas matrices por pantalla
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int[][] matrizT = new int[matriz.length][matriz[0].length];
		
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println("Introduce el valor de la fila " + i + " y de la columna " + j);
				matriz[i][j]=leer.nextInt();
			}
		}
		leer.close();
		System.out.println("==== MATRIZ ORIGINAL ====");
		for(int i=0;i<matriz.length;i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
		for(int i=0;i<matrizT.length;i++) {
			for(int j=0;j<matrizT[i].length;j++) {
				matrizT[j][i]=matriz[i][j];
			}
		}
		System.out.println("=== MATRIZ TRASPUESTO ===");
		for(int i=0;i<matrizT.length;i++) {
			System.out.println(Arrays.toString(matrizT[i]));
		}
	}

}
