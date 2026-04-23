package Examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturaError {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		try {
			try {
				System.out.println("Introduce el primer número: ");
				num1 = sc.nextInt();
				System.out.println("Número leído");
			} catch (InputMismatchException e) {
				System.out.println("Error en la entrada");
				int division = 10 / 0;
			}
			finally {
			System.out.println("Reseteamos");
			System.out.println("Fin del programa");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
