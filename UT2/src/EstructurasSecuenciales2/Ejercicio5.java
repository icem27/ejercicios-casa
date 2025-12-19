package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Una tortilla de patatas lleva 200 gramos de patatas por persona. 
		// Por cada kilo de patatas se necesitan 5 huevos y 300 gramos de cebolla. 
		// Escribe un programa que dado el número de comensales calcule y muestre 
		// las cantidades de ingredientes necesarias.

		/****************** ANÁLISIS *********************************/
		// Hay que solicitar un dato.
		// Datos de entrada: Numero de comensales
		// Información de salida: Los ingredientes necesarios para realizar la tortilla
		// Variables: grados y formula
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		double comensales=0;
		double patatas =0;
		double formula;
		formula = (comensales*0.2);
		
		
		System.out.println("Introduce el número de comensales: " + comensales);
		comensales = leer.nextDouble();
		
		System.out.println("Patatas: " + (comensales*0.2) + "kilos");
		System.out.println("Huevos: " + (patatas*0.2));
		System.out.println("Cebollas: " + (patatas*0.3) + "gramos");
		
	}
}
