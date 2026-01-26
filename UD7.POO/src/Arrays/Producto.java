package Arrays;

public class Producto {
	private String nombre;
	private int precio;
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + "]";
	}

	

}
