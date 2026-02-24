package Difraces;

public enum Categoria {
	HISTORICO(10), TERROR(15), SUPERHEROE(8), OTROS(2);
	
	private double descuento;
	private String descripcion;
	
	Categoria(double descuento){
		this.descuento=descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
