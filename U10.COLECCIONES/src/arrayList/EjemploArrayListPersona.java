package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayListPersona {

	public static void main(String[] args) {
		ArrayList <Persona> personas = new ArrayList<Persona>();
//		personas.add(new Persona("Ismael", "Guapo"));
//		personas.add(new Persona("Juan", "Gonzalez"));
//		personas.add(new Persona("Carlos", "Perez"));
//		personas.add(new Persona("Sara", "Lopez"));
//		personas.add(new Persona("Carla", "Alto"));
		
		for(Persona personitas:personas) {
			System.out.println(personitas);
		}
		
		Collections.sort(personas);
		System.out.println("**********************");
		for (Persona personita:personas) {
			System.out.println(personita);
		}

	}

}
