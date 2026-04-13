package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class GestionProductos {
	public static void main(String[] args) {
		ArrayList<Producto> productos=new ArrayList<Producto>();
		productos.add(new Producto(1, "nombre1", "tipo1", 20.3, 10));
		productos.add(new Producto(2, "nombre2", "tipo2", 50.3, 50));
		productos.add(new Producto(3, "nombre3", "tipo3", 80.3, 10));
		productos.add(new Producto(4, "nombre4", "tipo4", 120.3, 60));
		productos.add(new Producto(5, "nombre5", "tipo5", 540.3, 10));
		productos.add(new Producto(5, "nombre5", "tipo5", 540.3, 10));
		mostrarProductos(productos);
		
		agregarSinDuplicados(productos);
		
		
	}
	
	public static void mostrarProductos(ArrayList<Producto> productos) {
		for(Producto p:productos) {
			System.out.println(p);
		}
	}
	public static void mostrarProductos(HashSet<Producto> productos) {
		for(Producto p:productos) {
			System.out.println(p);
		}
	}
	
	ArrayList<Producto> prod;
	
	GestionProductos() {
		prod=new ArrayList<Producto>();
	}
	
	public void agregar(int codigo, String nombre, String tipo, Double precio, int stock) {
//		System.out.println("Introduce el código del producto: ");
//		int codigo=sc.nextInt();
//		sc.nextLine();
//		System.out.println("Introduce el nómbre del producto: ");
//		String nombre=sc.nextLine();
//		System.out.println("Introduce el tipo del producto: ");
//		String tipo=sc.nextLine();
//		System.out.println("Introduce el tipo de producto: ");
//		Double precio=sc.nextDouble();
//		System.out.println("Introduce el Stock del producto: ");
//		int stock=sc.nextInt();
		prod.add(new Producto(codigo, nombre, tipo, precio, stock));
	}
	
	public void eliminar(ArrayList<Producto> prod, int codigo) {
		if (!prod.isEmpty()) {
			boolean noExiste=true;
			Iterator<Producto> it = prod.iterator();
			while (it.hasNext()) {
				Producto pro = it.next();
				if (codigo==pro.getCodigo()) {
					it.remove();
					System.out.println("Se ha eliminado el producto correctamente.");
					break;
				} else {
					noExiste=false;
				}
			}
			if(!noExiste) {
				System.out.println("El producto buscado no se encuentra en la BBDD");
			}
		} else {
			System.out.println("No existen producto");
		}
	}
	
	public void obtener(ArrayList<Producto> prod, int codigo) {
		if (!prod.isEmpty()) {
			boolean noExiste=true;
			Iterator<Producto> it = prod.iterator();
			while (it.hasNext()) {
				Producto pro = it.next();
				if (codigo==pro.getCodigo()) {
					System.out.println("Encontrado! muy bien.");
					break;
				} else {
					noExiste=false;
				}
			}
			if(!noExiste) {
				System.out.println("El producto buscado no se encuentra en la BBDD");
			}
		} else {
			System.out.println("No existen producto");
		}
	}
	
	public void buscar(ArrayList<Producto> prod,int codigo) {
		if (!prod.isEmpty()) {
			boolean noExiste=true;
			Iterator<Producto> it = prod.iterator();
			while (it.hasNext()) {
				Producto pro = it.next();
				if (codigo==pro.getCodigo()) {
					System.out.println(pro);
					break;
				} else {
					noExiste=false;
				}
			}
			if(!noExiste) {
				System.out.println("El producto buscado no se encuentra en la BBDD");
			}
		} else {
			System.out.println("No existen producto");
		}
	}
	
	public ArrayList<Producto> buscar(ArrayList<Producto> prod,String tipo) {
		if(!prod.isEmpty()) {
			boolean noExiste=false;
			Iterator<Producto> it = prod.iterator();
			while (it.hasNext()) {
				Producto pro = it.next();
				if (tipo.equalsIgnoreCase(pro.getTipo())) {
					System.out.println(pro);
					noExiste=true;
				} 
			}
			if(noExiste) {
				System.out.println("El producto buscado no se encuentra en la BBDD");
			}
		}
		else 
		{
			System.out.println("No hay productos en esta lista");
		}
		
		return prod;
	}
	
	public int tamanio(ArrayList<Producto> prod) {
		return prod.size();
	}
	
	public static void agregarSinDuplicados(ArrayList<Producto> prod) {
		HashSet<Producto> productosSinDuplicado = new HashSet<Producto>(prod);
		System.out.println("===== SIN DUPLICADOS =====");
		mostrarProductos(productosSinDuplicado);
		
		
	}
	
	public void aumentarPrecio(ArrayList<Producto> prod, String tipo, double porcentaje) {
		for(Producto p: prod) {
			if(p.getTipo().equalsIgnoreCase(tipo)) {
				double nuevoPrecio=p.getPrecio()*(1+(porcentaje/100));
				p.setPrecio(nuevoPrecio);
			}
		}
	}
	
	public void eliminarSinStock(ArrayList<Producto> prod) {
		for(Producto p:prod) {
			if(p.getStock()==0) {
				prod.remove(p);
			}
		}
	}
	
	
}
