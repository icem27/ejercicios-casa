package RepasoProg;

import java.util.Arrays;

public class Ejercicio_2 {
	/*Dado un array de enteros, crea una función que invierta su contenido.*/

	public static void main(String[] args) {
		int[] numeros= {1,2,3,4,5};
		System.out.println(Arrays.toString(ordenDescendente(numeros)));
	}
	public static int[] ordenDescendente(int[] numeros) {
		for(int i=0;i<numeros.length/2;i++) {
			int aux = numeros[i];
			numeros[i]=numeros[numeros.length-i-1];
			numeros[numeros.length-1-i]=aux;
		}
		return numeros;
	}

}
