package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Dados dos números calcular y mostrar su suma, resta división y multiplicación
		/****************** ANÁLISIS *********************************/
		// Hay que solicitar 2 números y calcular cada una de las operaciones (suma, resta, multiplicación y división)
		// Datos de entrada: 2 números
		// Información de salida: valor de cada una de las operaciones solicitadas
		// Variables: num1, num2
		/****************** DISEÑO *********************************/
		// 1. Leer 2 números
		// 2. Obtener suma
		// 3. Obtener resta
		// 4. Obtener multiplicación
		// 5. Obtener división
		// 6. Mostrar resultados
		
		Scanner leer = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Introduce el primer numero: ");
		num1 = leer.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = leer.nextInt();
		
		System.out.println("Resueltado. Suma: " + (num1+num2) + ", resta: " + (num1-num2) + ", multiplicación: " 
				+ (num1*num2) + " y división: " + (num1/num2));
		leer.close();
	}

}
