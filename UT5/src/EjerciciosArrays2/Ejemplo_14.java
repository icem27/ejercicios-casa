package EjerciciosArrays2;

import java.util.Scanner;

public class Ejemplo_14 {
	/*
	 * Escribe un programa en Java que pida 8 palabras y las almacene en un array.
	 * 
	 * A continuación, las palabras correspondientes a colores se almacenarán al
	 * comienzo y las que no son colores a continuación.
	 * 
	 * Puedes utilizar tantos arrays auxiliares como quieras.
	 * 
	 * Los colores que conoce el programa deben estar en otro array y son los
	 * siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y
	 * morado.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int tam = 8;
		String[] colores = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado" };
		String[] resultado = new String[tam];
		String[] color = new String[tam];
		String[] noColores = new String[tam];
		Boolean esColor = false;
		String palabra;
		int indiceColores = 0;
		int indiceNoColores = 0;

		System.out.println("Introduce 8 palabras");

		for (int i = 0; i < tam; i++) {
			palabra = leer.nextLine();
			esColor = false;
			for (int j = 0; j < colores.length; j++) {
				if (palabra.equals(colores[j])) {
					color[indiceColores] = palabra;
					indiceColores++;
					esColor = true;
					break;
				}
			}
			if (!esColor) {
				noColores[indiceNoColores] = palabra;
				indiceNoColores++;
			}
		}

		int indice = 0;
		for (int i = 0; i < tam; i++) {
			resultado[indice] = color[i];
			indice++;
		}

		for (int i = 0; i < indiceNoColores; i++) {
			resultado[indiceColores] = noColores[i];
			indiceColores++;
		}

		System.out.println("====== COLORES ======");
		for (String a : color) {
			System.out.print(a + " | ");
		}

		System.out.println("\n====== NO COLORES ======");
		for (String a : noColores) {
			System.out.print(a + " | ");
		}

		System.out.println("\n====== RESULTADO FINAL ======");
		for (String a : resultado) {
			System.out.print(a + " | ");
		}

		leer.close();
	}

}
