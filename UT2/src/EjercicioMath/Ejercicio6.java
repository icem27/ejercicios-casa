package EjercicioMath;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
	/*Realiza un programa en Java que reciba por teclado un número entero mayor que 1 
	 * y devuelva un número aleatorio entero entre 1 y el número recibido (ambos incluidos).
	 * Condición de parada: ¿Deseas continuar?(S/N)*/
	
	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		int numUsuario;
		char respuesta;
		
		
		do {
			System.out.println("Introduce un número >1: ");
			numUsuario=leer.nextInt();
			
			int numFinal = (int) (Math.random()*((numUsuario-1)+1)+1);
			
			System.out.println(numFinal);
			
			System.out.println("¿Quieres continual? [S/N]");
			respuesta = (char) System.in.read();
		} while (respuesta=='S' || respuesta=='s');
		System.out.println("Programa finalizado. Hasta luego.");
		leer.close();
	}

}
