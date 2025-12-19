package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_2 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego muestre la suma de todos los valores.
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] nums = new int[10];
		int suma = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce el " + (i + 1) + "ª valor: ");
			nums[i] = leer.nextInt();
			suma += nums[i];
		}

		System.out.println("La suma de todos los valores es: " + suma);
		leer.close();

	}

}
