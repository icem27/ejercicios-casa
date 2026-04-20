package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Crea un mini-diccionario español-inglés que contenga, al menos, 10 palabras
		 * (con su correspondiente traducción).
		 * 
		 * Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras.
		 * El programa pedirá una palabra en español y dará la correspondiente
		 * traducción en inglés.
		 */
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("Hola", "Hello");
		diccionario.put("Nombre", "Name");
		diccionario.put("Mesa", "Table");
		diccionario.put("Botella", "Bottle");
		diccionario.put("Ojo", "Eye");
		diccionario.put("Pizarra", "Blackboard");
		diccionario.put("Vacaciones", "Holidays");
		diccionario.put("Verano", "Summer");
		diccionario.put("Primavera", "Spring");
		diccionario.put("Otoño", "Autumn");
		diccionario.put("Invierno", "Winter");

		System.out.println("Introduce una palabra");
		String palabra = leer.next();
		String palabraIngles = diccionario.get(palabra);
		if (palabraIngles != null) {
			System.out.println("La traducción es " + palabraIngles);
		} else {
			System.out.println("No tenemos la palabra en el diccionario");
		}

	}

}
