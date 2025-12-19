package EjerciciosArrayNivelPadawan;

import java.util.Scanner;

public class Ejercicio_5 {
	/*
	 * Crea un programa que pida dos valores enteros N y M, luego cree un array de
	 * tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int N, M;

		System.out.println("¿De que tamaño quiere el vector?");
		N = leer.nextInt();
		
		int[] array = new int[N];
		
		System.out.println("Se ha creado el vector con " + N);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce el " + (1 + i) + "ª valor: ");
			M = leer.nextInt();
			array[i] = M;
		}

		for (int a : array) {
			System.out.println("El valor introducido es: " + a);
		}
		leer.close();
	}

}
