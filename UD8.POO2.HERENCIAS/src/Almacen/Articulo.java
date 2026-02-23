package Almacen;

public class Articulo {
	protected String codigo;
	protected String nombre;
	protected double precio;
	protected int totalArticulo;
	
	public Articulo(String codigo, String nombre, double precio, int totalArticulo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.totalArticulo = totalArticulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getTotalArticulo() {
		return totalArticulo;
	}

	public void setTotalArticulo(int totalArticulo) {
		this.totalArticulo = totalArticulo;
	}

}
