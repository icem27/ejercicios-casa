package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_7 {
	/*
	 * Coger la siguiente frase “Esta es la frase del ejercicio siete” y obtener dos
	 * arrays de caracteres, uno donde estén todas las consonantes y otro donde
	 * estén todas las vocales.
	 */
	public static void main(String[] args) {
		String frase="Esta es la frase del ejercicio siete";

		frase = frase.replace(" ", "");
		frase = frase.toUpperCase();
		int conVocal=0;
		int conConso=0;
		char[] vocales = new char[conVocal];
		char[] constante = new char[conConso];;
		int moverVocal=0;
		int moverConso=0;
		for(int i=0;i<frase.length();i++) {
			char letra=frase.charAt(i);
			if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				vocales[moverVocal]=letra;
				conVocal++;
			} else {
				vocales[moverConso]=letra;
				conConso++;
			}
		}
		
		System.out.println(Arrays.toString(vocales));
		System.out.println(Arrays.toString(constante));
		
	}

}
