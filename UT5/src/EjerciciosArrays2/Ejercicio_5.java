package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_5 {	/*
	 * Crea un programa que cree un array de 10 enteros y luego muestre el siguiente
	 * menú con distintas opciones: a. Mostrar valores. b. Introducir valor. c.
	 * Salir. La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’
	 * pedirá un valor V y una posición P, luego escribirá V en la posición P del
	 * array.
	 * 
	 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’
	 * que terminará el programa.
	 */
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			int[] array = new int[10];
			String opcion;
			char letra = ' ';

			do {
				System.out.println("a. Mostrar valores.");
				System.out.println("b. Introducir valor.");
				System.out.println("c. Salir.");
				opcion = leer.nextLine();
				

				letra = opcion.charAt(0);
				switch (letra) {
				case 'a':
					for (int mostrar : array) {
						System.out.println(mostrar);
					}
					break;
				case 'b':
					System.out.println("¿Que valor quieres introducir?");
					int V = leer.nextInt();
					System.out.println("¿En que posición la quieres poner?");
					int P = leer.nextInt();
					if (P>9 || P<0) {
						System.out.println("Debes introducir un número inferior que 10 y superior o igual a 0");
					} else {
						array[P] = V;
					}
					leer.nextLine();
					break;
				case 'c':
					System.out.println("Hasa la próxima.");
					break;
				default:
					System.out.println("Debes elegir entre las opciones indicadas");
					break;
				}
			} while (letra != 'c');
			
			leer.close();
		}

}
