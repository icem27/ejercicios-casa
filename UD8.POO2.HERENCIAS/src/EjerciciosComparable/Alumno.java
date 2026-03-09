package EjerciciosComparable;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private int edad;
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		return Integer.compare(this.edad, o.edad);
	}
	
	
	
	
}
