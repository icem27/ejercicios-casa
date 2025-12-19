package EjerString;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Captura una frase por teclado y mostraremos todas las vocales en mayúsculas
		
		Scanner leer = new Scanner(System.in);
		String frase = "";
		System.out.println("Introduce una frase: ");
		frase = leer.nextLine();
		
		frase = frase.replace('a', 'A');
		frase = frase.replace('e', 'E');
		frase = frase.replace('i', 'I');
		frase = frase.replace('o', 'O');
		frase = frase.replace('u', 'U');
		
		System.out.println(frase);
		leer.close();

	}

}
