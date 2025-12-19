package EjerciciosArrays2;

import java.util.Scanner;
/*
 * Array de 100 números reales aleatorios entre 0.0 y 1.0. utiliza Math.random y
 * luego pide al usuario un valor real R. Muestra los valores del array que sean
 * igual o superiores a R
 */
	public class Ejercicio_1 {
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			double[] array1 = new double[100];
			double aleatorio = 0;

			System.out.println("Introduce un número entre el 0 y 1: ");
			double R = leer.nextDouble();

			for (int i = 0; i < array1.length; i++) {
				aleatorio = (Math.random());
				array1[i] = aleatorio;
				if (array1[i] >= R) {
					System.out.println(array1[i]);
				} else {
					System.out.println("Debes introducir un número estre 0 y 1");
					break;
				}
			}
			leer.close();
		}
	}

