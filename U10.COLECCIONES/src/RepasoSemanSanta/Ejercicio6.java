package RepasoSemanSanta;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio6 {
	/*
	 * Un supermercado nos pide que hagamos una pequeña aplicación que almacene los
	 * productos pasados por el escáner.
	 * 
	 * Para ello deberá tener:
	 * 
	 * La clase Producto que contiene los atributos: nombre (el nombre debe tener la
	 * nomenclatura del tipo: productoX, siendo X el número de productos que se han
	 * creado hasta el momento (usar una variable estática para ello) una
	 * cantidad(entre 1 y 10) un precio (entre 0.01 y 100.00) La cantidad y el
	 * precio de cada producto serán generados aleatoriamente por el constructor. 
	 * La aplicación debe almacenar objetos de la clase Producto en un ArrayList y
	 * contendrá al menos dos métodos:
	 * 
	 * generarLista() que devolverá una lista de productos que contendrá entre 1 y 8
	 * elementos (la cantidad de elementos de la lista se obtendrá de manera
	 * aleatoria) mostrarTicket() que recibirá un ArrayList de Productos y nos
	 * mostrará por pantalla los productos, con su cantidad, precio, precio total de
	 * cada producto y precio total de la compra, con un formato similar al del
	 * siguiente ejemplo:
	 */
	
	public static void main(String[] args) {
		ArrayList<Producto> compra = generarLista();
		mostrarTicket(compra);

	}

	public static ArrayList<Producto> generarLista() {
		int n = (int) (Math.random() * 8 + 1);
		ArrayList<Producto> c = new ArrayList<Producto>();
		for (int i = 0; i < n; i++) {
			c.add(new Producto());
		}
		return c;
	}

	public static void mostrarTicket(ArrayList<Producto> c) {
		System.out.println("***********Cantidad****Precio********Total");
		Iterator<Producto> it = c.iterator();
		double total = 0;
		while (it.hasNext()) {
			Producto p = it.next();
			System.out.println(p);
			total += p.precioTotal();
		}
		System.out.println("========================================");
		System.out.println("Precio final\t\t\t" + String.format("%.2f", total));
	}
}
