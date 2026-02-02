package RepasoFinal;

public class Atleta {
	static int contarAtletas=0;
	static String seleccion="España";
	static double tiempoEquipo=0;
	private int identificador;
	private String nombre;
	private double tiempo;
	
	public Atleta(String nombre, double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.identificador+=contarAtletas;
		contarAtletas++;
		tiempo();
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [identificador=" + identificador + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
	}
	
	public void tiempo() {
		tiempoEquipo+=tiempo;
	}
	
	static String equipoNombre() {
		return seleccion;
	}
	
	
}
