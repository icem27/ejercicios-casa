package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Desarrolla un programa que lea una serie de valores numéricos enteros desde
	 * el teclado y los guarde en un ArrayList de tipo Integer.
	 * 
	 * La lectura de números termina cuando se introduzca el valor -99. Este valor
	 * no se guarda en el ArrayList.
	 * 
	 * A continuación el programa mostrará por pantalla la cantidad de valores que
	 * se han leído, su suma y su media. Por último se mostrarán todos los valores
	 * leídos, indicando cuántos de ellos son mayores que la media.
	 * 
	 * NOTA: se deberán capturar las posibles excepciones que se produzcan
	 * 
	 * Ayuda: Vamos a utilizar 3 métodos además del método main para resolverlo:
	 * 
	 * Método leerValores(): pide por teclado los números y los almacena en el
	 * ArrayList. La lectura acaba cuando se introduce el valor -99. El método
	 * devuelve mediante return el ArrayList con los valores introducidos. Método
	 * calcularSuma(): Recibe como parámetro el ArrayList con los valores numéricos
	 * y calcula y devuelve su suma. En este método se utiliza un Iterator para
	 * recorrer el ArrayList. Método mostrarResultados(): Recibe como parámetro el
	 * ArrayList, la suma y la media aritmética. Muestra por pantalla todos los
	 * valores, su suma y su media, y calcula y muestra cuantos números son
	 * superiores a la media. En este método se utiliza un for para colecciones para
	 * recorrer el ArrayList.
	 */
	public static void main(String[] args) {

		try {
			ArrayList<Integer> l = leerValores();
			int suma = calcularSuma(l);
			int media = suma / l.size();
			mostrarResultados(l, suma, media);
		} catch (ArithmeticException e) {
			System.out.println("No hay elementos en la lista");
		}
	}

	public static ArrayList<Integer> leerValores() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int n = 0;
		System.out.println("Escribe números enteros. Termina con -99");
		while (n != -99) {
			try {
				n = sc.nextInt();
				if (n != -99)
					lista.add(n);
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		return lista;
	}

	public static int calcularSuma(ArrayList<Integer> l) {
		Iterator<Integer> it = l.iterator();
		int suma = 0;
		while (it.hasNext()) {
			suma += it.next();
		}
		return suma;
	}

	public static void mostrarResultados(ArrayList<Integer> l, int s, int m) {
		int sup = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i) > m)
				sup++;
			System.out.println("Valor " + (i + 1) + ": " + l.get(i));
		}
		System.out.println("Suma: " + s);
		System.out.println("Media: " + m);
		System.out.println("Superiores a la media: " + sup);
	}

}
