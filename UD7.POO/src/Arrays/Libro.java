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
		if(!prestado) {
			return this.prestado=true;
		} else {
			return this.prestado;
		}
	}
	

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public boolean devolver() {
		if(prestado) {
			return this.prestado=false;
		} else {
			return this.prestado;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
			return titulo + " de " + autor;
	}
	
	
}
