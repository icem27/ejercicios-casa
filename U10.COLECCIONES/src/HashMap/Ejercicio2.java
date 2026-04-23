package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
	/*
	 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
	 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
	 * principio, el programa solo conoce las capitales de España, Portugal y
	 * Francia.
	 * 
	 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
	 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
	 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		HashMap<String, String> capitales = new HashMap<String, String>();
		capitales.put("España", "Madrid");
		capitales.put("Portugal", "Lisboa");
		capitales.put("Francia", "París");
		boolean parar = false;
		do {
			System.out.println("Escribe el nombre de un país y te diré su capital");
			String pais = leer.nextLine();
			if (pais.equals("salir")) {
				parar = true;
			} else {
				String capital = capitales.get(pais);
				if (capital != null) {
					System.out.println("La capital de " + pais + " es " + capital);
				} else {
					System.out.println("No conozco la respuesta, ¿cuál es la capital de " + pais + "?");
					String cap = leer.nextLine();
					capitales.put(pais, cap);
				}
			}
		} while (!parar);
		leer.close();
		mostrarTodo(capitales);

	}

	public static void mostrarTodo(HashMap<String, String> capitales) {
		System.out.println("Países y capitales: ");
		for (Map.Entry<String, String> c : capitales.entrySet()) {
			System.out.println("País: " + c.getKey() + "-- Capital: " + c.getValue());
		}
	}
}
