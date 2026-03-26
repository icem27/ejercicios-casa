package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Libreria {
	private ArrayList<Libro> listaLibros;
	
	public Libreria() {
		this.listaLibros= new ArrayList<>();
	}
	
	public void aniadirLibro(Libro libro) {
		listaLibros.add(libro);
	}
	
	public void ordenarPorPrecio() {
		Collections.sort(listaLibros);
		System.out.println("Libros ordenador por precio");
		for(Libro l:listaLibros) {
			System.out.println(l);
		}
	}
	
	public void borrarLibro(String isbn) {
		Iterator<Libro> it = listaLibros.iterator();
		while(it.hasNext()) {
			if(it.next().getISBN().equals(isbn)) {
				it.remove();
				System.out.println("Libro con ISBN " + isbn + " eliminado" );
			} else {
				System.out.println("No se encontró libro con el ISBN indicado");
			}
		}
	}
	
	public Libro buscarLibro(String titulo) {
		for(Libro l:listaLibros) {
			if(listaLibros.equals(titulo)) {
				return l;
			}
		}
		System.out.println("El libro buscado no se encuentra en la libreria");
		return null;
	}
	
	public void mostrarLibros() {
		for(Libro l:listaLibros) {
			System.out.println(l);
		}
	}
	
	
}
