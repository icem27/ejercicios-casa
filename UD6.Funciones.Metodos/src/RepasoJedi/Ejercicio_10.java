package RepasoJedi;

public class Ejercicio_10 {
	/*
	 * Realiza un programa que solicite los tres lados de un triángulo y compruebe
	 * si un triángulo es rectángulo.
	 * 
	 * Recuerda que un triángulo es rectángulo si cumple el Teorema de Pitágoras:
	 * 
	 * x ² + y ² = z ²
	 * 
	 * El programa solicitará al usuario los valores x, y, z.
	 * 
	 * Se creará una función a la que se le pase x, y, z y devuelva el triángulo es
	 * o no rectángulo Por ejemplo: 3 ² + 4 ² = 5 ².
	 */

	public static void main(String[] args) {
		double x= 5;
		double y= 6;
		double z=8;
		
		pitagoras(x, y, z);
	}
	public static void pitagoras(double x, double y, double z) {
		double k = Math.pow(y, 2);
		double o = Math.pow(y, 2);
		double p = Math.pow(z, 2);
		if((k+o)==p) {
			System.out.println("Es rectángulo");
		} else {
			System.out.println("No es rectángulo");
		}
	}

}
