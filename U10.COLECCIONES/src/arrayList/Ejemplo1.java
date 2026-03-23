package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejemplo1 {
	public static void main(String[] args) {
		ArrayList<Integer> numeritos = new ArrayList<Integer>(); // Inicialmente de tamaño 10

		ArrayList<String> palabras = new ArrayList<String>(15); // Inicialmente de tamaño 15

		numeritos.add(5);
		numeritos.add(25);
		numeritos.add(15);
		numeritos.add(35);

		palabras.add("Hola");
		palabras.add("Adiós");
		palabras.add("Buenos días");

		int tamNumeritos = numeritos.size();
		System.out.println("Numerito tiene " + tamNumeritos);

		int tamPalabras = palabras.size();
		System.out.println("Palabras tiene " + tamPalabras);

//		System.out.println("El primer elemento de números es: " + numeritos.get(0));
//
//		int num = 25;
//		if (numeritos.contains(num))
//			System.out.println("Contiene el número " + num);
//		else
//			System.out.println("No lo contiene");
//
//		String pal = "Hola";
//		if (palabras.contains(pal))
//			System.out.println("Si contiene la palabra " + pal);
//		else
//			System.out.println("No contiene la palabra " + pal);
//
//		int posNumero = numeritos.indexOf(25); // Si no lo encuentra devuelve -1
//		System.out.println("El número buscado está en la posición " + posNumero);
//
//		int posPalabra = palabras.indexOf("Adiós");
//		System.out.println("La palabra buscada está en la posición " + posPalabra);
//
//		palabras.remove(1);
//		System.out.println("El tamaño de palabras es: " + palabras.size());
//		palabras.clear();
//		System.out.println("El tamaño de palabras es: " + palabras.size());
//
//		boolean vacioNumeritos = numeritos.isEmpty();
//		if (vacioNumeritos) System.out.println("Está vacío");
//		else System.out.println("No está vacio");
//		
//		ArrayList copiaNumeritos=(ArrayList)numeritos.clone();
//		
//		System.out.println("copiaNumeritos clonado: " + copiaNumeritos.size());
//		
//		
//		for(int i=0;i<tamNumeritos;i++) {
//			System.out.println(numeritos.get(i));
//		}
//		
//		for(int i=0;i<tamPalabras;i++) {
//			System.out.println(palabras.get(i));
//		}
		System.out.println("Antes del set");
		for(Integer b:numeritos) {
			System.out.println(b);
		}

		numeritos.set(1, 33);

		Collections.sort(numeritos);

		System.err.println("Numeritos despues del set: ");
		for(Integer b:numeritos) {
			System.out.println(b);
		}
		
		
		
		System.err.println("For chiquito: ");
		for(String a:palabras) {
			System.out.println(a);
		}
		
		
		
	}
}
