package Arrays;

public class Atracion {
	/*
	 * Crea una clase Atraccion con atributos nombre y alturaMinima(en metros). Crea
	 * un array con 5 atracciones y muestra todas las que requieren una altura
	 * mínima mayor a 1.40 metros.
	 */
	
	private String nombre;
	private double alturaMinima;
	
	public Atracion(String nombre, double alturaMinima) {
		this.nombre = nombre;
		this.alturaMinima = alturaMinima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAlturaMinima() {
		return alturaMinima;
	}

	public void setAlturaMinima(double alturaMinima) {
		this.alturaMinima = alturaMinima;
	}

	@Override
	public String toString() {
		return nombre + " con altura mínima " + String.format("%.2f", alturaMinima) + " metros";
	}
	
	
}
