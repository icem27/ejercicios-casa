package EjerciciosComparable;

import java.util.Arrays;

public class ProductoPpal {

	public static void main(String[] args) {
		Producto p1 = new Producto("iPhone 17", 1399.99);
		Producto p2 = new Producto("iPhone 17 Pro", 1499.99);
		Producto p3 = new Producto("iPhone 17 Pro Max", 1499.99);
		Producto p4 = new Producto("iPhone 16", 899);
		Producto p5 = new Producto("iPhone 15", 799);
		
		Producto[] productos = {p1, p2, p3, p4, p5};
		Arrays.sort(productos);
		for(Producto p:productos) {
			System.out.println(p);
		}

	}

}
