package EjemplosEnum;

public class Pelicula {
	private String titulo;
	private TipoPelicula tipo;

	public Pelicula(String titulo, TipoPelicula tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TipoPelicula getTipo() {
		return tipo;
	}

	public void setTipo(TipoPelicula tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", tipo=" + tipo + "]";
	}



}
