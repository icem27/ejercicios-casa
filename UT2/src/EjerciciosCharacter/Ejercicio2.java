package EjerciciosCharacter;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Capturar por pantalla una frase cualquiera.
		El programa debe calcular y mostrar por pantalla cuántas letras, 
		dígitos y espacios en blanco hay recorriendo la cadena.*/
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Introduce una frase: ");
		String frase=leer.nextLine();
		int contadorLetras=0, contadorNumeros=0, contadorEspacio=0;
		
		for(int i=0; i<frase.length();i++) {
			char letra = frase.charAt(i);
			
			
		}

	}

}
