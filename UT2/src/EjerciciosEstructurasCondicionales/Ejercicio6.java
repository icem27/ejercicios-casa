package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio6 {

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
		
		int peque =num1;
		
		if (num1 < peque ) {
			peque=num1;
		}
		if (num2 < peque ) {
			peque=num2;
		}
		
		if (num3 < peque) {
			peque=num3;
		}

		if (num4 < peque ) {
			peque=num2;
		}
		
		if (num5 < peque) {
			peque=num3;
		}
		
		System.out.println("El más pequeño es: " + peque);
		
	 leer.close();
	}

}
