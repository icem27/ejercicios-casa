package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Realiza un programa que calcule el salario de un trabajador.  
		// El sistema solicita y el usuario introduce las horas trabajadas y el valor por hora (€)
		/****************** ANÁLISIS *********************************/
		// Hay que solicitar dos datos, horas trabajas y el precio por hora.
		// Datos de entrada: 2 números
		// Información de salida: El salario, horas trabajas por el precio por hora
		// Variables: num1, num2, suma, resta, multiplicación y división (tipo double)
		/****************** DISEÑO *********************************/
		// 1. Leer 2 números
		// 2. En el resultado hacer la operación de horas por precio
		
		Scanner leer = new Scanner(System.in);
		
		int horas, precio;
		
		System.out.println("Introduce el nº de horas trabajas: ");
		horas = leer.nextInt();
		
		System.out.println("Introduce el valor por hora: ");
		precio = leer.nextInt();
		
		System.out.println("El salario es: " +(horas*precio) +"€");
		leer.close();
	}

}
