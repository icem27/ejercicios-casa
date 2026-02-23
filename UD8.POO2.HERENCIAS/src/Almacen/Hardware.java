package Almacen;

public class Hardware extends Articulo {
	private boolean periferico;

	public Hardware(String codigo, String nombre, double precio, int totalArticulo, boolean periferico) {
		super(codigo, nombre, precio, totalArticulo);
		this.periferico = periferico;
	}

	public boolean isPeriferico() {
		return periferico;
	}

	public void setPeriferico(boolean periferico) {
		this.periferico = periferico;
	}
	
}
