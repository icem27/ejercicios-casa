package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("Indicanos tu edad para poder recomedarte el genero de pelicula: ");
		int edad = leer.nextInt();
		int tipo=0;

		if (edad >= 0 && edad <= 6) {
			tipo =1;
		} else if (edad >= 7 && edad <= 12) {
			tipo =2;
		} else if (edad >= 13 && edad <= 17) {
			tipo =3;
		} else if (edad >= 18 && edad <= 120) {
			tipo =4;
		} 

		switch (tipo) {
			case 1:
				System.out.println("0-6 → Películas infantiles");
			break;
			case 2:
				System.out.println("7-12 → Películas familiares");
			break;
			case 3:
				System.out.println("13-17 → Películas juveniles");
			break;
			case 4:
				System.out.println("18 o más → Películas para adultos");
			break;
			default: 
				System.out.println("Edad no válida");
		}

		leer.close();
	}

}
