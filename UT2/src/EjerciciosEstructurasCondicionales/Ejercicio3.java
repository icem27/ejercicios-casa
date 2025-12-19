package EjerciciosEstructurasCondicionales;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) throws IOException {
		/*Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’.
		Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 mostrará "ACEPTADA" 
		si el género es "F" o "ACEPTADO" si el género es "M", si no se cumplen estas condiciones, 
		se mostrará "NO ACEPTADO/A"*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad = leer.nextInt();
		System.out.println("Introduce tu nota: ");
		double nota = leer.nextDouble();
		System.out.println("introduce el género [F-M]");
		char genero = (char)System.in.read();
		
		if (edad>=5 && nota>=18) {
			if(genero=='f' || genero=='F') {
			System.out.println("ACEPTADO");
		} else if (genero=='m' || genero=='M'){
			System.out.println("ACEPTADO");
		} else {
			System.out.println("ACEPTADX");
		}
		}
		else {
			System.out.println("NO ACEPTADO");
		}
		leer.close();
	}

}
