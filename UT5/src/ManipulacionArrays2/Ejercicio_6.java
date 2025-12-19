package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_6 {
	/*
	 * A partir del siguiente array de caracteres [‘a’, ‘b’, ‘f’, ‘g’, ‘e’, ‘i’,
	 * ‘o’, ‘p’, ‘x’], obtener un array de Strings donde los caracteres del array
	 * anterior estén agrupados de 3 en 3. Es decir, obtener el array [“abf”, “gei”,
	 * “opx”]
	 * 
	 */

	public static void main(String[] args) {
		char[] letras = {'a', 'b', 'f', 'g', 'e', 'i','o', 'p', 'x'};
		String[] cadenas = new String[letras.length/3];
		
		int indice=0;
		
		for(int i=0;i<cadenas.length;i++) {
			cadenas[i]="";
		}
		for(int i=0;i<letras.length;i++) {
			if(i%3==0 && i!=0) {
				indice++;
			}
			cadenas[indice]=cadenas[indice]+letras[i];
		}
		System.out.println(Arrays.toString(cadenas));
	}

}
