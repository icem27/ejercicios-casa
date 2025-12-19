package EjerciciosArrayBi;

public class Ejercicio3 {
	/*
	 * En una matriz de enteros obtener cual es el elemento mayor.
	 */

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 2, 4, 5 }, { 6, 7, 7, 9, 10 }, { 21, 22, 25, 4, 2 }, { 1, 2, 3, 4, 3 },
				{ 16, 17, 2, 19, 20 } };
		int numMayor = array[0][0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > numMayor) {
					numMayor = array[i][j];
				}
			}
		}
		System.out.println(numMayor);
	}

}
