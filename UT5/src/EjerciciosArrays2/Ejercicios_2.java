package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicios_2 {
	/*
	 * Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con
	 * valores enteros aleatorios entre 1 y 10 (utiliza Math. Random()). Luego
	 * pedirá un valor N y mostrará en qué posiciones del array aparece N.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] array1 = new int[100];
		
		for (int i=0; i<array1.length;i++) {
			array1[i]=(int)(Math.random()*10+1);
		}
		System.out.println("Introduce un número entre 1 y 10");
		int N=leer.nextInt();

		for (int i=0; i<array1.length;i++) {
			if (array1[i]==N) {
				System.out.println("Aparece en la posición " + i);
			}
		}
	leer.close();
	}

}
