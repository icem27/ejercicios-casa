package Arrays;

public class Libro {
	private String titulo;
	private String autor;
	private boolean prestado;
	
	public Libro(String titulo, String autor, boolean prestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.prestado = prestado;
	}
	
	public boolean prestar() {
		return prestado=true;
	}
	
	public boolean devolver() {
		return prestado=false;
	}

	public boolean isPrestado() {
		return prestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
			return "- " + titulo + " de " + autor;
	}
	
	
}
