package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class OrdenarObjetosArrayList {
	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Ismael", "Gonzalez", 19));
		personas.add(new Persona("Carla", "Alvarez", 12));
		personas.add(new Persona("Sara", "Garcia", 10));
		personas.add(new Persona("Carlos", "Sanchez", 21));
		personas.add(new Persona("Carla", "Perez", 32));
		personas.add(new Persona("Carla", "Perez", 32));
		
		for(Persona personitas:personas) {
			System.out.println(personitas);
		}
		
		Collections.sort(personas);
		System.out.println("*******************************");
		for(Persona personitas:personas) {
			System.out.println(personitas);
		}
		
		HashSet<Persona> per = new HashSet<Persona>(personas);
		System.out.println("*******************************");
		for(Persona personitas:per) {
			System.out.println(personitas);
		}
		
	}

}
