package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		/*
		 * Vamos a implementar un programa Java que pida por teclado las alturas de N
		 * alumnos de una clase y las guarde en un ArrayList de tipo Double. A
		 * continuación el programa calculará cuantos alumnos hay más altos que la media
		 * y cuantos más bajos.
		 * 
		 * El programa debe manejar los posibles errores que se puedan producir.
		 * 
		 * Ayuda: Para resolverlo vamos a utilizar 4 métodos además del método main:
		 * 
		 * Método numeroAlumnos(): este método pide por teclado el número de alumnos de
		 * la clase y devuelve dicho número al programa principal. Método leerAlturas():
		 * pide por teclado las alturas de los N alumnos y las almacena en el ArrayList.
		 * Este método recibe como parámetros el ArrayList inicialmente vacío y el
		 * número de alumnos a leer. Método calcularMedias(): calcula y devuelve la
		 * media de los alumnos de la clase. Este método recibe como parámetro el
		 * ArrayList con las alturas de todos los alumnos. Método mostrarResultados():
		 * muestra por pantalla todas las alturas y calcula y muestra el número de
		 * alumnos con altura superior e inferior a la media. Recibe como parámetros el
		 * ArrayList con las alturas de todos los alumnos y la media calculada
		 * anteriormente.
		 */

		ArrayList<Double> alumnos = new ArrayList<Double>();

		int n = numeroAlumnos();
		leerAlturas(n, alumnos);
		mostrarResultados(alumnos, calcularMedias(alumnos));

	}

	public static int numeroAlumnos() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Indica el número de alumnos");
				int n = sc.nextInt();
				if (n < 0)
					throw new InputMismatchException();
				return n;
			} catch (InputMismatchException e) {
				System.out.println("Valor no válido");
				sc.nextLine();
			}
		}
	}

	public static void leerAlturas(int n, ArrayList<Double> alturas) {
		Scanner sc = new Scanner(System.in);

		while (alturas.size() < n) {
			try {
				System.out.println("Introduce la altura del alumno " + (alturas.size() + 1));
				double altura = sc.nextDouble();
				if (altura < 0)
					throw new InputMismatchException();
				alturas.add(altura);
			} catch (InputMismatchException e) {
				System.out.println("Altura inválida");
				sc.nextLine();
			}
		}

	}

	public static double calcularMedias(ArrayList<Double> alturas) {
		double suma = 0;
		for (int i = 0; i < alturas.size(); i++)
			suma += alturas.get(i);
		return suma / alturas.size();
	}

	public static void mostrarResultados(ArrayList<Double> alturas, double media) {
		System.out.println("La media de alturas es " + media);
		int menores = 0, mayores = 0, iguales = 0;
		for (int i = 0; i < alturas.size(); i++) {
			System.out.println("Alumno " + (i + 1) + ": " + alturas.get(i));
			if (alturas.get(i) > media)
				mayores++;
			else if (alturas.get(i) < media)
				menores++;
			else
				iguales++;
		}
		System.out.println("Alumnos por encima de la media: " + mayores);
		System.out.println("Alumnos por debajo de la media: " + menores);
		System.out.println("Alumnos por en la media: " + iguales);

	}

}
