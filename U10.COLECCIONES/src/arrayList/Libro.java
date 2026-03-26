package arrayList;

public class Libro implements Comparable<Libro>{
	private String titulo;
	private String ISBN;
	private double precio;
	
	public Libro(String titulo, String iSBN, double precio) {
		super();
		this.titulo = titulo;
		ISBN = iSBN;
		this.precio = precio;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public double getPrecio() {
		return precio;
	}



	@Override
	public int compareTo(Libro o) {
		return Double.compare(this.precio, o.precio);
	}



	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", ISBN=" + ISBN + ", precio=" + precio + "]";
	}
	
	
}
