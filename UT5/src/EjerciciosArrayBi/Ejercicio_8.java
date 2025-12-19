package EjerciciosArrayBi;

import java.util.Arrays;

public class Ejercicio_8 {
	/*
	 * Invertir una matriz de modo que todos los elementos de la derecha pasen a
	 * estar a la izquierda y viceversa. Mostrar las dos matrices. Probarlo con:
	 * {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}
	 */

	public static void main(String[] args) {
		int[][] num= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] num2= new int[4][4];
		
		System.out.println("===== ARRAY ORIGINAL =====");
		for(int i=0;i<num.length;i++) {
			System.out.println(Arrays.toString(num[i]));
		}
		System.out.println("===== ARRAY INVERSO ======");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num2[i][j]=num[i][num.length-j-1];
			}
		}
		for(int i=0;i<num2.length;i++) {
			System.out.println(Arrays.toString(num2[i]));
		}
	}

}
