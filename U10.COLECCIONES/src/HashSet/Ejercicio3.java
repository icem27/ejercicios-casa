package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea un conjunto que contenga 10 valores enteros (no menos) generados
		 * aleatoriamente entre 1 y 20.
		 * 
		 * Muestra por pantalla los elementos y el nº de iteraciones realizadas para
		 * conseguirlo
		 */

		HashSet<Integer> numeritos = new HashSet<Integer>();
		int iteraciones=0;
		do {
			int n = (int) (Math.random() * 20) + 1;
			numeritos.add(n);
			iteraciones++;
		} while (numeritos.size() != 10);

		for (int p : numeritos) {
			System.out.println(p);
		}
		System.out.println("Se ha realizado en " + iteraciones + " iteraciones");

	}

}
