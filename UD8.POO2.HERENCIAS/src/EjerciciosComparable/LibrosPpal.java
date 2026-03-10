package EjerciciosComparable;

import java.util.Arrays;

public class LibrosPpal {

	public static void main(String[] args) {
		Libros l1 = new Libros("La sagrada", "Alberto Gonzales", 264);
		Libros l2 = new Libros("El lunar", "Pedro Almodovar", 243);
		Libros l3 = new Libros("La perla", "Alvaro Cruz", 154);
		Libros l4 = new Libros("El niño que voló", "Sara Soto", 856);
		Libros l5 = new Libros("Érase una vez", "Sofia Catalá", 364);
		
		Libros[] libro = {l1, l2, l3, l4, l5};
		Arrays.sort(libro);
		
		for(Libros l:libro) {
			System.out.println(l);
		}
		
	}

}
