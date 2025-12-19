package ArraysBi2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		char[][] barco = { { 'X', 'X', 'O', 'O', 'O' }, { 'O', 'O', 'X', 'O', 'O' }, { 'X', 'O', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'O' }, { 'X', 'O', 'X', 'O', 'O' } };
		int filaUsuario = 0;

		for (int fila = 0; fila < barco.length; fila++) {
			for (int columna = 0; columna < barco[fila].length; columna++) {
				System.out.printf("%2c |", barco[fila][columna]);
			}
			System.out.println();
		}

		do {
			System.out.println("Introduce la fila y columna que deseas: ");
			filaUsuario = leer.nextInt();
			int columnaUsuario = leer.nextInt();

			if (filaUsuario < 0 || filaUsuario > 6 && columnaUsuario < 0 || columnaUsuario > 6) {
				System.out.println("Debes introducir un número valido. ");
				break;
			}

			char letra = barco[filaUsuario][columnaUsuario];
			if (barco[filaUsuario][columnaUsuario] == 'X') {
				System.out.println("Has derribado el barco");
				barco[filaUsuario][columnaUsuario] = 'T';
			} else if (barco[filaUsuario][columnaUsuario] == 'O') {
				System.out.println("Agua");
			} else {
				System.out.println("Posición ya cubierta");
			}

			for (int fila = 0; fila < barco.length; fila++) {
				for (int columna = 0; columna < barco[fila].length; columna++) {
					System.out.printf("%2c |", barco[fila][columna]);
				}
				System.out.println();
			}
		} while (filaUsuario > -1);

	}

}
