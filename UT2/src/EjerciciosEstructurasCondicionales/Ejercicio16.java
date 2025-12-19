package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("¿Que edad tienes?");
		int edad=leer.nextInt();
		System.out.println("¿Vives solo? [1. Si 2. No]");
		int solo = leer.nextInt();
		boolean viveSolo=(solo==1);
		System.out.println("Va al colegio? [1. Si 2. No]");
		
		boolean vaCole=leer.nextInt()==1; //int cole= leer.nextInt();
		leer.close();
		if (edad<18) {
			if (edad<12) {
				System.out.println("Niño");
				if (viveSolo && !vaCole) { //if (viveSolo==true && vaCole==false)
					System.out.println("Niño en riesgo");
				}
			} else {
				System.out.println("Adolescente");
			}
		} else if (edad<=25) {
			System.out.println("Joven adulto");
		} else if (edad<=59) {
			System.out.println("Adulto");
		} else {
			System.out.println("Adulto mayor");
		}
	}
}
