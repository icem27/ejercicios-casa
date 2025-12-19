package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_9 {
	/*
	 * Realiza un programa en Java que pida la temperatura media que ha hecho en
	 * cada mes de un determinado año y que muestre a continuación un diagrama de
	 * barras horizontales con esos datos.
	 * 
	 * Las barras del diagrama se pueden dibujar a base de 'o'
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int meses = 12;
		String[] mediaBarras = new String[meses];
		int media = 0;

		for (int i = 0; i < meses; i++) {
			System.out.println("Introduce la temperatura media del mes " + (i + 1) + ":");
			media = leer.nextInt();
			mediaBarras[i] = "";
			for (int j = 0; j < media; j++) {
				mediaBarras[i] += "o";
			}
		}

		for (int i = 0; i < meses; i++) {
			System.out.println("Mes " + (i + 1) + ": " + mediaBarras[i]);
		}

		leer.close();
	}
}
