package ArraysBi2;

import java.util.Arrays;

public class Ejercicio_2 {
	/*
	 * Solicita al usuario una frase, después crea un array bidimensional en el que
	 * cada fila sea una palabra de la frase y las columnas serán las letras que
	 * forman esas palabras.
	 * 
	 */

	public static void main(String[] args) {
		String frase= "Hola me llamo Ismael";
		String[] palabras=frase.split(" ");
		
		char[][] letras = new char[palabras.length][];
		
		for(int i=0;i<letras.length;i++) {
			String palabra = palabras[i];
			letras[i]=new char[palabras[i].length()];
			for(int j=0;j<palabras[i].length();j++) {
			letras[i][j]=palabra.charAt(j);
			}
		}
		System.out.println(Arrays.deepToString(letras));
	}

}
