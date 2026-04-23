package Examen;

public class Deportista {
	private String nombre;
	private String deporte;
	private int edad;
	private int puntuación;

	public Deportista(String nombre, String deporte, int edad, int puntuación) {
		this.nombre = nombre;
		this.deporte = deporte;
		this.edad = edad;
		this.puntuación = puntuación;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDeporte() {
		return deporte;
	}
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPuntuación() {
		return puntuación;
	}
	public void setPuntuación(int puntuación) {
		this.puntuación = puntuación;
	}
	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", deporte=" + deporte + ", edad=" + edad + ", puntuación=" + puntuación
				+ "]";
	}
}