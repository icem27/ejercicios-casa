package ejercicioAcademia;

import java.util.ArrayList;
import java.util.HashSet;

public class ListaAlumnos{

	private ArrayList<Alumno> alumnos;

	ListaAlumnos() {
		this.alumnos = new ArrayList<Alumno>();
	}
	
	void anadirAlumno(Alumno a) {
		alumnos.add(a);
	}
	
	
	void recorrerLista() {
		for (Alumno a : alumnos) {
			System.out.println(a.getNombre());
		}
	}

	HashSet<Alumno> sinDuplicados(){
		HashSet<Alumno> alumnosSinDuplicar = new HashSet<Alumno>(alumnos);
		return alumnosSinDuplicar;
	}	
	
	int calcularTamano() {
		return alumnos.size();
		
	}
}
