package Ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		boolean esCorrecto=false;
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		do {
			try {
				System.out.println("Introduce el primer número: ");
				num1 = sc.nextInt();
				esCorrecto=true;
			} catch (InputMismatchException e) {
				System.out.println("El datos introducido no es correto.");
				sc.nextLine();
			}
		} while(!esCorrecto);
		esCorrecto=false;
		do {
			try {
				System.out.println("Introduce el segundo número: ");
				num2 = sc.nextInt();
				esCorrecto=true;
			} catch (InputMismatchException e) {
				System.out.println("El datos introducido no es correto.");
				sc.nextLine();
			} finally {
				sc.close();
				System.out.println("Adiós");
			}
		} while(!esCorrecto);
		System.out.println("Suma es: " + (num1+num2));
	}
}
