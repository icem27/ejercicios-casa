package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que capture un número por teclado e indique si es par o impar.
			
		 * */
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num= leer.nextInt();
		if (num==0){
			System.out.println("Es cero, ni par ni impar");
		} else
		if (num%2==0){
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		leer.close();
	}

}
