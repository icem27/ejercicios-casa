package EjerciciosArrayBi;

import java.util.Arrays;

public class Ejercicio_10 {
	/*
	 * Invertir una matriz de modo que todos los elementos de la fila de abajo pasen
	 * a estar arriba y viceversa. Mostrar las dos matrices. Probarlo con: {{1, 2,
	 * 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}
	 */

	public static void main(String[] args) {
		int[][] num={{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] num2= new int [num.length][num[0].length];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num2[i][j]=num[num[i].length-1-i][j];
			}
		}
		System.out.println(Arrays.deepToString(num));
		System.out.println(Arrays.deepToString(num2));
	}

}
