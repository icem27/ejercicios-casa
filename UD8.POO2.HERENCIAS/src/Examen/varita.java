package Examen;

public class varita {
	private static int totMalitos=0;//totMalitos debe ser estatico por que lo compartes todos los objetos de la clase
	private String nombre;
	private String nombreClase;
	private boolean muerto;
	
	varita() {//lo incluimos en el constructor por defecto para que sube cada vez que se crea un nuevo alumno
		totMalitos++;
	}
	//Este es el metodo que retorna el valor de totMalitos, todos los alumnos que han sido creados
	public static int getTotMalitos() {
		return totMalitos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}

	public boolean isMuerto() {
		return muerto;
	}

	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}
	
}
