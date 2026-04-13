package HashSet;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	private String nombre;
	
	Alumno(String nombre){
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		} 
		if(this== null || getClass()!=o.getClass()) {
			return false;
		}
		Alumno p=(Alumno)o;
		return (p.nombre.equals(this.nombre));
	}

	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.nombre);
	}
	
	
}
