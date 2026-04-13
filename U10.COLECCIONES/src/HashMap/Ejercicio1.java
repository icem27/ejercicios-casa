package HashMap;

import java.util.HashMap;
import java.util.Map;

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
		HashMap<String, String> diccionario = new HashMap<String,String>();
		
		diccionario.put("Hola", "Hello");	
		diccionario.put("Adiós", "Bye");
		diccionario.put("Perro", "Dog");
		diccionario.put("Sol", "Sun");
		diccionario.put("Luna", "Moon");
		

	}

}
