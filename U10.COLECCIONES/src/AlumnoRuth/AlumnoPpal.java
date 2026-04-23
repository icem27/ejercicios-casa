package AlumnoRuth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AlumnoPpal {
		
		/*
		 * Crea una clase Alumno con el atributo Nombre y desarrolla un programa en Java que permita:
			Almacenar a los alumnos en una lista
			Muestra el listado de los alumnos inscritos
			Crear una lista eliminando los duplicados
			Mostrar la información de los alumnos inscritos sin duplicados
			Muestra la cantidad de alumnos que había al principio y cuántos alumnos duplicados se han eliminado.
			Ordena la lista de alumnos sin duplicados
			
			array list --> lo pasamos a hashset para eliminar duplicados y luego --> pasarlo a array list para poder ordenarlos
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Alumno>alumnos=new ArrayList<Alumno>();
		alumnos.add(new Alumno("Alumno1"));
		alumnos.add(new Alumno("Alumno1"));
		alumnos.add(new Alumno("Alumno2"));
		alumnos.add(new Alumno("Alumno3"));
		alumnos.add(new Alumno("Alumno2"));
		alumnos.add(new Alumno("Alumno4"));
		alumnos.add(new Alumno("Alumno5"));
		alumnos.add(new Alumno("Alumno6"));
		
		System.out.println("=====Inscritos======");
		mostrarAlumnos(alumnos);
		System.out.println("======Sin Duplicados======");
		mostrarAlumnosSinDuplicados(eliminarDuplicados(alumnos));
		
		System.out.println("Se habían inscrito "+alumnos.size()+ "alumnos y se han eliminado "+(alumnos.size() - eliminarDuplicados(alumnos).size())+" que estaban duplicados");
		
		System.out.println("=======Alumnos Ordenados======");
		mostrarAlumnos(alumnosOrdenados(eliminarDuplicados(alumnos)));
		
		

	}
	public static void mostrarAlumnos(ArrayList<Alumno>alumnos) {
		for(Alumno a:alumnos) {
			System.out.println(a);
		}
	}
	
	public static HashSet<Alumno> eliminarDuplicados(ArrayList<Alumno>alumnos) {
		HashSet<Alumno> alumnosSinDuplicados=new HashSet<Alumno>(alumnos);
		return alumnosSinDuplicados;
	}
	
	public static void mostrarAlumnosSinDuplicados(HashSet<Alumno> alumnosSinDuplicados) {
		for(Alumno a:alumnosSinDuplicados) {
			System.out.println(a);
		}
	}
	
	public static ArrayList<Alumno> alumnosOrdenados(HashSet<Alumno> alumnos){
		ArrayList<Alumno> alumA= new ArrayList<Alumno>(alumnos);
		Collections.sort(alumA);
		return alumA;
	}

}
