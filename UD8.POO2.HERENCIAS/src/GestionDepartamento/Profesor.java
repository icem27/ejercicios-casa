package GestionDepartamento;

import java.util.Arrays;

public class Profesor {
	private String nombre;
	private String apellidos;
	private Modulo[] modulo;
	
	public Profesor(String nombre, String apellidos, Modulo[] modulo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos + "\n " + Arrays.toString(modulo);
	}

}
