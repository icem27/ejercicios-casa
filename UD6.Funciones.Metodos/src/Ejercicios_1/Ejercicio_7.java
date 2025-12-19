package Ejercicios_1;

public class Ejercicio_7 {
	/*
	 * Crea el método mostrarTablaMultiplicar que muestre por pantalla la tabla de
	 * multiplicar del número recibido como parámetro. Escribe también un programa
	 * que pruebe la función.
	 * 
	 * public static void mostrarTablaMultiplicar ( int num )
	 */
	public static void main(String[] args) {
		int num=5;
		mostrarTablaMultiplicar(num);
	}
	
	public static void mostrarTablaMultiplicar(int n) {
		int resultado=0;
		for(int i=0;i<=10;i++) {
			resultado = i*n;
			System.out.println(i+"x"+n +": " + resultado);
		}
	}

}
