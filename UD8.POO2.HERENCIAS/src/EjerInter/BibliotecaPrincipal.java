package EjerInter;

import java.util.Scanner;

public class BibliotecaPrincipal {
	
	static Scanner sc = new Scanner(System.in);
	static BibliotecaPublicacion[] publicaciones = new BibliotecaPublicacion[100];
	
	public static void main(String[] args) {
		int opcion=0;
		do {
			menu();
			opcion=sc.nextInt();
			sc.nextLine();
			switch(opcion) {
			case 1: 
				anyadirPublicacion();
				break;
			case 2: 
				buscarPublicaciones();
				break;
			case 3: 
				prestarLibro();
				break;
			case 4: 
				devolverLibro();
				break;
			case 5:
				eliminarLibro();
				break;
			case 6:
				System.out.println("Hasta la próxima!");
			}
		} while(opcion!=6);
	}
	
	public static void menu() {
		System.out.println("Selecciona la operación que quieres realizar (entre 1 y 6):  \r\n"
				+ " 1 -> Añadir publicación\r\n" + " 2 -> Buscar Publicación\r\n" + " 3 -> Prestar libro\r\n"
				+ " 4 -> Devolver libro\r\n" + " 5 -> Eliminar publicación\r\n" + " 6 -> Salir");
	}
	
	public static void anyadirPublicacion() {
		//System.out.println("Añadir publi");
		System.out.println("Vas a añadir un libro(1) o una revista (2) ?");
		int tipo=sc.nextInt();
		sc.nextLine();
		if(tipo==1) {
			System.out.println("Introduce los datos del libro: ");
			System.out.print("Título: ");
			String titulo=sc.nextLine();
			System.out.print("Autor: ");
			String autor=sc.nextLine();
			System.out.print("ISBN: ");
			int ISBN=sc.nextInt();
			System.out.print("Año de publicación: ");
			int anyo=sc.nextInt();
			sc.nextLine();
			BibliotecaLibro libro= new BibliotecaLibro(autor, titulo, ISBN, anyo);
			anyadirPublicacion(libro);
		}
	}
	
	public static void anyadirPublicacion(BibliotecaPublicacion p) {
		int posLibre=0;
		for(int i=0;i<publicaciones.length;i++) {
			if(publicaciones[i] == null) {
				posLibre = i;
				break;
			}
		}
		
		publicaciones[posLibre]=p;
	}
	
	public static void buscarPublicaciones() {
		System.out.println("Buscar publi");
	}
	
	public static void prestarLibro() {
		System.out.println("Prestar libro");
	}
	
	public static void devolverLibro() {
		System.out.println("Devolver libro");
	}
	
	public static void eliminarLibro() {
		System.out.println("Eliminar libro");
	}

}
