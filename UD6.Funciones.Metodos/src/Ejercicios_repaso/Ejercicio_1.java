package Ejercicios_repaso;

public class Ejercicio_1 {
	/*
	 * Crea una función que reciba un número entero y muestre por pantalla si es:
	 */

	public static void main(String[] args) {
		int n = 5;
		esPositivo(n);
	}

	public static void esPositivo(int n) {
		if(n>0) System.out.println("Es positivo");
		else if (n<0) System.out.println("Es negativo"); 
		else System.out.println("Es un cero");
	}
}
