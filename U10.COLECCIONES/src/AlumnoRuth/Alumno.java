package AlumnoRuth;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	
	public Alumno(String nombre){
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
		return Objects.hash(nombre);//aqui va el criterio
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o==null || getClass()!=o.getClass()) {
			return false;
		}
		Alumno a=(Alumno) o;
		return (this.nombre.equals(a.nombre));//cuando será igual
		//return (this.tipo.equals(p.tipo));
	}

	@Override
	public int compareTo(Alumno o) {
		// TODO Auto-generated method stub
		
		return this.nombre.compareTo(o.nombre);
	}
	
	

}
