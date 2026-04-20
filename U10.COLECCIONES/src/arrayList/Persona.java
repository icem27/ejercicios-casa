package arrayList;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private String apellidos;
	private int edad;
	
	Persona(String nombre, String apellidos, int edad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	@Override
	public String toString() {
		return "Persona: " + nombre + " " + apellidos + " " + edad;
	}

	@Override
	public int compareTo(Persona o) {
		return Integer.compare(this.edad, o.edad);
	}

}
