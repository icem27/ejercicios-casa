package EjerInter;

public class BibliotecaLibro extends BibliotecaPublicacion implements BibliotecaPrestable {
	private String autor;
	private String titulo;
	private boolean prestado;
	
	
	public BibliotecaLibro(String autor, String titulo, int codigo, int anyo) {
		super(codigo, anyo);
		this.autor = autor;
		this.titulo = titulo;
		this.prestado=false;
	}

	@Override
	public boolean prestar() {
		if(this.prestado) {
			return false;
		} else {
			this.prestado=true;
			return true;
		}
	}

	@Override
	public boolean devolver() {
		// TODO Auto-generated method stub
		if(this.prestado) {
			this.prestado=false;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean estaPrestado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}

	@Override
	public String mostrarDatos() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	@Override
	public String toString() {
		return "BibliotecaLibro [autor=" + autor + ", titulo=" + titulo + ", prestado=" + prestado + ", getCodigo()="
				+ getCodigo() + ", getAnyoPublicacion()=" + getAnyoPublicacion() + "]";
	}
	
	

}
