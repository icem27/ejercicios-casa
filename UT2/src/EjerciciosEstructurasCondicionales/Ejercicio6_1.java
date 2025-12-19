package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio6_1 {

	public static void main(String[] args) {
		/*	Crea un programa que determine el menor valor de 5 números introducidos por teclado. 
		Considera que el menor valor puede repetirse.
		Por ejemplo: Si los números introducidos fueran. 14, 19, 14, 16 y 15. El menor valor 
		introducido es 14.*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor: ");
		int num1 = leer.nextInt();

		System.out.println("Introduce el segundo valor: ");
		int num2 = leer.nextInt();

		System.out.println("Introduce el tercer valor: ");
		int num3 = leer.nextInt();

		System.out.println("Introduce el cuarto valor: ");
		int num4 = leer.nextInt();

		System.out.println("Introduce el quinto valor: ");
		int num5 = leer.nextInt();
		
		int grande =num1;
		
		if (num1 > grande ) {
			grande=num1;
		}
		
		if (num2 > grande ) {
			grande=num2;
		}
		
		if (num3 > grande) {
			grande=num3;
		}

		if (num4 > grande ) {
			grande=num4;
		}
		
		if (num5 > grande) {
			grande=num5;
		}
		
		System.out.println("El más pequeño es: " + grande);
		
	 leer.close();

	}

}
