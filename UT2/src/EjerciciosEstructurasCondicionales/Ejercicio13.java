package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("--- COLORES PRIMARIOS --- \n 1.Rojo \n 2.Azul \n 3.Amarillo");
		System.out.println("Elige un color[1-3]");
		int color1= leer.nextInt();
		System.out.println("Elige otro color[1-3]");
		int color2= leer.nextInt();
		
		switch(color1) {
		case 1: 
			switch (color2) {
			case 1: 
				System.out.println("Has eligido el mismo color.");
				break;
			case 2: 
				System.out.println("Morado.");
				break;
			case 3: 
				System.out.println("Naranja.");
				break;
				
			default:
				System.out.println("Color no válido.");
			}
			break;
		case 2: 
			switch (color2) {
			case 1: 
				System.out.println("Morado.");
				break;
			case 2: 
				System.out.println("Has eligido el mismo color.");
				break;
			case 3: 
				System.out.println("Verde.");
				break;
			default:
				System.out.println("Color no válido.");
			}
			break;
		case 3: 
			switch (color2) {
			case 1: 
				System.out.println("Naranja.");
				break;
			case 2: 
				System.out.println("Verde.");
				break;
			case 3: 
				System.out.println("Has eligido el mismo color.");
				break;
				
			default:
				System.out.println("Color no válido.");
			}
			break;
		default:
			System.out.println("Color no válido.");
		}
		leer.close();
	}

}
