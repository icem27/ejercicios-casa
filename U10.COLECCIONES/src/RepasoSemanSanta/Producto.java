package RepasoSemanSanta;

public class Producto {

	private String nombre;
	private int cantidad;
	private double precio;

	private static int num = 1;

	private String generarNombre() {
		return "Producto" + num++;
	}

	private int generarCantidad() {
		return (int) (Math.random() * 10 + 1);
	}

	private double generarPrecio() {

		return (double) ((int) (Math.random() * 10000 + 1)) / 100;
	}

	public Producto() {
		nombre = generarNombre();
		cantidad = generarCantidad();
		precio = generarPrecio();
	}

	public double precioTotal() {
		return cantidad * precio;
	}

	@Override
	public String toString() {
		return nombre + "\t" + cantidad + "\t" + precio + "\t" + String.format("%.2f", precioTotal());
	}

}
