package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repite = false;
		do {
			try {
				System.out.println("Introduce el primer número: ");
				int num1 = sc.nextInt();
				System.out.println("Introduce el segundo número: ");
				int num2 = sc.nextInt();
				repite = true;
				int div = num1 / num2;
				System.out.println("División: " + div);

			} catch (InputMismatchException | ArithmeticException e) {
				System.out.println("Debes introduce números. ");
				sc.nextLine();
			} finally {
				System.out.println("Adión. ");
			}
		} while (!repite);
	}

}
