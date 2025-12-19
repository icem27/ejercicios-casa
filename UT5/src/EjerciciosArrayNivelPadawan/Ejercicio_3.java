package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_3 {
	/*
	 * Crea un programa que pida diez números reales por teclado, los almacene en un
	 * array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
	 * pantalla.
	 * 
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int[] nums = new int[10];
		int num_max = 0, num_min = 0;

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce el " + (i + 1) + "ª valor: ");
			nums[i] = leer.nextInt();
			
			if (nums[i] > num_max) {
				num_max = nums[i];
			}
			if (nums[i] < num_min) {
				num_min = nums[i];
			}
		}
		System.out.println("El número mayor del vector es: " + num_max);
		System.out.println("El número menor del vector es: " + num_min);
		leer.close();
	}

}
