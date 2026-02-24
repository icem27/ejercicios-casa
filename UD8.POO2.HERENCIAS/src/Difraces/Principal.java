package Difraces;

import java.util.Scanner;

public class Principal {
	static int productosMaximos = 25;
	static Scanner sc = new Scanner(System.in);
	static Productos[] producto = new Productos[productosMaximos];	


	public static void main(String[] args) {
		producto[0] = new Disfraz("Batman", Categoria.OTROS, Talla.L);
		//producto[0].alquilarProducto("Ismael", 5);
		producto[1] = new Accesorio("Pendientes", Categoria.TERROR, false);
		//producto[1].alquilarProducto("Juan", 3);
		//alquilerProducto();
		//devolverProducto();
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
	
	public void nuevoProducto() {
		int opcion;
		do {
		System.out.println("Qué vas a añadir: Disfraz(1) o Accesorio(2)");
		opcion=sc.nextInt();
		} while(opcion != 1 && opcion != 2);
		if (opcion==1) {
			nuevoDisfraz();
		} else {
			nuevoAccesorio();
		}
	}
	
	public void nuevoDisfraz() {
		int codigoSiguiente = producto[0].getCodigoProducto()+1; //esto es para saber cuantos productos tengo creados
		Talla tipo = Talla.S;
		
		Categoria tipoCategoria = Categoria.HISTORICO;
		
		System.out.println("Cuál es el nombre del artículo:");
		String nombre = sc.nextLine();
		
		int categoria;
		
		do {
		System.out.println("De qué categoría es: Históricos(1), Terror(2), Superhéroes(3), Otros(4)");
		categoria = sc.nextInt();
		} while (categoria <= 0 || categoria > 4);
		
		tipoCategoria = Categoria.values() [categoria-1];
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
		producto[codigoSiguiente] = new Disfraz(nombre, tipoCategoria, tipo);
	}
	
	public void nuevoAccesorio() {
		int codigoSiguiente = producto[0].getCodigoProducto()+1; //esto es para saber cuantos productos tengo creados
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
		producto[codigoSiguiente] = new Accesorio(nombre, tipoCategoria, esNovedad);
	}
	
	public static void alquilerProducto() {
		int articulo;
		do {
		System.out.println("Introduce el código del artículo: ");
		articulo = sc.nextInt()-1;
		} while (articulo<=0 && articulo>=productosMaximos);
		sc.nextLine();
		if (producto[articulo] != null) {
			if (!producto[articulo].isEstaAlquilado()) {
				System.out.println("Introduce el nombre y apellido del cliente: ");
				String nombre = sc.nextLine();
				System.out.println("Cuántos dias se lo va a llevar?");
				int dias = sc.nextInt();
				producto[articulo].alquilarProducto(nombre, dias);
				System.out.println("El articulo ha sido alquilado por " + nombre + " durante " + dias + " por " + producto[articulo].precioProductoTotal(dias));
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
		} while (articulo<=0 && articulo>=productosMaximos);
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

}
