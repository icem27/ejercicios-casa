package Difraces;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Productos[] producto = new Productos[25];
		producto[1] = new Disfraz(1, "Disfraz de tigre", false, 100, Talla.M);
		System.out.println(producto[1].toString());
		
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

}
