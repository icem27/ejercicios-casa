package RepasoSemanSanta;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*
		 * Crea una clase denominada ListaCantantesFamosos con un atributo ArrayList que
		 * almacene el nombre de cantantes famosos.
		 * 
		 * Al inicializar la clase se crearán 3 nombres de cantantes famosos.
		 * 
		 * Crea una clase test con el método main que:
		 * 
		 * instancie un objeto ListaCantantesFamosos, pida dos cantantes famosos más al
		 * usuario, los añada a la lista y muestre el contenido de la lista por
		 * pantalla. 
		 */
		
        Scanner sc = new Scanner(System.in);
        ListaCantantesFamosos lista = new ListaCantantesFamosos();
        
        System.out.println("Escribe el nombre de un cantante");
        lista.anadir(sc.nextLine());
        System.out.println("Escribe el nombre de otro cantante");
        lista.anadir(sc.nextLine());
        
        System.out.println(lista);
	}
}
