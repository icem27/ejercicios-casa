package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Empleado> empleado = new HashSet<Empleado>();
		int opcion;
		do {
		opcion=menu(sc);
		sc.nextLine();
		switch(opcion) {
		case 1: 
			introducirEmpleado(empleado, sc);
			break;
		case 2: 
			listadoEmpleados(empleado);
			break;
		case 3: 
			eliminarEmpleado(empleado, sc);
			break;
		default:
			System.out.println("Opción no contenida. ");
		}
		}while(opcion!=5);
	}
	
	public static int menu(Scanner sc) {
		System.out.println("1.-Introducir empleado\n"
				+ "2.-Listar empleados\n"
				+ "3.-Eliminar empleado\n"
				+ "4.-Borrar todos\n"
				+ "5.-Mostrar número de empleados\n"
				+ "6.-Buscar empleado\n"
				+ "7.-Salir");
		return sc.nextInt();
	}
	
	public static void introducirEmpleado(HashSet<Empleado> empleado, Scanner sc) {
		System.out.println("Introduce el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce el suelo del empleado " + nombre + ": " );
		Double sueldo = sc.nextDouble();
		empleado.add(new Empleado(nombre, sueldo));
	}
	
	public static void listadoEmpleados(HashSet<Empleado> empleado) {
		if(!empleado.isEmpty()) {
			for(Empleado emple:empleado) {
				System.out.println(emple);
			}
		} else {
			System.out.println("No hay empleados en el listado");
		}
	}
	
	public static void eliminarEmpleado(HashSet<Empleado> empleado, Scanner sc) {
		if (!empleado.isEmpty()) {
			boolean noExiste=true;
			System.out.println("Introduce el nombre del empleado: ");
			String nombre = sc.nextLine();
			Iterator<Empleado> emp = empleado.iterator();
			while (emp.hasNext()) {
				Empleado emple = emp.next();
				if (nombre.equalsIgnoreCase(emple.getNombre())) {
					emp.remove();
					System.out.println("Se ha eliminado al empleado " + nombre + " correctamente");
					break;
				} else {
					noExiste=false;
				}
			}
			if(!noExiste) {
				System.out.println("El empleado buscado no se encuentra en la BBDD");
			}
		} else {
			System.out.println("No existen empleados");
		}
	}

}
