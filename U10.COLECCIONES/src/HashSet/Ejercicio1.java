package HashSet;

import java.util.HashSet;

public class Ejercicio1 {
	/*
	 * Almacena en un HashSet llamado marcasCoches los nombres de 5 marcas de
	 * coches.
	 * 
	 * Muestra por pantalla los datos introducidos 
	 * Muestra cuántos elementos hay en
	 * marcasCoches Indica si está “Fiat”
	 */
	public static void main(String[] args) {
		HashSet<String> marcasCoches = new HashSet<String>();
		marcasCoches.add("Seat");
		marcasCoches.add("Fiat");
		marcasCoches.add("Mercedes-Benz");
		marcasCoches.add("Nissan");
		marcasCoches.add("BMW");

		mostrarMarcas(marcasCoches);
		System.out.println("\nHay " + marcasCoches.size() + " elementos\n");
		if (marcasCoches.contains("Fiat")) {
			System.out.println("Contiene Fiat");
		} else {
			System.out.println("No contiene Fiat");
		}
	}

	public static void mostrarMarcas(HashSet<String> marcas) {
		for (String n : marcas) {
			System.out.println(n);
		}
	}

}
