package Ejercicios_1;

public class Ejercicio_8 {
	/*
	 * Escribe una función llamada EsDigito que devuelva un valor lógico o booleano
	 * que determine si un carácter es uno de los dígitos del 0 al 9.
	 * 
	 * Escribe un programa que pruebe la función.
	 * 
	 * public static boolean esDigito ( char letra )
	 */

	public static void main(String[] args) {
		char num='1';
		
		System.out.println(esDigito(num));
		

	}
	public static boolean esDigito(char letra) {
		boolean resultado;
		if(Character.isDigit(letra)) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
