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
	
	public void prestar() {
		if(this.titulo==getTitulo()) {
			if(!prestado) {
				System.out.println("El libro "  + "\"" + titulo + "\" ya ha sido prestado ");
				this.prestado=true;
			} else {
				System.out.println("El libro "  + "\"" + titulo + "\" no se puede prestar porque ya está prestado.");
			}
		}
	}

	public void devolver() {
		if(this.titulo==getTitulo()) {
			if(prestado) {
				System.out.println("El libro "  + "\"" + titulo + "\" ya ha sido devuelto ");
				this.prestado=false;
			} else {
				System.out.println("El libro "  + "\"" + titulo + "\" no se puede devolver porque no estaba prestado.");
			}
		}
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
			return titulo + " de " + autor;
	}
	
	
}
