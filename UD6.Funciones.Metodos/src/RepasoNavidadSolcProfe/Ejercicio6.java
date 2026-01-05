package RepasoNavidadSolcProfe;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = { "Cometa", "Relámpago", "Estrella" };
		String[] adjetivos = { "veloz", "fugaz", "brillante" };
		Scanner leer=new Scanner(System.in);
		
		
		boolean seguir=true;
		while(seguir) {
			dameNombre(nombres, adjetivos);
			System.out.println("Generamos otro?(pulsa S para salir, cuaquier letra para continuar)");
			String intro=leer.next().toUpperCase();
			if(intro.equals("S")) {
				seguir=false;
			}
		}
		System.out.println("Hasta luego");
	}
	public static void dameNombre(String[] nombres,String[] adj) {
		
		//vamos a obtener un aleatorio entre los elementos de cada array, para eso tenemos que saber qué tamaño tiene cada uno
		int tamNombres=nombres.length;
		int tamAdj=adj.length;
		
		int posNombre=(int)(Math.random()*tamNombres);
		int posAdj=(int)(Math.random()*tamAdj);
		
		String nombre=nombres[posNombre]+" "+adj[posAdj];
		System.out.println("**************");
		System.out.println(nombre);
		System.out.println("**************");
	}

}
