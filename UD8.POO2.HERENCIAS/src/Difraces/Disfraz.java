package Difraces;

public class Disfraz extends Productos {
	private Talla talla;
	private Categoria categoria;
	
	public Disfraz(int codigo, String nombre, boolean estado, double precio, Talla talla) {
		super(codigo, nombre, estado, precio);
		this.talla=talla;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}
	
	@Override
	public double calcularPrecio(int dia) {
		double precio;
		return precio=super.getPrecio()*dia;
	}
	
	@Override
	public String toString() {
		return "DISFRACES -- #D000" +  categoria.getDescripcion() + " - " + super.isEstado() + " - " + super.getPrecio() + "/día" + " talla: " + talla.values();
	}
	
}
	
