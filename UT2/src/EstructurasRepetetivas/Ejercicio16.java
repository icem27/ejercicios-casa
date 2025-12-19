package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último número introducido. 
		// La introducción de números finaliza cuando se introduzca un 0.
		// Al final se mostrará:
		// El total de números introducidos, excluido el 0.
		// El total de números fallados
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un número (0 para salir)");
		int numAnterior= leer.nextInt();
		int num, fallos=0, totalNums=0;

		do {
			System.out.println("Introduce un número (0 para salir)");
			num=leer.nextInt();
			totalNums++;
			if (num<numAnterior && num!=0) {
				System.out.println("Error, el número es menor");
				fallos++;
			}
			numAnterior=num;
		} while (num!=0);
		
		System.out.println("Se han introducido " +totalNums+" números");
		System.out.println("Fallos: " + fallos);
		
		leer.close();
	}

}
