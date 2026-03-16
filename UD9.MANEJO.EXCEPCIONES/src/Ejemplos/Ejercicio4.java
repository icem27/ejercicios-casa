package Ejemplos;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] numerador = { 10, 25, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int[] denominador = { 2, 0, 5, 10 };
		try {
			
			for (int i = 0; i < numerador.length; i++) {
				try {
					int resultado = numerador[i] / denominador[i];
					System.out.println(resultado);
				} catch (ArithmeticException ae) {
					System.out.println("No se puede dividir por cero");
				}
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			//capturamos error si excedemos el tamaño del array
			System.out.println("No hay denominador");
			System.out.println("Adios!");
		}
	}
}
