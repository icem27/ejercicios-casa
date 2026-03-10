package EjerciciosComparable;

public class Producto implements Comparable<Producto>{
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Producto o) {
		return Double.compare(this.precio, o.precio);
	}
	
	
}
