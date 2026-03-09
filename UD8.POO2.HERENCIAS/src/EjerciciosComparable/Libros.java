package EjerciciosComparable;

public class Libros implements Comparable<Libros>{
	private String titulo;
	private String autor;
	private int paginas;
	
	public Libros(String libro, String autor, int paginas) {
		this.titulo = libro;
		this.autor = autor;
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libros [libro=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}

	@Override
	public int compareTo(Libros o) {
		// TODO Auto-generated method stub
		return this.titulo.compareTo(o.titulo);
	}
	
	
}
