package EjerciciosArrayBi;

public class Ejercicio_7 {
	/*
	 * Crea una matriz de 10x10 (filas x columnas) y nombre 'tabla'. Carga la matriz
	 * de manera que las filas pares se rellenan con 1 y las filas impares con 0.
	 * Una vez inicializada la matriz muestra su contenido en pantalla.
	 */

	public static void main(String[] args) {
		int[][] tabla = new int[10][10];
		int fila = tabla[0].length;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < fila; j++) {
				if (j % 2 == 0) {
					tabla[i][j] += 1;
				} else {
					tabla[i][j] += 0;
				}

				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

	}

}
