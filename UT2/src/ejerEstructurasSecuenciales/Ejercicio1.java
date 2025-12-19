package ejerEstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
	Scanner leer= new Scanner(System.in);
	System.out.println("Introduce tu nombre");
	String nombre=leer.nextLine(); //Aqui solo te lee el primer catacter, sin el espacio. Por ejemplo si pones ismael chriki, solo te leerá ismael
	System.out.println("Introduce tu edad");
	int edad=leer.nextInt();
	System.out.println("Tu nombre es "+nombre + " y tienes "+edad+ " años");
	
	}
}
