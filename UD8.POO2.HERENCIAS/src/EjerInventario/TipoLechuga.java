package EjerInventario;

public enum TipoLechuga {
	ROMANA(2), ICEBERG(3), RIZADA(2.5);
	
	private double precio;
	
	TipoLechuga(double precio) {
		this.precio=precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
