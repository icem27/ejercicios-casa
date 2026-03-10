package EjerciciosComparable;

public class Jugador implements Comparable<Jugador> {
	private String nombre;
	private int puntuacion;
	
	public Jugador(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}

//	@Override
//	public int compareTo(Jugador o) {
//		return Integer.compare(o.puntuacion, this.puntuacion);
//	}
	
	public int compareTo(Jugador o) {
		int compara = Integer.compare(o.puntuacion, this.puntuacion);
		if(compara!=0) {
			return compara;
		}
		
		return this.nombre.compareTo(o.nombre);
		
	}
	
}
