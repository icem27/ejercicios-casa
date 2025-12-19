package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Escribir un programa que convierta un valor dado en grados 
		// Fahrenheit a grados Celsius utilizando la fórmula C = (F-32)*5/9

		/****************** ANÁLISIS *********************************/
		// Hay que solicitar un dato.
		// Datos de entrada: Grados Fahrenheit
		// Información de salida: Grados Celsius
		// Variables: grados y formula
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		float grados, formula;
		
		System.out.println("Introduce el valor en grados Fahrenheit: ");
		grados = leer.nextFloat();
		
		formula = ((grados-32)*5/9); 
		
		System.out.println(grados + " Fahrenheit son: " + formula + " Celsius");

	}

}
