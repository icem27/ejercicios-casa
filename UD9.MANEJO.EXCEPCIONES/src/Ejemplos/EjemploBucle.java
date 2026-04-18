package Ejemplos;

import java.util.*;
import java.util.Scanner;

public class EjemploBucle {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1 = 0, num2 = 0, suma = 0;
		boolean correcto = false;
		//pedimos el primer sumando hasta que sea correcto
		do {
			try {
				System.out.println("Introduce el primer sumando");
				num1 = leer.nextInt();
				correcto = true;
			} catch (InputMismatchException ime) {
				System.out.println("Dato introducido incorrecto");
				leer.nextLine();
			}
		} while (!correcto);
		//pedimos el segundo sumando hasta que sea correcto
		correcto = false;
		do {
			try {
				System.out.println("Introduce el segundo sumando");
				num2 = leer.nextInt();
				correcto = true;
			} catch (InputMismatchException ime) {
				System.out.println("Dato introducido incorrecto");
				leer.nextLine();
			}
		} while (!correcto);
		suma = num1 + num2;
		System.out.println("La suma es " + suma);

	}
}
