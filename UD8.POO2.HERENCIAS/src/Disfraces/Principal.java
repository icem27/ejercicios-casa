package Disfraces;

import java.util.Scanner;

public class Principal {
	static final int PRODUCTOS_MAXIMOS = 25;
	static Scanner sc = new Scanner(System.in);
	static Productos[] producto = new Productos[PRODUCTOS_MAXIMOS];	


	public static void main(String[] args) {
		producto[0] = new Disfraz("Batman", Categoria.OTROS, Talla.L);
		producto[0].alquilarProducto("Ismael", 5);
		producto[1] = new Accesorio("Pendientes", Categoria.HISTORICO, false);
		//producto[1].alquilarProducto("Juan", 3);
		//alquilerProducto();
		//devolverProducto();
		
		
		
		//menu();
		
		
		
		
		/*
		for(int i=0;i<producto.length;i++) {
			if(producto[i]!=null) {
			if(producto[i] instanceof Disfraz) {
				System.out.println(" " + (i+1) + " DISFRAZ -- " + producto[i].toString());
			} else {
				System.out.println(" " + (i+1) + " ACCESORIO -- " + producto[i].toString());
			}
			} else {
				System.out.println(" " + (i+1) + "  --------------------");
			}
		}
		*/
		System.out.println(producto[0].toString());
		System.out.println(producto[1].toString());
		
	}
	
	public static void menu() {
		int opcion = 0;

		while (opcion != 6) {
		System.out.println("\nBienvenido a Carnaval Fest");
		System.out.println("Qué deseas hacer?");
		System.out.println("1. Mostrar estado tienda");
		System.out.println("2. Añadir producto");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Alquilar producto");
		System.out.println("5. Devolver producto");
		System.out.println("6. Salir");
		opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			mostrarProductos();
			break;
		case 2:
			nuevoProducto();
			break;
		case 3:
			eliminarProducto();
			break;
		case 4:
			alquilerProducto();
			break;
		case 5:
			devolverProducto();
			break;
		case 6:
			System.out.println("Hasta la próxima!");
			break;
		default:
			System.out.println("La opción introducida no es correcta");
			break;
		}
		}
	}
	
	public static void mostrarProductos() {
		for (int i = 0; i < producto.length; i++) {
			if (producto[i] != null) {

				if (producto[i] instanceof Disfraz) {
					System.out.println(" " + (i + 1) + " DISFRAZ -- " + producto[i].toString());
				} else {
					System.out.println(" " + (i + 1) + " ACCESORIO -- " + producto[i].toString());
				}

			} else {
				System.out.println(" " + (i + 1) + "  --------------------");
			}
		}
	}
	
	public static void nuevoProducto() {
		int opcion;
		do {
		System.out.println("Qué vas a añadir: Disfraz(1) o Accesorio(2)");
		opcion=sc.nextInt();
		sc.nextLine();
		} while(opcion != 1 && opcion != 2);
		if (opcion==1) {
			nuevoDisfraz();
		} else {
			nuevoAccesorio();
		}
	}
	
	public static int siguienteCodigo() {
		int pos=0;
		for(int i=0;i<producto.length;i++) {
			if(producto[i]!=null) {
				pos=i;
			}
		}
		return pos+1;
	}
	
	public static void nuevoDisfraz() {
		Talla tipo = Talla.S;
		
		System.out.println("Cuál es el nombre del artículo:");
		String nombre = sc.nextLine();
		
		int categoria;
		
		do {
		System.out.println("De qué categoría es: Históricos(1), Terror(2), Superhéroes(3), Otros(4)");
		categoria = sc.nextInt();
		} while (categoria <= 0 || categoria > 4);
		
		Categoria tipoCategoria = Categoria.values() [categoria-1];
		sc.nextLine();
		
		System.out.println("La talla: S, M, L, XL?");
		String talla = sc.nextLine().toUpperCase();
		if(talla.equals("S")) {
			tipo = Talla.S;
		} else if(talla.equals("M")) {
			tipo = Talla.M;
		} else if(talla.equals("L")) {
			tipo = Talla.L;
		} else {
			tipo = Talla.XL;
		}
		producto[siguienteCodigo()] = new Disfraz(nombre, tipoCategoria, tipo);
	}
	
	public static void nuevoAccesorio() {
		Categoria tipoCategoria = Categoria.HISTORICO;
		boolean esNovedad = false;
		System.out.println("Cuál es el nombre del artículo:");
		String nombre = sc.nextLine();
		int categoria;
		
		do {
		System.out.println("De qué categoría es: Históricos(1), Terror(2), Superhéroes(3), Otros(4)");
		categoria = sc.nextInt();
		} while (categoria <= 0 || categoria > 4);
		
		tipoCategoria = Categoria.values() [categoria-1];
		sc.nextLine();
		int novedad;
		do {
		System.out.println("Si es una novedad pulsa 1, sino, pulsa 0");
		novedad = sc.nextInt();
		}while(novedad!=1 && novedad!=0);
		if(novedad==1) {
			esNovedad=true;
		}
		producto[siguienteCodigo()] = new Accesorio(nombre, tipoCategoria, esNovedad);
	}
	
	public static void alquilerProducto() {
		int articulo;
		do {
		System.out.println("Introduce el código del artículo: ");
		articulo = sc.nextInt()-1;
		} while (articulo<=0 && articulo>=PRODUCTOS_MAXIMOS);
		sc.nextLine();
		if (producto[articulo] != null) {
			if (!producto[articulo].isEstaAlquilado()) {
				System.out.println("Introduce el nombre y apellido del cliente: ");
				String nombre = sc.nextLine();
				System.out.println("Cuántos dias se lo va a llevar?");
				int dias = sc.nextInt();
				producto[articulo].alquilarProducto(nombre, dias);
				System.out.println("El articulo ha sido alquilado por " + nombre + " durante " + dias + " dias por " + String.format("%.2f€", producto[articulo].precioProducto()) );
			} else {
				System.out.println("El artículo no está disponible porque ya está alquílado");
			}
		} else {
			System.out.println("El código no es correcto");
		}
	}
	
	public static void devolverProducto() {
		int articulo;
		do {
		System.out.println("Introduce el código del artículo: ");
		articulo = sc.nextInt()-1;
		} while (articulo<=0 && articulo>=PRODUCTOS_MAXIMOS);
		sc.nextLine();
		if(producto[articulo]!=null) {
			if(producto[articulo].devolverProducto()) {
				System.out.println("Artículo devuelto");
			} else {
				System.out.println("El articulo no se puede devolver porque no está alquilado");
			}
		} else {
			System.out.println("El código no es correcto");
		}
	}
	
	public static void eliminarProducto() {
		int articulo;
		do {
		System.out.println("Introduce el código del artículo: ");
		articulo = sc.nextInt()-1;
		} while (articulo<=0 && articulo>=PRODUCTOS_MAXIMOS);
		sc.nextLine();
		
		if(producto[articulo]!=null && !producto[articulo].isEstaAlquilado()) {
			producto[articulo]=null;
			System.out.println("El producto ha sido eliminado");
		} else if (producto[articulo]!=null && producto[articulo].isEstaAlquilado()){
			System.out.println("El producto se encuentra alquilado, no se puede eliminar.");
		} else {
			System.out.println("El producto no existe.");
		}
		
	}

}
