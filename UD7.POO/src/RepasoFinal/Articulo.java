package RepasoFinal;

public class Articulo {
	private String titulo;
	private String autor;
	private String[] palabraClave;
	private String publicacion;
	private int anio;
	private String resumen;
	
	Articulo(String titulo, String autor){
		this.titulo=titulo;
		this.autor=autor;
	}
	
	Articulo(String titulo, String autor, String[] palabraClave, String publicacion, int anio){
		this(titulo, autor);
		this.palabraClave=palabraClave;
		this.publicacion=publicacion;
		this.anio=anio;
	}
	
	Articulo(String titulo, String autor, String[] palabraClave, String publicacion, int anio, String resumen){
		this(titulo, autor, palabraClave, publicacion, anio);
		this.resumen=resumen;
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

	public String[] getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(String[] palabraClave) {
		this.palabraClave = palabraClave;
	}

	public String getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	@Override
	public String toString() {
		return "Título del artículo: \"" + titulo + "\"\nAutor del artículo: " + autor + "\nPlabras clave:\n" + soloPalabra()
				+ "Publicación: " + publicacion + "\nAño: " + anio + "\nResumen:" + resumen + "]";
	}
	
	public String soloPalabra() {
		String palabras="";
		for(int i=0;i<this.palabraClave.length;i++) {
			palabras+="*"+this.palabraClave[i]+"\n";
		}
		return palabras;
	}
	

}
