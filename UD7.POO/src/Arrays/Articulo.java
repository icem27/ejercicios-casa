package Arrays;

public class Articulo {
	private String nombre;
	private int stock;
	private double precio;
	
	public Articulo(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void aumentarStock(int cantidad) {
		this.stock+=cantidad;
	}
	
	public void disminuirStock(int cantidad) {
		this.stock-=cantidad;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "- " + nombre + " (Stock:" + stock + ")";
	}
	
	
}
