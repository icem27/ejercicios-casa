package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicios_3 {
	/*
	 * Crea un programa para realizar cálculos relacionados con la altura (en
	 * metros) de personas. Pedirá un valor N y luego almacenará en un array N
	 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
	 * mínima así como cuántas personas miden por encima y por debajo de la media.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int cantidad, mas_alta=0, menos_alta=0;
		double suma = 0, alt_max = 0, alt_min = 0;
		double[] array1;

		System.out.println("¿Cuantos valores quieren introducir?");
		cantidad = leer.nextInt();

		array1 = new double[cantidad];
		double tam = array1.length;

		for (int i = 0; i < tam; i++) {
			System.out.println("Introduce la altura en metros: ");
			array1[i] = leer.nextDouble();
			suma = array1[i] + suma;
			alt_max = array1[i];
			alt_min = array1[i];

		}
		double media = suma / tam;

		for (int i = 0; i < array1.length; i++) {

			if (array1[i] > alt_max) {
				alt_max = array1[i];
			}

			if (array1[i] < alt_min) {
				alt_min = array1[i];
			}

			if (media < array1[i]) {
				mas_alta++;
			}else if (media > array1[i]) {
				menos_alta++;
			}
		}

		System.out.println("La altura maxima es: "+ alt_max);
		System.out.println("La altura minima es: "+ alt_min);
		System.out.println("La altura media es: "+ media);
		System.out.println("La cantidad de alturas que estan encima de la media es: "+ mas_alta);
		System.out.println("La cantidad de alturas que estan por debajo de la media es: "+ menos_alta);
		leer.close();
	}

}
