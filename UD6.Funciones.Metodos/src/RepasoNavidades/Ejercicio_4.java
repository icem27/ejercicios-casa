package RepasoNavidades;

public class Ejercicio_4 {
	/*
	 * Crea una función que dibuje un árbol de Navidad en función del tamaño que le
	 * llegue como parámetro
	 * 
	 */

	public static void main(String[] args) {
		int numero=3;
		arbol(numero);
	}
	public static void arbol(int num) {
		int uno=0;
		int filas = num - uno;
		for(int i=0;i<filas+1;i++) {
			for(int j=0;j<filas-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i+1);j++) {
				System.out.print("*");
			}
			for(int j=0;j<filas-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
			uno++;
		}
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas;j++) {
				System.out.print(" ");
			}
			System.out.print("+");
			for(int j=0;j<filas;j++) {
				System.out.print(" ");
			}
			System.out.println();
			uno++;
		}
	}

}
