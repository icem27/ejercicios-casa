package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_8 {
	/*
	 * Vamos a crear un programa en Java que genere banderas de colores aleatorios.
	 * 
	 * Disponemos de un array de cadenas de texto con varios colores posibles para
	 * las franjas de la bandera: rojo, amarillo, verde, azul, blanco y negro.
	 * 
	 * El programa debe pedir al usuario cuántas franjas quiere para la bandera y, a
	 * continuación, mostrará por pantalla los colores de cada franja generados
	 * aleatoriamente.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String[] colores= {"rojo", "amarillo", "verde", "azul", "blanco", "negro"};
		
		System.out.println("¿De cuantas franjas quieres la bandera?");
		int franjas = leer.nextInt();
		
		for (int i=0;i<franjas;i++) {
			int color = (int)(Math.random()*(colores.length));
			System.out.println(colores[color]);
			System.out.println("---------------");
		}
		leer.close();
		

	}

}
