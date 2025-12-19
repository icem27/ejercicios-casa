package EstructurasRepetetivas;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Obtener un listado de los números pares entre -20 y 0 y a partir del 0 
		// un listado de los números impares entre 1 y 21.

		for (int i=-20; i<=21; i++) {
			if (i<=0 && 0>=-20) {
				if (i%2==0) {
					System.out.println(i);
				}
			} else {
				System.out.println(i);
				i++;
			}
			}

	}

}
