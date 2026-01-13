package ejemplos;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre="María";
		p1.edad=20;
		p1.saluda();
		
		Perro perro1 = new Perro();
		perro1.nombre = "Rocky";
		perro1.raza = "Pastor Aleman";
		perro1.color = "Negro";
		perro1.tamanio = "Grande";
	}

}
