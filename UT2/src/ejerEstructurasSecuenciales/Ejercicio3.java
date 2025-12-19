package ejerEstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = leer.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = leer.nextInt();
		
		System.out.println("Hola \"" + nombre + "\"  " +edad +" años" );
	}

}
