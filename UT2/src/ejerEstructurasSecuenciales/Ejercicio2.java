package ejerEstructurasSecuenciales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Entroduce una palabra");
		String palabra= leer.next();
		leer.nextLine();
		
		System.out.println("Introduce una frase:");
		String frase= leer.nextLine();
		
		System.out.println("introduce un entero: ");
		int entero=leer.nextInt();
		
		System.out.println("Introduce un decimal double:");
		double numD=leer.nextDouble();
		
		System.out.println("Introduce un decimal float");
		float numF=leer.nextFloat();
		
		System.out.println("Introduce un boolean");
		boolean verdadero=leer.nextBoolean();
		
		System.out.println("Tu nombre: "+palabra+", tus apellidos: "
		+frase+", tu edad: "+entero+", tu altura: "+numD+", tu peso: "
				+numF+"kg"+"\n, eres un alumno? "+verdadero);
		leer.close();
	}

}
