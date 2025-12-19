package EjercicioMath;

import java.util.Scanner;

public class Ejercicio3 {
	/*Capturamos un número positivo por teclado y deseamos calcular su  raíz cuadrada, 
	 * si es negativo el programa debe indicarlo y volver a solicitar el número.
	 * Criterio: Mensaje Si desea continuar pulse 1, si no pulse otro número*/
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num;
		int res;
		do {
			do {
				System.out.println("Introduce un número: ");
				num = leer.nextInt();
			} while (num < 0);
			double resultado = Math.sqrt(num);
			System.out.println(resultado);
			System.out.println("Si quieres continuar introduce 1, otro número para parar");
			res = leer.nextInt();
		} while (res == 1);
		System.out.println("Adiós");
		leer.close();
	}

}
