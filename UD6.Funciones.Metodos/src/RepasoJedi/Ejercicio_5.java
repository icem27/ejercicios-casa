package RepasoJedi;

public class Ejercicio_5 {
	/*
	 * Escribe una función que muestre por pantalla un triángulo como el del
	 * ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y
	 * el número de líneas del triángulo.
	 */

	public static void main(String[] args) {
		String cara="^";
		int fila=10;
		triangulo(cara, fila);
	}
	public static void triangulo(String caracter, int filas) {
		for(int i=0;i<filas;i++) {
			for(int j=0;j<filas-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*i)+1;j++) {
				System.out.print(caracter);
			}
			for(int j=0;j<filas-i;j++) {
				System.err.print(" ");
			}
			System.out.println();
		}
	}

}
