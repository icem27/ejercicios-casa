package TiendaAnimales;

public class Perros extends Animales {
	public String tipo;
	public char tamanio;
	public double precio_venta;

	public Perros(String tipo, double precio_venta, char tamanio) {
		super();
		this.precio_compra=50;
		this.tipo = tipo;
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public char getTamanio() {
		return tamanio;
	}

	public void setTamanio(char tamanio) {
		this.tamanio = tamanio;
	}

	public double getPrecio() {
		return precio_venta;
	}

	public void setPrecio(double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	@Override
	public void mostrar() {
		System.out.println(nombre + " edad en meses: " + meses + " precio venta: " + precio_venta + " - " + vendido);
	}

}
