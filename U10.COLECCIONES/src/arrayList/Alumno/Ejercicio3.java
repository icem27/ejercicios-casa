package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
		try {
			int opcion;
			do {
				opcion = mostrarMenu();
				switch (opcion) {
				case 1:
					eliminarAlumno(alumnos);
					break;
				case 2:
					AnyadirAlumno(alumnos);
					break;
				case 0:
					System.out.println("Hasta la próxima!");
					break;
				default:
					System.out.println("Debes elegir 1 o 2");
				}
			} while (opcion != 0);
		} catch (InputMismatchException ex) {
			System.err.println("El dato introducido no es válido");
		} catch (IndexOutOfBoundsException e) {
			System.err.println("La posición introducida no es correcta");
		} catch (Exception ex) {
			System.out.println("Se ha producido un error: " + ex.getMessage());
		} finally {
			leer.nextLine();
		}
		leer.close();
		mostrarAlumnos(alumnos);
		if(alumnos.isEmpty()) {
		} else {
		System.out.println("\n====LISTADO DE ALUMNOS ORDENADOR POR NOTA(Menor a mayor)=====");
		Collections.sort(alumnos);
		mostrarAlumnos(alumnos);
		}
	}
	
	public static void mostrarAlumnos(ArrayList<Alumno> alumnos) {
		if(alumnos.isEmpty()) {
			System.out.println("No has introducido ningun alumno");
		} else {
			System.out.println("====LISTADO DE ALUMNOS =====");
			for(Alumno a:alumnos) {
			System.out.println(a);
			}
		}
	}
	
	public static int mostrarMenu() throws InputMismatchException {
		int opcion=0;
		System.out.println("¿Qué quieres hacer?\n(1- Elimnar alumnos\n2- Añadir Alumno\n0- Salir)");
		opcion=leer.nextInt();
		leer.nextLine();
		return opcion;
		}
	
	public static void AnyadirAlumno(ArrayList<Alumno> alumnos) {
		String nombre = "";
		double nota=0;
		do {
			System.out.println("Introduce el nombre o Fin para salir");
			nombre = leer.nextLine();
		if(!nombre.equals("Fin")) {
			try {
			System.out.println("Introduce la nota de " + nombre );
			nota=leer.nextDouble();
			Alumno a=new Alumno(nombre, nota);
			alumnos.add(a);
			System.out.println("Alumno añadido");
			} catch (InputMismatchException ex) {
				System.out.println("Error");
			} finally {
				leer.nextLine();
			}
		}
		
		} while(!nombre.equals("Fin"));
	}
	
	public static void eliminarAlumno(ArrayList<Alumno> alumnos) throws InputMismatchException, IndexOutOfBoundsException  {
		System.out.println("¿Qué alumno deseas eliminar? Introduce su posición");
		int posicion=leer.nextInt();
		
		alumnos.remove(posicion);
	}
	
}
