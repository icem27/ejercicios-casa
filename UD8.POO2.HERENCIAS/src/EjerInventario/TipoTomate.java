package EjerInventario;

public enum TipoTomate {
	CHERRY(6), PERA(4), KUMATO(7);
	
	private double precio;
	
	TipoTomate(double precio) {
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
