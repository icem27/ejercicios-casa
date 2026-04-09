package HashSet;

import java.util.ArrayList;
import java.util.Iterator;

public class GestionProductos {
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
	
	public void agregarSinDuplicados() {
		
	}
	
}
