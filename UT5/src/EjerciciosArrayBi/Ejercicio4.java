package EjerciciosArrayBi;

public class Ejercicio4 {
	/*
	 * Dado el array unidimensional de enteros (por ejemplo
	 * {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3}) transformarlo en un array
	 * bidimensional donde cada cuatro elementos del primer array unidimensional
	 * forman una fila del segundo.
	 */

	public static void main(String[] args) {
		int[] array = {4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3} ;
		int[][] array1 = new int[6][4];
		int indice=0;
		
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j]=array[indice];
				System.out.print(array1[i][j]);
				indice++;
			}
			System.out.println();
		}
		
		
		
	}

}

	/* int[] numeritos={4,1,4,6,3,1,8,6,8,2,7,9,2,1,1,6,8,6,4,7,9,0,1,3}
	 * int col=4;
	 * int filas= numeritos.length/4;
	 * int [][] bi_numeritos = new int[filas][col];
	 * int posicionNumeritos=0;
	 * for(int i=0; i<filas; i++){
	 * 	for(int j=0; j<col; j++){
	 * 		bi_numeritos[i][j]=numeritos[posicionNumeritos];
	 * 		posicionNumeritos++;
	 * 		system.out.print(ni_numeritos[i][j]+" ");
	 * 	}
	 * 		system.out.println();
	 * }
	 * 
	 */
	  
