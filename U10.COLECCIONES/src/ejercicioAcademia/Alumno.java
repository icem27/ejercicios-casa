package ejercicioAcademia;

import java.util.Objects;

public class Alumno  {

	private String nombre;

	Alumno(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public String getNombre() {
		return nombre;
	}


	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o) {
			return true;
		}
		
		if (o.getClass() == this.getClass()) {
			Alumno a = (Alumno) o;
			return a.nombre.equals(this.nombre);
		} 
		
		if(o.hashCode() == this.hashCode()) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(nombre);
	}

	
}
