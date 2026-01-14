package ejemplos;

public class Principal {

	public static void main(String[] args) {
//		Persona p1 = new Persona();
//		p1.nombre="María";
//		p1.edad=20;
//		p1.saluda();
		
		Perro perro1 = new Perro();
		perro1.nombre = "Rocky";
		perro1.raza = "Pastor Aleman";
		perro1.color = "Negro";
		perro1.tamanio = "Grande";
		System.out.println("El perro " + perro1.nombre + " está ");
		perro1.comer();
		perro1.ladrar();
		
		Perro perro2 = new Perro();
		perro2.nombre = "Max";
		perro2.color =  "Blanco";
		perro2.raza = "Propia";
		perro2.tamanio = "Mediano";
		System.out.println("El perro " + perro2.nombre + " está ");
		perro2.comer();
		perro2.jugar();
		
		Perro perro3=new Perro("Chiuaua", "Gris", "Jack", "Pequeño");
		System.out.println("El perro " + perro3.nombre + " es de tamaño " + perro3.tamanio);
	}

}
