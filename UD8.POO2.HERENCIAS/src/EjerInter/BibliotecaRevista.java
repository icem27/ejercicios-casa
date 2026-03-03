package EjerInter;

public class BibliotecaRevista extends BibliotecaPublicacion {
	private int numero;
	
	public BibliotecaRevista(int codigo, int anyoPublicacion, int numero) {
		super(codigo, anyoPublicacion);
		this.numero = numero;
	}

	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	@Override
	public String toString() {
		return "Número de revista: " + numero + " | Código ISSB: " + getCodigo() + " | Año de publicación: "
				+ getAnyoPublicacion();
	}
	
	

}
