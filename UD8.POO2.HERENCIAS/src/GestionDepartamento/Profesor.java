package GestionDepartamento;

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
	
	public String array() {
	    String text = "";
	    for (int i = 0; i < modulo.length; i++) {
	        text += (i+1) + ". " + modulo[i].getId() + modulo[i].name().substring(0,2) + ") " + modulo[i].getDescripcion() + "\n";
	    }
	    return text;
	}
	

	@Override
	public String toString() {
		return nombre + " " + apellidos + "\n" + array();
	}

}
