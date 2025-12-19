package EstructurasRepetetivas;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Obtener un listado de todos los números del -30 al 30.
		// Para los números que se encuentren entre 0 y 8 sólo aparecerán los pares.

		for (int i = -30; i <= 30; i++) {
			if (i < 8 && i >= 0) {
				if (i % 2 == 0) {
					System.out.println(i);
				} // i++;
			} else {
				System.out.println(i);
			}
		}

	}

}
