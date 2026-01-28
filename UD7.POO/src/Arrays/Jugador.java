package Arrays;

public class Jugador {
	/*
	 * Crea una clase Jugador con atributos nombre y golesMarcados. Luego, crea un
	 * array con 5 jugadores y muestra el nombre del jugador con más goles.
	 */
	private String nombre;
	private int golesMarcados;
	
	public Jugador(String nombre, int golesMarcados) {
		super();
		this.nombre = nombre;
		this.golesMarcados = golesMarcados;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(int golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	@Override
	public String toString() {
		return "El nombre: " + nombre + " tiene " + golesMarcados;
	}
	
	
	
}
