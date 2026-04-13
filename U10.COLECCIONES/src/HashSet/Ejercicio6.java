package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Una academia necesita desarrollar una pequeña aplicación en Java para
		 * gestionar los alumnos inscritos en sus cursos.
		 * 
		 * Durante el proceso de inscripción, algunos alumnos pueden registrarse varias
		 * veces por error, por lo que es necesario eliminar duplicados y trabajar
		 * únicamente con alumnos únicos.
		 * 
		 * Crea una clase Alumno con el atributo Nombre y desarrolla un programa en Java
		 * que permita:
		 * 
		 * Almacenar a los alumnos en una lista 
		 * Muestra el listado de los alumnos inscritos 
		 * Crear una lista eliminando los duplicados 
		 * Mostrar la información de los alumnos inscritos sin duplicados 
		 * Muestra la cantidad de alumnos que había al principio y cuántos alumnos duplicados se han eliminado. 
		 * Ordena la lista de alumnos sin duplicados
		 */
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(new Alumno("Antonio"));
		alumnos.add(new Alumno("Ismael"));
		alumnos.add(new Alumno("Ismael"));
		alumnos.add(new Alumno("Chaniel"));
		alumnos.add(new Alumno("Ruth"));
		
		mostrar(alumnos);
		
		//Metemos a los alumnos en un HashSet para eliminar duplicados. 
//		HashSet<Alumno> sinAlumnosDuplicados = new HashSet<Alumno>(alumnos);
//		mostrar(sinAlumnosDuplicados);
		
		//Mostramos el número de alumnos finales, sin los duplicados. 
		tamAlumnos(alumnos);
		
		//Mostramos el listado de alumnos ordenador
		ordenar(alumnosSinDup(alumnos));
	}
	
	public static void mostrar (ArrayList<Alumno> alumnos) {
		for(Alumno a:alumnos) {
			System.out.println(a);
		}
	}
	
	public static void mostrar (HashSet<Alumno> alumnos) {
		System.out.println("==== ALUMNOS SIN DUPLICADO ====");
		for(Alumno a:alumnos) {
			System.out.println(a);
		}
	}
	
	public static HashSet<Alumno> alumnosSinDup (ArrayList<Alumno> alumnos) {
		HashSet<Alumno> sinAlumnosDuplicados = new HashSet<Alumno>(alumnos);
		return sinAlumnosDuplicados;
	}
	
	public static void tamAlumnos(ArrayList<Alumno> alumnos) {
		System.out.println("=== TAMAÑO DE LA LISTA ===");
		int tamLista = alumnos.size();
		int tamHash = alumnosSinDup(alumnos).size();
		System.out.println("Alumnos al principio: " + tamLista);
		System.out.println("Alumnos eliminados: " + (tamLista-tamHash));
	}
	
	public static void ordenar(HashSet<Alumno> sinAlumnosDuplicados) {
		ArrayList<Alumno> ordenados = new ArrayList<Alumno>(sinAlumnosDuplicados);
		Collections.sort(ordenados);
		System.out.println("=== ORDENAMOS LA LISTA ===");
		for(Alumno a: ordenados) {
			System.out.println(a);
		}
	}

}
