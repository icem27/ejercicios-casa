package Ejemplos;

public class EjemploThrows {

	public static void main(String[] args) {
		try {
			dividir(3, 0);
		} catch (ArithmeticException x) {
			System.out.println("No se puede dividir entre 0 " + x.getMessage());
		}

	}
	
	public static int dividir(int a, int b) throws ArithmeticException {
		return a/b;
	}

}
