package Ejercicio1;

public class ConvCadena05 {

	public static void main(String[] args) {
		int a=0;
		try {
			String letra = "1";
			a = Integer.parseInt(letra);
		} catch (NumberFormatException x) {
			System.out.println("El valor introducido no es correcto");
			System.out.println(x.getMessage());
		} finally {
			System.out.println("Xao");
		}
		System.out.println(a);
	}

}
