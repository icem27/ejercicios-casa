package EjerInter;

import java.util.Scanner;

public class BibliotecaPrincipal {
	
	static Scanner sc = new Scanner(System.in);
	static BibliotecaPublicacion[] publicaciones = new BibliotecaPublicacion[100];
	
	public static void main(String[] args) {
		publicaciones[0]=new BibliotecaLibro("DaVinci", "La hermosa", 19, 1246);
		publicaciones[1]=new BibliotecaLibro("Miguel Angel", "El Ángel", 25, 1436);
		publicaciones[2]=new BibliotecaRevista(11, 2052, 29); 
		
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
				mostrarPublicaciones();
				break;
			case 7:
				System.out.println("Hasta la próxima!");
			}
		} while(opcion!=7);
	}
	
	private static void mostrarPublicaciones() {
		String tipo="";
		for(BibliotecaPublicacion p:publicaciones) {
			if(p!=null) {
				if (p instanceof BibliotecaLibro) {
					tipo="Libro = ";
				} else {
					tipo="Revista = ";
				}
				System.out.println(tipo + p.mostrarDatos());
			}
		}
		
	}

	public static void menu() {
		System.out.println("Selecciona la operación que quieres realizar (entre 1 y 6):  \r\n"
				+ " 1 -> Añadir publicación\r\n" + " 2 -> Buscar Publicación\r\n" + " 3 -> Prestar libro\r\n"
				+ " 4 -> Devolver libro\r\n" + " 5 -> Eliminar publicación\r\n" + " 6 -> Mostrar publicación\r\n" +" 7 -> Salir");
	}
	
	public static void anyadirPublicacion() {
		//System.out.println("Añadir publi");
		System.out.println("Vas a añadir un libro(1) o una revista (2) ?");
		int tipo=sc.nextInt();
		sc.nextLine();
		System.out.print("Introduce el ISBN O ISSN: ");
		int codigo=sc.nextInt();
		System.out.print("Año de publicación: ");
		int anyo=sc.nextInt();
		sc.nextLine();
		if(tipo==1) {
			System.out.println("Introduce los datos del libro: ");
			System.out.print("Título: ");
			String titulo=sc.nextLine();
			System.out.print("Autor: ");
			String autor=sc.nextLine();
			BibliotecaLibro libro= new BibliotecaLibro(autor, titulo, codigo, anyo);
			anyadirPublicacion(libro);
		} else if (tipo==2) {
			System.out.println("Introduce los datos de la revista: ");
			System.out.print("Introduce el número de la revista:  ");
			int numero=sc.nextInt();
			sc.nextLine();
			BibliotecaRevista revista= new BibliotecaRevista(codigo, anyo, numero);
			anyadirPublicacion(revista);
		} else {
			System.out.println("Opción selecionada no disponible");
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
		BibliotecaPublicacion publi = pedirCodigoyBuscarPublicacion();
		if(publi != null) {
			if(publi instanceof BibliotecaLibro) {
				if(((BibliotecaLibro) publi).estaPrestado()) {
					System.out.println("Ya está prestado. ");
				} else {
					((BibliotecaLibro) publi).prestar();
				}
			} else {
				System.out.println("La publicación introducida es una revista por lo cual no se puede reservar");
			}
		} else {
			System.out.println("Esa publicación no existe.");
		}
	}
	
	public static void eliminarLibro() {
//		System.out.println("Eliminar libro");
		int posicion=buscarPosicionPublicacion();
		if(posicion>=0) {
			if(publicaciones[posicion] instanceof BibliotecaLibro && ((BibliotecaLibro)publicaciones[posicion]).estaPrestado()) {
				System.out.println("No se puede elimnar ya que el libro se encuentra prestado.");
			} else {
				publicaciones[posicion]=null;
			}
		} else {
			System.out.println("Esa publicación no existe. ");
		} 
	}
	
	public static int buscarPosicionPublicacion() {
		System.out.println("Introduce el código: ");
		int codigo=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<publicaciones.length;i++) {
			if(publicaciones[i]!= null && publicaciones[i].getCodigo()==codigo) {
				return i;
			}
		}
		return -1;
	}
	public static BibliotecaPublicacion pedirCodigoyBuscarPublicacion() {
		System.out.println("Introduce el código: ");
		int codigo=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<publicaciones.length;i++) {
			if(publicaciones[i] !=null && publicaciones[i].getCodigo()==codigo) {
				return publicaciones[i];
			}
		}
		return null;
	}
	
	public static void devolverLibro() {
//		System.out.println("Devolver libro");
		int posicion=buscarPosicionPublicacion();
		if(publicaciones[posicion] != null) {
			if(publicaciones[posicion] instanceof BibliotecaLibro && ((BibliotecaLibro)publicaciones[posicion]).estaPrestado()) {
				
			}
		} else {
			System.out.println("No existe una publicación con ese código");
		}
	}
	
	public static void buscarPublicacion() {
//		int posicion=buscarPublicacion(codigo);
		BibliotecaPublicacion publi = pedirCodigoyBuscarPublicacion();
		if(publi != null) {
			System.out.println(publi.mostrarDatos());
		} else {
			System.out.println("No existe una publicación con ese código");
		}
	}
	
}
