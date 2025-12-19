package RepasoNavidades;

import java.util.Scanner;

public class Ejercicio_2 {
	/*
	 * Crea una función que reciba los parámetros N, M y num.
	 * Debe devolver si num está o no entre N y M (ambos incluidos)
	 */

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int n=sc.nextInt();
		System.out.println("Introduce el primer número: ");
		int m=sc.nextInt();
		System.out.println("Introduce el primer número: ");
		int num=sc.nextInt();
		entreNum(n, m, num); 
		sc.close();
	}
	
	public static void entreNum(int n, int m, int num) {
		if(n<=num && m>=num) {
			System.out.println("El número " + num + " se encuentra entre " + n + " y " + m);
		} else {
			System.out.println("El número " + num + " no se encuentra entre " + n + " y " + m);
		}
	}

}
