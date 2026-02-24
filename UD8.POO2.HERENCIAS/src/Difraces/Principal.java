package Difraces;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static Productos[] producto = new Productos[25];

	public static void main(String[] args) {
		producto[0] = new Disfraz("Batman", Categoria.HISTORICO, Talla.L);
		//producto[0].alquilarProducto("Ismael", 5);
		producto[1] = new Accesorio("Pendientes", Categoria.TERROR, false);
		//producto[1].alquilarProducto("Juan", 3);
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
		//System.out.println(producto[0].toString());
		//System.out.println(producto[1].toString());
		
	}
	
	public int menu() {
		System.out.println("Bienvenido a Carnaval Fest");
		System.out.println("Qué deseas hacer?");
		System.out.println("1. Mostrar estado tienda");
		System.out.println("2. Añadir producto");
		System.out.println("3. Alquilar producto");
		System.out.println("4. Devolver producto");
		System.out.println("5. Salir");
		return sc.nextInt();
	}
	
	public void mostrarProductos() {
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
	}
	
	public void aniadirProducto() {
		int opcion;
		do {
		System.out.println("Qué vas a añadir: Disfraz(1) o Accesorio(2)");
		opcion=sc.nextInt();
		} while(opcion != 1 && opcion != 2);
		if (opcion==1) {
			//aqui voy a poner la función de disfraz
		} else {
			//aqui voy a poner la función de accesorio
		}
	}

}
