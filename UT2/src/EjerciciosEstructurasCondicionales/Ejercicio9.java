package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida por teclado el resultado (dato entero) 
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.
		Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto.”*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = leer.nextInt();
		
		if (num1==1) {
			System.out.println("El número de la cara opuesta es un 'Seis'");
		} else if (num1==2) {
			System.out.println("El número de la cara opuesta es un 'Cinco'");
		} else if (num1==3) {
			System.out.println("El número de la cara opuesta es un 'Cuatro'");
		} else if (num1==4) {
			System.out.println("El número de la cara opuesta es un 'Tres'");
		} else if (num1==5) {
			System.out.println("El número de la cara opuesta es un 'Dos'");
		} else if (num1==6) {
			System.out.println("El número de la cara opuesta es un 'Uno'");
		} else {
			System.out.println("ERROR: número incorrecto");
		}
		leer.close();
	}

}
