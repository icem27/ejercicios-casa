package EjerciciosCharacter;

import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		/*Captura un caracter e indica si es una letra,  un dígito o cualquier otro tipo de carácter. 
		 * Si es una letra debe indicar además si está en mayúscula o minúscula. 
		Para leer el caracter no debes utilizar la clase Scanner, sino utilizar 
		(char)System.in.read();  recuerda que debes añadir throws  java.io.IOException 
		a continuación de la declaración del método main*/
		
		
		System.out.println("Introduce una letra: ");
		char letra=(char)System.in.read();
		
		if(Character.isAlphabetic(letra)) {
			if(Character.isUpperCase(letra)) {
				System.out.println("Letra, está en mayúsculas");
			} else {
			System.out.println("Letra, está en minúsculas");
		}
		} else if (Character.isDigit(letra)) {
			System.out.println("Es un número");
		} else {
			System.out.println("Es otro tipo de caracter");
		}
		

	}

}
