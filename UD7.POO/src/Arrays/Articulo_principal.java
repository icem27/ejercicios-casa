package Arrays;

import java.util.Scanner;

public class Articulo_principal {

	static Scanner sc = new Scanner(System.in);
	static Articulo[] articulos = new Articulo[5];

	public static void main(String[] args) {
		inicializarArticulos();
		int opcion;
		do {
			opcion = menu();
			sc.nextLine();
			switch (opcion) {
			case 1:
				mostrarArticulos();
				break;
			case 2:
				menosCinco();
				break;
			case 3:
				aumentarStock();
				break;
			case 4:
				disminuirStock();
				break;
			case 5:
				System.out.println("Hasta la próxima: ");
				break;
			default:
				System.out.println("Opción erronea, intentelo de nuevo");
			}
		} while (opcion != 5);
	}
	
	public static void inicializarArticulos() {
	    articulos[0] = new Articulo("Macbook Pro", 10, 1200);
	    articulos[1] = new Articulo("iPhone 17 Pro Max", 20, 1700);
	    articulos[2] = new Articulo("iPad", 6, 800);
	    articulos[3] = new Articulo("Watch 11", 4, 500);
	    articulos[4] = new Articulo("AirPods Max", 6, 300);
	}

	public static void aumentarStock() {
		System.out.print("Introduce el nombre del artículo para aumentar el stock: ");
		String nombre = sc.nextLine();
		int pos = posicionArticulo(articulos, nombre);
		if (pos < 0) {
			System.out.println("El articulo indicado no se encuentra en stock");
			return;
		}
		System.out.print("Introduce la cantidad a aumentar: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		articulos[pos].aumentarStock(cantidad);
		System.out
				.println("El stock de " + articulos[pos].getNombre() + " ahora es " + articulos[pos].getStock() + "\n");
	}

	public static void disminuirStock() {
		System.out.print("\nIntroduce el nombre del artículo para disminuir el stock: ");
		String nombre = sc.nextLine();
		int pos = posicionArticulo(articulos, nombre);
		if (pos < 0) {
			System.out.println("El articulo indicado no se encuentra en stock");
			return;
		}
		System.out.print("Introduce la cantidad a disminuir: ");
		int cantidad = sc.nextInt();
		sc.nextLine();
		if (articulos[pos].getStock() >= cantidad) {
			articulos[pos].disminuirStock(cantidad);
		} else {
			System.out.println("No hay suficiente stock disponible\n");
			return;
		}
		System.out.println("El stock de " + articulos[pos].getNombre() + " ahora es " + articulos[pos].getStock() + "\n");
	}

	public static void mostrarArticulos() {
		System.out.println("\nArtículos:");
		for (Articulo articulo : articulos) {
			System.out.println(articulo);
		}
		System.out.println();
	}

	public static void menosCinco() {
		System.out.println("\nArtículos con menos de 5 unidades:");
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getStock() < 5) {
				System.out.println(articulos[i]);
			}
		}
		System.out.println();
	}

	public static int menu() {
		System.out.println("--- Menú Inventario ---");
		System.out.println("1. Mostrar todos los artículos");
		System.out.println("2. Mostrar artículos con menos de 5 unidades");
		System.out.println("3. Aumentar stock de un artículo");
		System.out.println("4. Disminuir stock de un artículo");
		System.out.println("5. Salir");
		System.out.print("Elige una opción: ");
		return sc.nextInt();
	}

	public static int posicionArticulo(String palabra) {
		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i].getNombre().equalsIgnoreCase(palabra)) {
				return i;
			}
		}
		return -1;
	}

}
