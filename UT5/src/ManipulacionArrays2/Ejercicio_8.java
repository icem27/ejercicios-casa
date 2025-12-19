package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_8 {
	/*
	 * Dado el siguiente array de Strings [“Coche”, “Tren”, “Avión”, “Furgoneta”,
	 * “Moto”, “Barco”, “Autobús”] y este otro array de booleanos [false, true,
	 * true, false, true, true, false].
	 * 
	 * El segundo array indica qué elementos del primero han de ser pasados a
	 * mayúsculas (true) y cuales a minúsculas (false).
	 * 
	 * Separar el resultado en dos arrays, uno donde estén todos los
	 * correspondientes en mayúsculas y otro con los otros en minúsculas. No debe de
	 * haber posiciones vacías.
	 */

	public static void main(String[] args) {
		String[] palabras = {"coche", "Tres", "Avión", "Furgoneta", "Moto", "Barco", "Autobús"};
		boolean[] verdaderoFalso = {false, true, true, false, true, true, false};
		String[] mayuscula= new String[4];
		String[] minuscula= new String[3];
		
		int indiceMay=0, indiceMin=0;
		for(int i=0;i<palabras.length;i++) {
			if(verdaderoFalso[i]==true) {
				palabras[i]=palabras[i].toUpperCase();
				mayuscula[indiceMay]=palabras[i];
				indiceMay++;
			} else {
				palabras[i]=palabras[i].toLowerCase();
				minuscula[indiceMin]=palabras[i];
				indiceMin++;
			}
		}
		System.out.println(Arrays.toString(palabras));
		System.out.println(Arrays.toString(mayuscula));
		System.out.println(Arrays.toString(minuscula));
	}

}
