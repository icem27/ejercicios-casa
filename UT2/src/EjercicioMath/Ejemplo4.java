package EjercicioMath;

import java.io.IOException;
import java.util.Scanner;

public class Ejemplo4 {
	/*Capturamos números reales por teclado y queremos redondear al entero más próximo. 
	 *Criterio: Mensaje ¿Quieres continuar? (Si/No)*/
	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		double num;
		char respuesta;
		
		do {
			System.out.println("Introduce un número con decimales: ");
			num = leer.nextDouble();
			
			num = Math.round(num);
			
			System.out.println(num);
			System.out.println("¿Quieres continual? [S/N]");
			respuesta = (char) System.in.read();
		} while (respuesta=='S' || respuesta=='s');
		System.out.println("Adiós");
	leer.close();	
	}

}
