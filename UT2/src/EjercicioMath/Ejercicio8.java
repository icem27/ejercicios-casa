package EjercicioMath;

import java.util.Scanner;

public class Ejercicio8 {
	/*Realiza un programa en Java que reciba por teclado dos números y escriba infinitos números 
	 * aleatorios enteros entre el primero y el segundo (ambos incluidos). No sabemos cuál de los 
	 * dos números es mayor ya que el usuario puede escribirlos en cualquier orden. 
	 * Criterio de parada: Cuando aparezca un número múltiplo de 7 También se debe 
	 * mostrar la cantidad de números generados hasta la parada de la ejecución*/
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int primerNum, segundoNum, numFinal;
		int contador=0;

		System.out.println("Introduce el primer número: ");
		primerNum = leer.nextInt();
			
		System.out.println("Introduce el segundo número: ");
		segundoNum = leer.nextInt();

		int numMax=Math.max(primerNum, segundoNum);
		int numMin=Math.min(primerNum, segundoNum);
		
		while (true) {
			numFinal = (int) (Math.random()*((numMax-numMin)+1)+numMin);
			contador++;
			System.out.println("Número " + contador + ": " + numFinal);
		
			if (numFinal % 7 == 0) {
				System.out.println("Múltiplo de 7: " + numFinal);
				break;
			}
		
		}
		System.out.println("Los números totales son: " + contador);
		leer.close();
	}

}
