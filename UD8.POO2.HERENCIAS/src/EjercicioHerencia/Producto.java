package EjercicioHerencia;

public class Producto {
	protected String nombre;
	protected double precio;
	protected int stock;
	
	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre del producto: " + nombre + ", precio: " + precio + " con un stock de: " + stock);
	}
	

}
