package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisionSegura {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int max=pedirNumero(0);
		for(int i=1;i<6;i++) {
			int num = pedirNumero(i);
			if(num>max) {
				max=num;
			}
		}
		System.out.println("El máximo es: " + max);
	}
	
	public static int pedirNumero(int i) {
		int num = 0;
		boolean esCorrecto = false;
		do {
			try {
				System.out.println("Introduce el " + (i + 1) + " número: ");
				num = sc.nextInt();
				esCorrecto = true;
				return num;
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir números;");
				sc.nextLine();
			}
		} while (!esCorrecto);
		return num;
	}

}
