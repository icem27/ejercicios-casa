package Almacen;

public class Software extends Articulo {
	private String tipo_software;

	public Software(String codigo, String nombre, double precio, int totalArticulo, String tipo_software) {
		super(codigo, nombre, precio, totalArticulo);
		this.tipo_software = tipo_software;
	}

	public String getTipo_software() {
		return tipo_software;
	}

	public void setTipo_software(String tipo_software) {
		this.tipo_software = tipo_software;
	}
	
}
