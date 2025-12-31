package Ejercicios_repaso;

public class Ejercicio_5 {
	/*
	 * Crea una función que reciba un número n y dibuje una escalera numérica.
	 */

	public static void main(String[] args) {
		int i=5;
		dibuja_escaleta(i);
	}
	public static void dibuja_escaleta(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
