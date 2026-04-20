package HashMap;

import java.util.*;

/*PROGRAMA*/
public class Cafeteria {
	static HashMap<String, Double> productos = new HashMap<String, Double>();
	static ArrayList<DetalleCafeteria> compra=new ArrayList<DetalleCafeteria>();
	
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargarProductos();
		mostrarProductos();
		boolean parar = false;
		do {
			parar = pedirProductos();
		} while (!parar);
		mostrarFactura();
	}

	public static boolean pedirProductos() {
		boolean parar=false;
		System.out.println("Introduce el nombre del producto:");
		String nombre=leer.next();
		if(nombre.equalsIgnoreCase("salir"))
			parar=true;
		else {
			if(productos.containsKey(nombre)) {
				double precio=productos.get(nombre);
				System.out.println("Introduce la cantidad:");
				int cantidad=leer.nextInt();
				leer.nextLine();
				compra.add(new DetalleCafeteria(nombre, cantidad, precio));
			}
			else {
				System.out.println("Lo siento, no tenemos "+nombre);
			}
		}
		return parar;
	}
	public static void mostrarFactura() {
		System.out.printf("%10s %10s %10s %10s\n","Producto","Precio","Cantidad","Subtotal");
		System.out.println("===========================================");
		for(DetalleCafeteria c:compra) {
			System.out.println(c);
		}
	}

	public static void cargarProductos() {
		productos.put("agua", 0.4);
		productos.put("cafe", 1.1);
		productos.put("bollo", 1.15);
		productos.put("chuches", 0.75);
		productos.put("bocata", 1.75);
		productos.put("refresco", 1.4);
	}

	public static void mostrarProductos() {
		System.out.println("Productos disponibles");
		System.out.println("=======================");
		for (Map.Entry<String, Double> p : productos.entrySet()) {
			System.out.println(p.getKey() + ": " + p.getValue() + " €");
		}
	}
}
