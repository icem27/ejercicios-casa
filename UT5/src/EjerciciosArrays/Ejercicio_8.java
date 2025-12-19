package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio_8 {
	/*Crea un vector(array) de tamaño 5, al que llamarás países. En él guardarás 
	 * los nombres de 5 países que se introducirán por teclado. En un bucle 
	 * posterior al de la inicialización del vector, muestra su contenido. */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		String[] paises = new String[5];
		int tam=paises.length;
		//String pais;
		int contador=1;
		
		System.out.println("Introduce 5 paises: ");
		
		for (int i=0; i<tam ; i++) {
			System.out.println("Introduce el " + contador + " pais: ");
			//pais=leer.nextLine();
			//paises[i]=pais;
			paises[i]=leer.nextLine();
			contador++;
		}
		contador=1;
		System.out.println("Los paises introducidos son: ");
		for(int i=0; i<tam ; i++) {
			System.out.println("El pais número "+ contador + " es: " + paises[i]);
			contador++;
		}
		leer.close();
	}

}
