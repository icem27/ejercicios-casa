package HashSet;

import java.util.Objects;

public class Producto {
	private int codigo;
	private String nombre;
	private String tipo;
	private Double precio;
	private int stock;
	
	public Producto(int codigo, String nombre, String tipo, Double precio, int stock) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.stock = stock;
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		} 
		if(this== null || getClass()!=o.getClass()) {
			return false;
		}
		Producto p=(Producto)o;
		return (p.codigo==this.codigo);
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
}
