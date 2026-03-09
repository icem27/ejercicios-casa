package EjemplosHerencias;

import java.util.Arrays;

public class Animal_principal {

	public static void main(String[] args) {
		Perro perro = new Perro("Rocky", "Perro", 6, "Pastor Aleman");
		Perro perro2 = new Perro("Rocky 2", "Perro 2", 4, "Pastor Aleman 2");
		perro.comer();
		perro.ladrar();
		
		Perro[] perros = {perro, perro2};
		Arrays.sort(perros);
		
		for(Perro p: perros) {
			System.out.println(p);
		}
	}

}
