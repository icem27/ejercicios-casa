package Ejemplos;

public enum TipoPelicula {
ESTRENO(9), ANTIGUA(6);
	private double precio;
	
	TipoPelicula(double precio){
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
