package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Vamos a crear un programa con un método para desplazar todos los elementos de
	 * un Array un lugar a la derecha, teniendo en cuenta que el último elemento
	 * pasará a la primera posición.
	 * 
	 * Ejemplo:
	 * 
	 * Si el array original contiene los siguientes valores:
	 * 
	 * 
	 * 
	 * En este caso el contenedor será un ArrayList.
	 * 
	 * Ayuda: El método recibirá un ArrayList de tipo Integer con una serie de
	 * valores numéricos y devolverá el mismo ArrayList con sus elementos
	 * desplazados una posición a la derecha.
	 * 
	 * Los desplazamientos se realizarán sobre el mismo array. No se puede utilizar
	 * un array auxiliar para realizar el proceso. Además, deberá implementarse
	 * haciendo uso de los métodos de ArrayList sin recorrer el array.
	 * 
	 * El programa debe mostrar los elementos del array original y los del array
	 * modificadoF
	 */
	public static ArrayList<Integer> desplazar(ArrayList<Integer> l) {
		l.add(0, l.remove(l.size() - 1));
		return l;
	}

	public static ArrayList<Integer> leerArray() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> l = new ArrayList<Integer>();
		System.out.println("Escribe una lista de números. " + "Termina con cualquier cosa distinta a un número entero");
		try {
			while (true) {
				l.add(sc.nextInt());
			}
		} catch (InputMismatchException e) {
		}
		return l;
	}

	public static void mostrar(ArrayList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> l = leerArray();
		System.out.println("Lista original");
		mostrar(l);
		System.out.println("Lista desplazada");
		mostrar(desplazar(l));

	}
}
