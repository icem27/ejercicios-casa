package Arrays;

public class Estudiante {
	private String nombre;
	private int edad;
	private double notaMedia;
	
	public Estudiante(String nombre, int edad, double notaMedia) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Nombre=\n" + nombre + "\nEdad=\n" + edad + "\nNota media=" + notaMedia + "\n";
	}
	
	
}
