package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_1 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego muestre todos sus valores.
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce el " + (i+1) + "ª valor: ");
			nums[i]=leer.nextInt();
		}

		for (int a:nums) {
			System.out.println("Los números introducidos son: " + a);
	
		}
		leer.close();
		}

}
