package Ejemplos;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Esta es la primera linea de codigo
		/*
		 * Aqui escribo vaerias linea de texto vamos a saludar en la primera clase
		 * Ejemplo1
		 */

//		System.out.println("Hello world");
//		// para abreviar hay que hacerlo con syso con ctrl mas espacio
//		System.out.println("Hola mundo");

//		int edad; //declarar variable
//		edad = 10;//inicializar variable

		int unidades = 29; // declarar e inicializar

		// Las constantes son tipo de variables que no se pueden modificar, para
		// indicarlo hay que poner el final al principio

//		final int MAX_ALUMNOS=30;

//		float altura=1.36f; //En los numeros reales, el float siempre hay que poner la f al final para que funcione
//		double peso=3.5; //En el double no es necesario indicar nada

//		char letra='a';//Para los caracteres se utiliza el char y con comillas simples
//		String palabra="abc";// cadena caracteres

		Scanner leer = new Scanner(System.in); // Para poner introducir datos, se utiliza la clase scanner

		System.out.println("Introduce tu nombre");
		String nombre = leer.nextLine(); // Aqui solo te lee el primer catacter, sin el espacio. Por ejemplo si pones
											// ismael chriki, solo te leerá ismael
		System.out.println("Introduce tu edad");
		int edad = leer.nextInt();
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
		leer.close();

	}

}
