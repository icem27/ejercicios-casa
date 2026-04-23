package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Asistentes {
	public static void main(String[] args) {
		HashMap<Integer, String> asistentes = new HashMap<Integer, String>();
		asistentes.put(1, "Ismael");
		asistentes.put(2, "Carlos");
		asistentes.put(3, "Antonia");
		asistentes.put(2, "Sara");
		HashSet<String> lista = new HashSet<String>();
		lista.add("rojo");
		lista.add("azul");
		lista.add("rojo");
		lista.add("verde");
		
		System.out.println(lista.size());

		System.out.println("Personas: \n" + asistentes);
	
	
	}

}
