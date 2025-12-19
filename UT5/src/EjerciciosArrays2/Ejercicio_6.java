package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_6 {
	/*
	 * Crea un programa que permita al usuario almacenar una secuencia aritmética en
	 * un array y luego mostrarla. Una secuencia aritmética es una serie de números
	 * que comienza por un valor inicial V, y continúa con incrementos de I.
	 * 
	 * Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9…
	 * 
	 * Con V=7 e I=10, la secuencia sería 7, 17, 27, 37…
	 * 
	 * El programa solicitará al usuario V, I además de N (nº de valores a crear).
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int cantidad, V, I;
		int[] array;

		System.out.println("¿De que cantidad quieres el array?");
		cantidad = leer.nextInt();

		array = new int[cantidad];

		System.out.println("El primer valor:");
		V = leer.nextInt();

		System.out.println("El segundo valor:");
		I = leer.nextInt();
		array[0] = V;

		for (int i = 1; i < cantidad; i++) {
			array[i]=array[i-1]+I;
			
		}
		for (int a : array)
			System.out.println(a);
		leer.close();
	}
}
