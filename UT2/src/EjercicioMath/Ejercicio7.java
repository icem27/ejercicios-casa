package EjercicioMath;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * Realiza un programa en Java que reciba por teclado dos números y devuelva un
	 * número aleatorio entero entre el primero y el segundo (ambos incluidos). Se
	 * asume que el primer número nunca será mayor que el segundo. Por tanto si es
	 * mayor, deberá repetirse la pregunta hasta que se cumpla la condición
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numMayor, numMenor;

		do {
			System.out.println("Introduce el primer número: ");
			numMayor = leer.nextInt();

			System.out.println("Introduce el segundo número: ");
			numMenor = leer.nextInt();

			if (numMayor < numMenor) {
				System.out.println("Error, el primer número debe ser mayor que el segundo");
			}
		} while (numMayor < numMenor);

			int numFinal = (int) (Math.random() * ((numMayor - numMenor) + 1) + numMenor);

			System.out.println(numFinal);
		leer.close();
	}
}
