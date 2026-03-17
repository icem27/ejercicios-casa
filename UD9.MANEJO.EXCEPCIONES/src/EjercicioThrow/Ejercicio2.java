package EjercicioThrow;

public class Ejercicio2 {

	public static void main(String[] args) {
		try {
			System.out.println(dividir(3,1));
		} catch (ArithmeticException x) {
			System.out.println(x.getMessage());
		}

	}
	
	public static double dividir(double a, double b) {
		if (b==0) {
			throw new ArithmeticException("No se puede dividir entre 0");
		} else {
			return a/b;
		}
	}

}
