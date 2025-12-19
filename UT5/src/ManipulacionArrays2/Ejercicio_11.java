package ManipulacionArrays2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_11 {
	/*
	 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
	 * sus mesas.
	 * 
	 * En una mesa se pueden sentar de 0 (mesa vacía) a X comensales (mesa llena).
	 * 
	 * El nº de comensales y de mesas se definirán como constantes asignándoles un
	 * valor.
	 * 
	 * Cuando llega un grupo de clientes al restaurante se les pregunta cuántas
	 * personas son. De momento el programa no está preparado para colocar a grupos
	 * mayores a X comensales, por tanto, si un cliente dice por ejemplo que son un
	 * grupo de 6, y el nº de comensales es 4 el programa dará el mensaje “Haga
	 * grupos de 4 personas como maximo e intente de nuevo”.
	 * 
	 * Para el grupo que llega, se busca y asigna siempre la primera mesa libre (con
	 * 0 personas). Si no quedan mesas libres, se busca y asigna donde haya un hueco
	 * para todo el grupo, por ejemplo si el grupo es de dos personas y el número de
	 * comensales X es 4, se colocará donde haya una o dos personas.
	 * 
	 * Inicialmente, las mesas se cargan con valores aleatorios entre 0 y X. Al
	 * arrancar el programa y cada vez que se sienten nuevos clientes se debe
	 * mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya
	 * huecos sueltos suficientes.
	 * 
	 * El programa se repetirá de manera indefinida hasta que se introduzca un valor
	 * negativo (Suponemos que siempre se introducen valores enteros, no hay que
	 * comprobarlo)
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		final int MAX_COMENTALES = 5;
		final int MAX_MESAS = 10;
		int[] mesas = new int[MAX_MESAS];

		for (int i = 0; i < mesas.length; i++) {
			mesas[i] = (int) (Math.random() * (MAX_COMENTALES+1));
		}

		int numComensal = 0;
		do {
			System.out.println("Ocupación de las mesas: " + Arrays.toString(mesas));
			System.out.println(
					"Introduzca el número de comensales (Entre 1 y "+ MAX_COMENTALES + " o número negativo para salir del programa");
			numComensal = leer.nextInt();
			int mesaVacia=0;
			int mesaHueco=0;
			boolean hayMesaVacia=false;
			boolean hayMesaHueco=false;
			for (int i = 0; i < mesas.length; i++) {
				if (numComensal > MAX_COMENTALES) {
					System.out.println("Haga grupos de "+ MAX_COMENTALES + " personas como máximo e intente de nuevo");
					break;
				} else if (numComensal>0) {
					for(int j=0;j<MAX_MESAS;j++) {
						if(mesas[i]==0) {
							mesaVacia=i;
							hayMesaVacia=true;
							break;
						} else if(!hayMesaHueco && (mesas[i] + numComensal <= MAX_COMENTALES)) {
							mesaHueco=i;
							hayMesaHueco=true;
						}
					}
				}
				
			}
			if (hayMesaVacia) {
				mesas[mesaVacia]=numComensal;
				System.out.println("Por favor, siéntese en la mesa " + (mesaVacia+1));
			} else if (hayMesaHueco) {
				mesas[mesaHueco]+=numComensal;
				System.out.println("Tiene que compartir mesa. Por favor, siéntese en la mesa" + (mesaHueco+1));
			} else {
				System.out.println("Lo sentimos, en estos momentos no queda sitio para un grupo de");
			}
		} while (numComensal > 0);
		System.out.println("Hasta luego");
		leer.close();

	}

}
