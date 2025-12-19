package EjercicioMath;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
	/*Capturamos un número entero por teclado. Si el usuario teclea un número negativo lo 
	 * convertimos en positivo y se lo mostramos al usuario.  Deseamos saber cuántos números 
	 * han sido introducidos y cuántos de ellos han tenido que ser convertidos a positivos. 
	 * Criterio para finalizar: Mensaje ¿Quieres continuar?(S/N)*/

	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		int contadorTotal=0, contadorConvertidos=0;
		char respuesta;
		do {
			System.out.println("Introduce un número: ");
			int num=leer.nextInt();
			contadorTotal++;
			if (num < 0) {
				contadorConvertidos++;
			}
			
			System.out.println(Math.abs(num));
			System.out.println("¿Quieres continual? [S/N]");
			respuesta = (char) System.in.read();
		} while (respuesta=='S');
		System.out.println("Se han introducido " + contadorTotal + " números de los cuales " + contadorConvertidos + 
				" se han convetido");
	leer.close();
	}
	

}
