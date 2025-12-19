package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*Diseña un programa que lea un número entero (positivo o negativo) 
		 * y determine si tiene 1, 2, 3, 4 o más cifras, visualizando lo que corresponda*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce ");
		int num = leer.nextInt();
		
		/*
		num=Math.abs(num);
		String numS=String.valueOf(num);
		int cont=numS.length();
		System.out.println("El número tiene: "+cont+" caracteres.");
		*/
		
		if (num<10 && num>-10) {
			System.out.println("El número tiene 1 cifra");
		} else if (num<100 && num>-100){
			System.out.println("El número tiene 2 cifra");
		} else if (num<1000 && num>-1000){
			System.out.println("El número tiene 3 cifra");
		} else {
			System.out.println("Tienes 4 cifras o más");
		}
		
		
		
		leer.close();
	}

}
