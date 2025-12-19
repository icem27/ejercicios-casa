package RepasoNavidades;

import java.util.Scanner;

public class Ejercicio_1 {
	/*
	 * Crea una función que reciba como parámetro un número y muestre por pantalla
	 * si es par o impar.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		parImpar(sc, "Introduce el número para saber si es par o impar");
		
	}
	
	public static void parImpar(Scanner sc, String mensaje) {
		System.out.println(mensaje);
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
		}
	}
}
