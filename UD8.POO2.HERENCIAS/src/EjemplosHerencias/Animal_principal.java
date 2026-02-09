package EjemplosHerencias;

public class Animal_principal {

	public static void main(String[] args) {
		Perro perro = new Perro("Rocky", "Perro", 2, "Pastor Aleman");
		perro.comer();
		perro.ladrar();
		System.out.println(perro);
	}

}
