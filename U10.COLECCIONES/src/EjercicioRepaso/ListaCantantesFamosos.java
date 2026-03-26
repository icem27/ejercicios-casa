package EjercicioRepaso;

import java.util.ArrayList;

public class ListaCantantesFamosos {
	private ArrayList<String> nombres;
	
	public ListaCantantesFamosos() {
		this.nombres = new ArrayList<String>(); 
		nombres.add("Ismael");
		nombres.add("Juan");
		nombres.add("Sara");
	}
	
	
	public void aniadirCantante(String nombre) {
		nombres.add(nombre);
	}
	
	public void mostrarCantantes() {
		for(String n:nombres) {
			System.out.println(n);
		}
	}
	
}
