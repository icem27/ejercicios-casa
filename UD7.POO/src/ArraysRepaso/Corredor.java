package ArraysRepaso;

public class Corredor {
	/*
	 * Crea una clase Corredor con atributos nombre y tiempo (en minutos). Luego,
	 * crea un array con 5 corredores y muestra el ganador (el que tenga menor
	 * tiempo).
	 */
	
	private String nombre;
	private int tiempo;
	
	public Corredor(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getTiempo() {
		return tiempo;
	}
	
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return nombre + " con " + tiempo + " minutos";
	}
	
	
	
}
