package ejercicioAcademia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class AcademiaPrincipal {

	static Scanner leer = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaAlumnos alumnos = new ListaAlumnos();

		inscribir(alumnos);
		
		mostrarAlumnos(alumnos);
		
		HashSet<Alumno> alumnosSinDuplicados = alumnos.sinDuplicados();
		 mostrarSinDup(alumnosSinDuplicados);
		 
		 ArrayList<Alumno> alumnos2 = new ArrayList<Alumno>(alumnosSinDuplicados);
		 
		 mostrarCantidad(alumnos, alumnosSinDuplicados);
	}

	static void inscribir(ListaAlumnos alumnos) {
		String nombre = "";
		System.out.println("Intoduzca el nombre [FIN para salir]:");
		nombre = leer.nextLine();
		do{
			Alumno a  = new Alumno(nombre);
			alumnos.anadirAlumno(a);
			System.out.println("Intoduzca el nombre [FIN para salir]:");
			nombre = leer.nextLine();			
		}while (!nombre.equalsIgnoreCase("FIN"));
	}

	static void mostrarCantidad(ListaAlumnos alumnos, HashSet<Alumno> alumnosSinDuplicados) {
		int alumnosInicial = alumnos.calcularTamano();
		int duplicados = alumnosInicial - alumnosSinDuplicados.size();
		System.out.println(" -- Había " + alumnosInicial + " alumnos (con duplicados). \n -- Se han eliminado "
				+ duplicados + " alumnos duplicados.");
	}

	static void mostrarAlumnos(ListaAlumnos alumnos) {
		System.out.println(" ==== ALUMNOS CON DUPLICADOS====");
		alumnos.recorrerLista();
	}
	
	static void mostrarSinDup(HashSet<Alumno> alumnosSinDuplicados){
		System.out.println(" ==== ALUMNOS SIN DUPLICADOS ====");
			for(Alumno a : alumnosSinDuplicados) {
				System.out.println(a.getNombre());
			}
	}
}
