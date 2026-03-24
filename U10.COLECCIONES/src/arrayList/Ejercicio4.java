package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4 {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		AnyadirNumero(numeros);
		mostrarNumeros(numeros);
		eliminarMayorQueCinco(numeros);
	}

	public static void AnyadirNumero(ArrayList<Integer> numeros) {
		int num = -1;
		do {
			try {
				System.out.println("Introduce los números deseados: ");
				num = leer.nextInt();
				if (num % 7 != 0) {
					numeros.add(num);
				}
			} catch (InputMismatchException ex) {
				System.err.println("El dato introducido no es correcto");
			} catch (Exception e) {
				System.err.println("Error general: " + e.getMessage());
			} finally {
				leer.nextLine();
			}
		} while (num % 7 != 0);
	}

	public static void mostrarNumeros(ArrayList<Integer> numeros) {
		System.out.println("Números en el ArrayList: ");
		for (Integer a : numeros) {
			System.out.print(a + " | ");
		}
	}

	public static void eliminarMayorQueCinco(ArrayList<Integer> numeros) {
		System.out.println("\nEliminados los números mayores que cinco");
		Iterator<Integer> it = numeros.iterator();
		while (it.hasNext()) {
			int valor = it.next();
			if (valor > 5) {
				it.remove();
			}
		}
		mostrarNumeros(numeros);

	}
}
