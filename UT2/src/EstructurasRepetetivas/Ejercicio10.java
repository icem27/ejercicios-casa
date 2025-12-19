package EstructurasRepetetivas;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Obtener la suma de todos los números impares entre 3 y 21
		// exceptuando el 13 y el 17.
		int suma = 0;
		for (int i = 3; i <= 21; i += 2) {
			if (i != 13 && i != 17) {
				suma += i;
			}
		}
		System.out.println(suma);
	}

}
