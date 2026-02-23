package TiendaAnimales;

public class Animales {
	protected String nombre;
	protected int meses;
	protected double precio_compra;
	protected boolean vendido;
	
	public Animales() {
		this.meses=1;
		this.vendido=false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	
	public void avanzarMeses() {
		this.meses++;
	}
	
	public void mostrar() {
		
	}
	
}
