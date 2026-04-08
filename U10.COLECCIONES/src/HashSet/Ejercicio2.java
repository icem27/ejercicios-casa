package HashSet;

import java.util.HashSet;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*
		 * Modifica el ejercicio anterior para que el funcionamiento ahora sea:
		 * 
		 * Muestra por pantalla los datos introducidos ¿Está “Seat”? si está bórralo e
		 * introdúcelo como “SEAT” Crea otro HashSet con 5 marcas de coches japoneses, y
		 * añádelas a las marcas de coches anteriores (usa un el método .addall) Muestra
		 * por pantalla los datos Muestra cuántos elementos hay en coches
		 */

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
		System.out.println("\nCambiamos seat a SEAT");
		eliminarSeat(marcasCoches);
		mostrarMarcas(marcasCoches);
		System.out.println("\nAñadiendo marcas japonesas: ");
		marcasCoches.addAll(marcasJaponesas());
		mostrarMarcas(marcasCoches);
	}

	public static void mostrarMarcas(HashSet<String> marcas) {
		for (String n : marcas) {
			System.out.println(n);
		}
	}

	public static void eliminarSeat(HashSet<String> marcas) {
		if(marcas.contains("Seat")) {
			marcas.remove("Seat");
			marcas.add("SEAT");
		}
	}
	
	public static HashSet<String> marcasJaponesas() {
		HashSet<String> japoneses=new HashSet<String>();
		japoneses.add("Nissan");
		japoneses.add("Toyota");
		japoneses.add("Mazda");
		japoneses.add("Suzuki");
		japoneses.add("Lexus");
		return japoneses;
	}

}
