package HashSet;
import java.util.Iterator;

public class Empleado {
	/*
	 * Crea una clase Empleado con los atributos nombre y sueldo y los métodos que
	 * consideres necesarios. Escribe un programa que utilizando una colección
	 * HashSet permita, a través de un menú, gestionar una lista de empleados de
	 * número ilimitado donde no se permitirán nombres de empleados repetidos y
	 * siendo el orden de los mismos totalmente irrelevante.
	 * 
	 * Las opciones del menú son:
	1.-Introducir empleado
	2.-Listar empleados
	3.-Eliminar empleado
	4.-Borrar todos
	5.-Mostrar número de empleados
	6.-Buscar empleado
	7.-Salir
	Consideraciones:

	Para introducir un empleado hará falta también introducir su sueldo.
	Al listar los empleados se mostrará su nombre y sueldo.
	Para eliminar un empleado será necesario introducir su nombre.
	El programa no será sensible a mayúsculas.
	 */
	private String nombre;
	private Double sueldo;
	
	Empleado(String nombre, Double sueldo) {
		this.nombre=nombre;
		this.sueldo=sueldo;
	}

	

	public String getNombre() {
		return nombre;
	}



	public Double getSueldo() {
		return sueldo;
	}



	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	

}
