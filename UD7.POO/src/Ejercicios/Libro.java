package Ejercicios;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;
	private int prestados;
	
	Libro(){
	}

	Libro(String titulo, String autor, int numeroEjemplaresTotal, int numeroEjemplaresPrestados){
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=numeroEjemplaresTotal;
		this.prestados=numeroEjemplaresPrestados;
	}
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return this.ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public int getPrestados() {
		return this.prestados;
	}

	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	public boolean prestamo() {
		if(this.ejemplares>0) {
			this.ejemplares-=1;
			this.prestados+=1;
			return true;
		}
		return false;
	}
	
	public boolean devolucion() {
		if(this.prestados>0) {
			this.prestados-=1;
			this.ejemplares+=1;
			return true;
		}
		return false;
	}
	public void mostrarLibro() {
		System.out.println("El titulo del libro: " + this.titulo + " y su autor es: " + this.autor + ". Ejemplares "
				+ "totales disponibles en la biblioteca: " + this.ejemplares + " y prestados: " + this.prestados);
	}

}
