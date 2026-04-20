package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realiza un programa que calcule cuál es la cadena de mayor longitud de todas
	 * las contenidas en un ArrayList de cadenas de caracteres (String).
	 * 
	 * Ayuda: El programa utilizará los siguientes métodos además del método main:
	 * 
	 * Método leerArray(): este método recibe como parámetro el arrayList de Strings
	 * vacío. El método pide por teclado cadenas de caracteres y las añade al
	 * ArrayList. La lectura de cadenas termina cuando se introduce la cadena “FIN”.
	 * Método cadenaMasLarga():este método recibe como parámetro el arrayList de
	 * Strings con todas las cadenas leídas anteriormente y devuelve el String de
	 * mayor longitud.
	 */
	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		leerArray(lista);
		System.out.println("La cadena más larga es : \"" + cadenaMasLarga(lista) + "\"");

	}

	public static void leerArray(ArrayList<String> l) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe palabras o frases. \"FIN\" para terminar.");
		String palabra = sc.nextLine();
		while (!palabra.equalsIgnoreCase("FIN")) {
			l.add(palabra);
			palabra = sc.nextLine();
		}
	}

	public static String cadenaMasLarga(ArrayList<String> l) {
		String larga = "";
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String p = it.next();
			if (p.length() > larga.length()) {
				larga = p;
			}
		}
		return larga;
	}
}
