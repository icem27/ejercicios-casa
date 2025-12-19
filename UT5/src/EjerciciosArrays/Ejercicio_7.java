package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio_7 {
	/*Modifica el ejercicio 5 para que al principio del programa nos pida cuántas 
	 * posiciones queremos que tenga el vector y sea este dato el que utilicemos 
	 * para darle dimensión.*/

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("¿Cuantas posiciones quieres que tenga el vector?");
		int vector=leer.nextInt();
		
		int[] ejemplo= new int[vector];
		int tam=ejemplo.length;
		
		for (int i=0;i<tam;i++) {
			ejemplo[i]= i;
			System.out.println(ejemplo[i]);
		}
		leer.close();
	}

}
