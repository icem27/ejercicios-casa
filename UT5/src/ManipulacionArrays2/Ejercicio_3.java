package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_3 {
	/*
	 * Coger la frase “Esta es la frase que vamos a partir” y obtener un array donde
	 * en cada posición esté una palabra de la frase. No utilizar el método split()
	 * de la clase String.
	 */

	public static void main(String[] args) {
		String frase = "Esta es la frase que vamos a partir";
		int contadorPalabras = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contadorPalabras++;
			}
		}
		
		String[] palabras= new String[contadorPalabras+1];
		
		//Solución usando el FOR
		int indice=0;
		int inicio=0;
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == ' ') {
			palabras[indice]=frase.substring(inicio, i);
			inicio = i;
			indice++;
			} else if (i==frase.length()-1) {
				palabras[indice]=frase.substring(inicio);
			}
			
		}
		
		System.out.println(Arrays.toString(palabras));

	}

}
