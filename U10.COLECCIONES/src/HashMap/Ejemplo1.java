package HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import HashSet.Alumno;

public class Ejemplo1 {
	public static void main(String[] args) {
		HashMap<Integer,String> personas= new HashMap<Integer,String>();
		personas.put(123, "María");
		personas.put(133, "Antonio");
		personas.put(143, "Carlos");
		personas.put(153, "Perla");
		personas.put(123, "Ismael");
		
		System.out.println("Personas: \n" + personas);
		
		int codigo=123;
		System.out.println("El valor de " + codigo + " es " + personas.get(codigo));
	
		HashMap<Integer,Alumno> alumnos = new HashMap<Integer,Alumno>();
		
		alumnos.put(123, new Alumno("Ismael"));
		alumnos.put(133, new Alumno("Chaniel"));
		alumnos.put(143, new Alumno("Ruth"));
		alumnos.put(153, new Alumno("Carlos"));
		System.out.println("Alumnos: \n" + alumnos);
		System.out.println("El alumno con ID " + codigo + " es: "+ alumnos.get(123));
		
		System.out.println();
		
		System.out.println("CLAVES:****");
		for(Integer e: personas.keySet()) {
			System.out.println(e);
		}
		
		for(Map.Entry<Integer, String> per: personas.entrySet()) {
			System.out.println("Persona 1: " + per);
			System.out.println("Persona 2: " + per.getKey());
			System.out.println("Persona 3: " + per.getValue());
		}
		
	}
	

}
