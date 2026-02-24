package Difraces;

public enum Categoria {
	HISTORICO(10, "Categoria de historico"), TERROR(15, "Categoria de Terror"), SUPERHEROE(8, "Categoria de Superheroe"), OTROS(2, "Categoria de otros");
	
	private double descuento;
	private String descripcion;
	
	Categoria(double descuento, String descripcion){
		this.descuento=descuento;
		this.descripcion=descripcion;
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
