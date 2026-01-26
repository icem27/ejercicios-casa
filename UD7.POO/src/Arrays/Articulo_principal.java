package Arrays;

import java.util.Scanner;

public class Articulo_principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Articulo[] articulos = new Articulo[5];
		articulos[0] = new  Articulo("Macbook Pro", 10, 1200);
		articulos[1] = new  Articulo("iPhone 17 Pro Max", 20, 1700);
		articulos[2] = new  Articulo("iPad", 6, 800);
		articulos[3] = new  Articulo("Watch 11", 4, 500);
		articulos[4] = new  Articulo("AirPods Max", 6, 300);
		int opcion;
		do {
			opcion = menu(sc);
			sc.nextLine();
			switch(opcion) {
			case 1:
				mostrar_articulos(articulos);
				break;
			case 2:
				menos_cinco(articulos);
				break;
			case 3:
				aumentar_stock(sc, articulos);
				break;
			case 4:
				disminuir_stock(sc, articulos);
				break;
			case 5:
				System.out.println("Hasta la próxima: ");
				break;
			default:
				System.out.println("Opción erronea, intentelo de nuevo");
			}
		} while(opcion!=5);
	}
	
	public static void aumentar_stock(Scanner sc, Articulo[] articulos) {
		System.out.print("Introduce el nombre del artículo para aumentar el stock: ");
		String nombre=sc.nextLine();
		System.out.print("Introduce la cantidad a aumentar: ");
		int cantidad=sc.nextInt();
		int pos=0;
		for(int i=0;i<articulos.length;i++) {
			if(articulos[i].getNombre().equalsIgnoreCase(nombre)) {
				articulos[i].aumentar_stock(cantidad);
				pos=i;
				break;
			}
		}
		System.out.println("El stock de " + articulos[pos].getNombre() + " ahora es " + articulos[pos].getStock());
	}
	public static void disminuir_stock(Scanner sc, Articulo[] articulos) {
		System.out.print("Introduce el nombre del artículo para disminuir el stock: ");
		String nombre=sc.nextLine();
		System.out.print("Introduce la cantidad a disminuir: ");
		int cantidad=sc.nextInt();
		int pos=0;
		boolean mensaje=true;
		for(int i=0;i<articulos.length;i++) {
			if(articulos[i].getNombre().equalsIgnoreCase(nombre)) {
				if(articulos[i].getStock()>cantidad) {
				articulos[i].disminuir_stock(cantidad);
				pos=i;
				break;	
				} else {
					System.out.println("No puedes disminuir la cantidad menor que lo que hay en el stock");
					mensaje=false;
				}
			}
		}
		if(mensaje) {
			System.out.println("El stock de " + articulos[pos].getNombre() + " ahora es " + articulos[pos].getStock());
		}
	}
	public static void mostrar_articulos(Articulo[] articulos) {
		System.out.println("\nArtículos:");
		for(Articulo articulo:articulos) {
			System.out.println(articulo);

		}
		System.out.println();
	}
	
	public static void menos_cinco(Articulo[] articulos) {
		for(int i=0;i<articulos.length;i++) {
			if(articulos[i].getStock()<5) {
				System.out.println(articulos[i]);
			}
		}
	}
	
	public static int menu(Scanner sc) {
		System.out.println("--- Menú Inventario ---");
		System.out.println("1. Mostrar todos los artículos");
		System.out.println("2. Mostrar artículos con menos de 5 unidades");
		System.out.println("3. Aumentar stock de un artículo");
		System.out.println("4. Disminuir stock de un artículo");
		System.out.println("5. Salir");
		System.out.print("Elige una opción: ");
		return sc.nextInt();
	}

}
