package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_4 {
	/*
	 * Crea un programa que pida veinte números enteros por teclado, los almacene en
	 * un array y luego muestre por separado la suma de todos los valores positivos
	 * y la suma de los negativos. 
	 */
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] nums = new int[20];
		int sumPositivos = 0, sumNegativos = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce el " + (i + 1) + "ª valor: ");
			nums[i] = leer.nextInt();
			
			if (nums[i] > 0) {
				sumPositivos  = sumPositivos + nums[i];
			}
			if (nums[i] < 0) {
				sumNegativos  = sumNegativos + nums[i];
			}
		}
		System.out.println("La suma de los números positivos es: " + sumPositivos);
		System.out.println("La suma de los números negativos es: " + sumNegativos);
		leer.close();
	}

}
