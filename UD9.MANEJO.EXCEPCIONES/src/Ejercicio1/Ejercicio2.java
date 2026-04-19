package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*
		 * Realiza un programa que sin utilizar arrays pida 6 números enteros por
		 * teclado y nos diga cuál es el valor máximo introducido. Si el usuario
		 * introduce un dato erróneo (algo que no sea un número entero) el programa debe
		 * indicarlo y debe pedir de nuevo el número.
		 */
		System.out.println("Por favor, vaya introduciendo números enteros.");
		Scanner s = new Scanner(System.in);
		int maximo = 0;
		for (int i = 1; i < 7; i++) {
			boolean datoValido = false;
			int numero = 0;
			do {
				try {
					System.out.print("No " + i + ": ");
					numero = Integer.parseInt(s.nextLine());
					datoValido = true;
				} catch (NumberFormatException nfe) {
					System.out.println("El dato introducido no es correcto, debe ser un número entero.");
					System.out.println("Por favor, intentalo de nuevo.");
				}
			} while (!datoValido);
			if (numero > maximo) {
				maximo = numero;
			}
		}
		System.out.println("El valor maximo introducido es " + maximo);
	}

}
