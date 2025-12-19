package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.println("¿De cuantos peldaños es la escalera?");
		int n = leer.nextInt();

		while (n<=0) {
			System.out.println("Error, introduce una altura válida");
			n=leer.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		leer.close();

	}

}
