package EjerciciosArrayBi;

public class Ejercicio_6 {
	/*
	 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y
	 * asigna los valores según la siguiente tabla:
	 */

	public static void main(String[] args) {
		int[][] num = new int[3][6];
		num[0][0] = 0;
		num[1][0] = 75;
		num[0][1] = 30;
		num[2][1] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[0][5] = 5;
		num[2][5] = 11;
		
		System.out.printf("%6s", " ");
		for(int columna=0;columna<6;columna++) {
			System.out.printf("%5s", " Columna "+ columna);
		}
		
		for(int fila=0;fila<num.length;fila++) {
			System.out.print("\nFila " + fila);
			for(int columna=0;columna<num[fila].length;columna++) {
				System.out.printf("%10s", num[fila][columna]);
			}
			
		}
		
	}

}
