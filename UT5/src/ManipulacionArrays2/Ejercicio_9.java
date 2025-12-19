package ManipulacionArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_9 {
	/*
	 * Crear un programa que lea por teclado un número entero (cualquiera) y que
	 * almacene el mismo en un array de modo que cada cifra ocupe un elemento del
	 * array.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
		String numLetra = "";
		
		System.out.println("Introduce un número: ");
		leer.close();
		num = leer.nextInt();
		numLetra+=num;
		String[] cantidad= new String[numLetra.length()];
		for(int i=0;i<numLetra.length();i++) {
			cantidad[i]=numLetra.substring(i, i+1);
		}
		System.out.println("El resultado es: " + Arrays.toString(cantidad));

	}

}
