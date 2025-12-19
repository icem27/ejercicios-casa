package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_6 {
	/*
	 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que
	 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int P, Q;
		//int num_max, num_min;
		System.out.println("Introduce el primer número: ");
		P = leer.nextInt();
		System.out.println("Introduce el segundo número: ");
		Q = leer.nextInt();

		//num_max = Math.max(P, Q);
		//num_min = Math.min(P, Q);

		//int tam = (num_max-num_min)+1;
		int tam = Math.abs(P - Q)+1;

		int[] array = new int[tam];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + tam;
			
		}

		for (int a : array) {
			System.out.println("Desde el " + /*num_min + " hasta " + num_max +*/ " tienes: " + a);
		}

		leer.close();
	}

}
