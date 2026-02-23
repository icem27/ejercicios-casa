package TiendaAnimales;

public enum TipoOrejas {
	ROJA(24), AMARILLAS(20);
	
	private double precio;
	
	TipoOrejas(double precio){
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
