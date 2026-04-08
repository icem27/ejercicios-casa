package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Empleado> empleado = new HashSet<Empleado>();
		menu();
	}
	
	public static void menu() {
		System.out.println("1.-Introducir empleado\n"
				+ "2.-Listar empleados\n"
				+ "3.-Eliminar empleado\n"
				+ "4.-Borrar todos\n"
				+ "5.-Mostrar número de empleados\n"
				+ "6.-Buscar empleado\n"
				+ "7.-Salir");
	}
	
	public static void introducirEmpleado(HashSet<Empleado> empleado, Scanner sc) {
		System.out.println("Introduce el nombre del empleado: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce el suelo del empleado " + nombre + ": " );
		Double sueldo = sc.nextDouble();
		empleado.add(new Empleado(nombre, sueldo));
	}

}
