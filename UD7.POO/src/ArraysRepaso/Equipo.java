package ArraysRepaso;

public class Equipo {
	/*
	 * Crea una clase Equipo con atributos nombre y partidosGanados. En el main,
	 * crea un array con 6 equipos y muestra el equipo con más victorias.
	 */
	
	private String nombre;
	private int partidosGanados;
	
	public Equipo(String nombre, int partidosGanados) {
		super();
		this.nombre = nombre;
		this.partidosGanados = partidosGanados;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPartidosGanados() {
		return partidosGanados;
	}
	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", partidosGanados=" + partidosGanados + "]";
	}
	
	
}
