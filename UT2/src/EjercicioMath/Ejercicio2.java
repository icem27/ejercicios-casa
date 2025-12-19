package EjercicioMath;

import java.util.Scanner;

public class Ejercicio2 {
	/*Capturamos un número por teclado y queremos saber el valor de e elevado a ese número.    
	 * Criterio de parada: Introducción del valor 0*/

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
		do {
		System.out.println("Introduce un número");
		num = leer.nextInt();
		
		double resultado=Math.pow(Math.E, num);
		
		System.out.println(resultado);
		} while (num!=0);
		System.out.println("Adiós");
		leer.close();
	}

}
