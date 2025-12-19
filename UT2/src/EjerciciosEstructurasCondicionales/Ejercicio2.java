package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*Realiza un algoritmo que calcule la potencia de un número, 
		para ello pide por teclado la base y el exponente. 
		Debes tener en cuenta que pueden ocurrir tres cosas:
		El exponente es positivo, sólo tienes que imprimir la potencia.
 		(Nota : utiliza para ello Math.pow(base, exponente) )
		El exponente es 0, entonces el resultado es 1.
		El exponente es negativo, el resultado es 1/potencia con el exponente positivo.
		*/
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce la base: ");
		int base = leer.nextInt();
		System.out.println("Introduce el exponente: ");
		int exp = leer.nextInt();
		
		if (exp==0) {
			System.out.println("La potencia es 0");
		}
		else if (exp>0) {
			double res=Math.pow(base, exp);
			System.out.println("El resultado es: "+ res);
		}
		else {//si exp es negativo
			double res=1/Math.pow(base, (-1)*exp);
			System.out.println("El resultado es: "+res);
		}
		
		leer.close();

	}

}
