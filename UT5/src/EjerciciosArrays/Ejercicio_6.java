package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio_6 {
	/*Crea un array de 10 elementos de tipo entero, introduce 10 valores por 
	 * teclado y almacénalos en los elementos del array.  Después calcula 
	 * y muestra por pantalla  el valor máximo y mínimo*/

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int[] almacen = new int[10];
		int tam=almacen.length;
		int datos=0, max=0, min=0;
		
		System.out.println("Introduce " +tam+ " valores");
		
		for(int i=0;i<tam;i++) {
			System.out.println("Introduce el "+(i+1)+"ª valor: ");
			datos=leer.nextInt();
			almacen[i]=datos;
			if(i==0){
				max=datos;
				min=datos;
			} 
			if (datos>max) {
				max=datos;
			}
			if(datos<min) {
				min=datos;
			}
		}
		
		System.out.println("El número máximo es: " + max + " y el minimo es: " + min);
		leer.close();
		}

}
