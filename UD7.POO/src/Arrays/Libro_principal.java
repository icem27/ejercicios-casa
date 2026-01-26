package Arrays;

import java.util.Scanner;

public class Libro_principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Libro[] biblioteca = new Libro[5];
		biblioteca[0] = new  Libro("El principito","Antoine de Saint-Exupéry",true);
		biblioteca[1] = new  Libro("Cien años de soledad","Gabriel García Márquez",false);
		biblioteca[2] = new  Libro("Drácula","Bram Stoker",true);
		biblioteca[3] = new  Libro("El hobbit","J.R.R. Tolkien",false);
		biblioteca[4] = new  Libro("1984","George Orwell",true);
		int opcion;
		do {
			opcion = menu(sc);
			sc.nextLine();
			switch(opcion) {
			case 1:
				mostrar_libros(biblioteca);
				break;
			case 2:
				prestar_libro(sc, biblioteca);
				break;
			case 3:
				devolver_libro(sc, biblioteca);
				break;
			case 4:
				System.out.println("Hasta la próxima: ");
				break;
			default:
				System.out.println("Opción erronea, intentelo de nuevo");
			}
		} while(opcion!=4);
	}
	
	public static void mostrar_libros(Libro[] biblioteca) {
		System.out.println("\nLibros disponibles:");
		for(Libro libro:biblioteca) {
			if(!libro.isPrestado()) {
			System.out.println("- " + libro);
			}
		}
		System.out.println();
	}
	
	public static void prestar_libro(Scanner sc, Libro[] biblioteca) {
		System.out.print("Introduce el título del libro a prestar:");
		String libro=sc.nextLine();
		int pos=0;
		for(int i=0;i<biblioteca.length;i++) {
			if(biblioteca[i].getTitulo().equalsIgnoreCase(libro)) {
				pos=i;
				break;
			}
		}
		if(!biblioteca[pos].isPrestado()) {
			System.out.println("El libro \"" + biblioteca[pos].getTitulo() + "\" ha sido prestado");
			biblioteca[pos].prestar();
		} else {
			System.out.println("El libro \"" + biblioteca[pos].getTitulo() + "\" no se puede prestar porque ya está prestado.");
		}
		System.out.println();
	}
	public static void devolver_libro(Scanner sc, Libro[] biblioteca) {
		System.out.print("Introduce el título del libro a devolver:");
		String libro=sc.nextLine();
		int pos=0;
		for(int i=0;i<biblioteca.length;i++) {
			if(biblioteca[i].getTitulo().equalsIgnoreCase(libro)) {
				pos=i;
				break;
			}
		}
		if(biblioteca[pos].isPrestado()) {
			System.out.println("El libro \"" + biblioteca[pos].getTitulo() + "\" ha sido devuelto");
			biblioteca[pos].devolver();
		} else {
			System.out.println("El libro \"" + biblioteca[pos].getTitulo() + "\" nunca ha sido prestado.");
		}
		System.out.println();
	}
	
	public static int menu(Scanner sc) {
		System.out.println("--- Menú Biblioteca ---");
		System.out.println("1. Mostrar libros disponibles");
		System.out.println("2. Prestar libro");
		System.out.println("3. Devolver libro");
		System.out.println("4. Salir");
		System.out.print("Elige una opción: ");
		return sc.nextInt();
	}

}
