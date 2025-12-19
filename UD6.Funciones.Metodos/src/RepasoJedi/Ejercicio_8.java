package RepasoJedi;

import java.util.Scanner;

public class Ejercicio_8 {
	/*
	 * Realiza un programa que nos pida números enteros hasta que se introduzca el
	 * 0, diciéndonos, para cada número introducido si es primo o no.
	 * 
	 * Hay que recordar que un número es primo si sólo es divisible por si mismo y
	 * por 1. El 1 no es primo por convenio.
	 * 
	 * Se debe crear una función que pasándole un número entero devuelva si es primo
	 * o no.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("Introduce un número (0 para salir): ");
			num = sc.nextInt();
			if (num != 0) {
				if (primo(num)) {
					System.out.println("Es primo");
				} else {
					System.out.println("No es primo");
				}
			}
		} while (num != 0);
		System.out.println("Adiós");
		sc.close();
	}

	public static boolean primo(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
