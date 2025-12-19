package EjerciciosArrayBi;

public class Ejercicio_12 {
	/*
	 * Escribe un programa que guarde 20 números entre 100 y 999 generados
	 * aleatoriamente en un array de 4 filas por 5 columnas.
	 * 
	 * El programa mostrará las sumas parciales de filas y columnas igual que si de
	 * una hoja de cálculo se tratara.
	 * 
	 * La suma total debe aparecer en la esquina inferior derecha.
	 */

	public static void main(String[] args) {
		// int[][] num={{1, 2, 3, 4, 1}, {5, 6, 7, 8, 1}, {9, 10, 11, 12, 1}, {13, 14,
		// 15, 16, 1}};
		int[][] num = new int[4][5];
		int sumaFila = 0;
		int sumaFilaTot=0;
		int sumaColumna = 0;
		int sumaColumnaTot=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int) (Math.random() * (900) + 100);
			}
		}

		for (int i = 0; i < num.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "  ");
				sumaFila += num[i][j];
			}
			System.out.printf("|%5s\n", sumaFila);
		}
		System.out.println("------------------------------");
		for (int i = 0; i < num[0].length; i++) {
			sumaColumna = 0;
			for (int j = 0; j < num.length; j++) {
				sumaColumna += num[j][i];
			}
			sumaColumnaTot+=sumaColumna;
			System.out.printf("%2s", sumaColumna + " ");
		}
		System.out.printf("|%5s", sumaColumnaTot);

	}

}
