package Ejemplos;

public class Ejemplo_factorial {

	public static void main(String[] args) {
		System.out.println("4! es: " + facR(5));

	}
	static int facR(int n) {
		int resultado;
		if (n==1)
			return 1;
		resultado = facR(n-1)*n;
		return resultado;
	}
}
