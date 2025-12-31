package Ejercicios_repaso;

public class Ejercicio_4 {
	/*
	 * Crea una función que reciba un número n y dibuje un cuadrado de n x n usando
	 * *.
	 */
	public static void main(String[] args) {
		int n=5;
		dibujo_tabla(n);
	}
	public static void dibujo_tabla(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
