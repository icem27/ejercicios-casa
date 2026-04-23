package arrayList;

//<<<<<<< HEAD
//public class Persona implements Comparable<Persona> {
//	private String nombre;
//	private String apellido;
//	
//	Persona(String nombre, String apellido) {
//		this.nombre = nombre;
//		this.apellido = apellido;
//	}
//	
//	@Override
//	public String toString() {
//		return "Nombre: " + nombre + " y el apellido es: " + apellido;
//	}
//	
//	public int compareTo(Persona p) {
//		return (this.apellido).compareTo(p.apellido);
//=======
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
//>>>>>>> branch 'master' of https://github.com/icem27/ejercicios-casa.git
	}

}
