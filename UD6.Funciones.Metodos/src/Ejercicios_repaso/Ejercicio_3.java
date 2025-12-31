package Ejercicios_repaso;

public class Ejercicio_3 {
	/*
	 * Crea una función que reciba un número y muestre su tabla de multiplicar del 1
	 * al 10.
	 */
	public static void main(String[] args) {
		int n=9;
		tabla_multiplicacion(n);
	}
	
	public static void tabla_multiplicacion(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+(i*n));
		}
	}
}
