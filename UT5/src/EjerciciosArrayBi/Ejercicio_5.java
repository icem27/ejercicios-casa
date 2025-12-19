package EjerciciosArrayBi;

import java.util.Arrays;

public class Ejercicio_5 {
	/*
	 * Dada la matriz bidimensional
	 * {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}}
	 * 
	 * obtener una matriz con la mitad de filas donde cada nueva fila sea la suma de
	 * dos filas consecutivas. (fila 0 + fila 1, fila 2 + fila 3, etc…)
	 */
	public static void main(String[] args) {
		int[][] array = {{2,5,7},{1,6,6},{1,1,1},{6,8,5},{3,6,4},{1,8,5}};
		int filas=array.length/2;
		int cols=array[0].length;
		int[][] arra2 = new int[filas][cols];
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<cols;j++) {
				arra2[i][j]=array[i*2][j]+array[i*2+1][j];
			}
		}
		
		System.out.println(Arrays.deepToString(arra2));
	}

}
