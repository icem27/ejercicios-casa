package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<String>();
		
		String palabra="";
		
		do {
			
			try {
				System.out.println("Introduce la palabra, o 'n' para salir");
				palabra = leer.nextLine();
				if(!palabra.equals("n")) {
					palabras.add(palabra);
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Error");
				leer.nextLine();
			}
			
		} while(!palabra.equals("n"));
		
		System.out.println("Orden normal: ");
		
		for(String a:palabras) {
			System.out.println(a);
		}
		
		System.out.println("Orden inverso: ");
		mostrarPalabras(palabras);
		
	}
	
	public static void mostrarPalabras(ArrayList<String> palabras) {
		for(int i=palabras.size()-1;i>=0;i--) {
			System.out.println(palabras.get(i));
		}
	}
}
