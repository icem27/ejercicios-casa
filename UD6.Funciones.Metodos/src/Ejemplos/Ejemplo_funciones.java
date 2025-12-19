package Ejemplos;

import java.util.Scanner;

public class Ejemplo_funciones {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce tu año de nacimiento: ");
		int edadNacimiento = leer.nextInt();
		leer.nextLine();
		System.out.println("Introduce tu nombre: ");
		String nombreUsuario=leer.nextLine();
		
		int edad = calculadora(edadNacimiento);
		
		String nombre = pedirNombre(nombreUsuario);
		
		System.out.println(nombre);
		
		int num1=1;
		int num2=2;
		
		
		int resultado = suma(num1, num2);
		System.out.println("La suma es: " + resultado);
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad);

		leer.close();
	}
	
	public static int calculadora(int calculadora) {
		return 2025 - calculadora;
	}
	
	public static String pedirNombre(String nombreUsuario) {
		return nombreUsuario;
	}
	
	public static int suma(int num1, int num2) {
		return num1+num2;
	} 
	

}
