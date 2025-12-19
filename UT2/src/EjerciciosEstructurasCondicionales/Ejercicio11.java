package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una de las siguientes opciones: \n --- SOMBRERO SELECCIONADOR --- "
				+ "\n 1. Valentía \n 2. Lealtad "
				+ "\n 3. Inteligencia "
				+ "\n 4. Ambición");
		int opc=leer.nextInt();
		
		switch(opc) {
			case 1: 
				System.out.println("1 → Gryffindor");
				break;
			case 2: 
				System.out.println("2 → Hufflepuff");
				break;
			case 3: 
				System.out.println("3 → Ravenclaw");
				break;
			case 4: 
				System.out.println("4 → Slytherin");
				break;
			default: 
				System.out.println("Otro número → Opción no válida");
		}
		leer.close();

	}

}
