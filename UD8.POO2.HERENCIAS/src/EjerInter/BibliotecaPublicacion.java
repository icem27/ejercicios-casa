package EjerInter;

public abstract class BibliotecaPublicacion {
	private int codigo;
	private int anyoPublicacion;
	
	public BibliotecaPublicacion(int codigo, int anyoPublicacion) {
		this.codigo = codigo;
		this.anyoPublicacion = anyoPublicacion;
	}

	public abstract String mostrarDatos();

	public int getCodigo() {
		return codigo;
	}

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	
	
}
