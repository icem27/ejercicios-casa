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
				buscarPublicacion();
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
				mostrarPrestados();
				break;
			case 8:
				System.out.println("Hasta la próxima!");
			}
		} while(opcion!=8);
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
				+ " 4 -> Devolver libro\r\n" + " 5 -> Eliminar publicación\r\n" + " 6 -> Mostrar publicación\r\n" + " 7 -> Mostrar publicación prestadas\r\n" + " 8 -> Salir");
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
			if(publi instanceof BibliotecaPrestable) {
				if(((BibliotecaPrestable) publi).estaPrestado()) {
					System.out.println("Ya está prestado. ");
				} else {
					((BibliotecaPrestable) publi).prestar();
					System.out.println("El libro ha sido prestado. ");
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
				System.out.println("No se puede eliminar ya que el libro se encuentra prestado.");
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
		BibliotecaPublicacion publi = pedirCodigoyBuscarPublicacion();
		if(publi != null) {
			if(publi instanceof BibliotecaPrestable) {
				if(((BibliotecaPrestable) publi).estaPrestado()) {
					((BibliotecaPrestable) publi).devolver();
					System.out.println("El libro ha sido devuelto.");
				} else {
					System.out.println("El libro no se encuentra prestado, por lo cual no se puede devolver.");
				}
			} else {
				System.out.println("La publicación introducida es una revista por lo cual no se puede reservar. ");
			}
		} else {
			System.out.println("Esa publicación no existe.");
		}
	}
	
	public static void buscarPublicacion() {
		BibliotecaPublicacion publi = pedirCodigoyBuscarPublicacion();
		if(publi != null) {
			System.out.println(publi.mostrarDatos());
		} else {
			System.out.println("No existe una publicación con ese código");
		}
	}
	
	public static void mostrarPrestados() {
		System.out.println("¿Qué deseas visualizar? (1) Prestados o (2) No prestados");
		int opcion = sc.nextInt();
		sc.nextLine();
		
		if (opcion != 1 && opcion != 2) {
			System.out.println("La opción seleccionada es errónea.");
			return;
		}
		for (BibliotecaPublicacion p : publicaciones) {
			if (p != null && p instanceof BibliotecaPrestable) {
				BibliotecaPrestable prestable = (BibliotecaPrestable) p;
				if (opcion == 1 && prestable.estaPrestado()) {
					System.out.println(p.mostrarDatos());
				}
				if (opcion == 2 && !prestable.estaPrestado()) {
					System.out.println(p.mostrarDatos());
				}
			}
		}
	}
	
}
