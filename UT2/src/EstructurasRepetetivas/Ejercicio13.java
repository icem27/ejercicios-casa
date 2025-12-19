package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Crear un programa que solicite y vaya sumando los números introducidos 
		// por teclado hasta que se introduzca el valor 0. Al finalizar 
		// debe mostrar el total de números introducidos y la suma.
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int acumulador=0;
		int suma=0;
		/*
		do {
			System.out.println("Introduce un número: ");
			num = leer.nextInt();
			acumulador++;
			suma+=num;
		} while (num!=0);
		*/
		
		System.out.println("Introduce un número: ");
		num = leer.nextInt();
		while (num!=0) {
			acumulador++;
			suma +=num;
			System.out.println("Introduce un número: ");
			num = leer.nextInt();
		}
		
		 		
		System.out.println("Se han introducido "+ acumulador + " número que suman: " + suma);
		leer.close();
	}

}
