package arrayList;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String apellido;
	
	Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + " y el apellido es: " + apellido;
	}
	
	public int compareTo(Persona p) {
		return (this.apellido).compareTo(p.apellido);
	}

}
