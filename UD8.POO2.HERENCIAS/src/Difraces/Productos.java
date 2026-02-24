package Difraces;

public class Productos {
	private static final double IVA = 0.21;
	private int codigo;
	private String nombre;
	private boolean estado;
	private double precio = 15;
	
	public Productos(int codigo, String nombre, boolean estado, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
		this.precio = precio;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public static double getIva() {
		return IVA;
	}
	
	public double calcularPrecio(int dia) {
		return 0;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean alquiler(){
		if(estado) {
			return true; 
		} else {
			return false;
			
		}
	}
	
	public boolean devolver() {
		if(estado) {
			return true; 
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "";
	}
}
