package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Introducir un número entero por teclado. El programa debe calcular y mostrar 
		// por pantalla todos los números pares entre el 1 y el número introducido por 
		// teclado. Debe comprobar que el número introducido es mayor que 1,
		// en caso contrario debe solicitar el nº indefinidamente.

		Scanner leer = new Scanner(System.in);

		System.out.println("Introduce un número entero: ");
		int num = leer.nextInt();

		while (num <= 0) {
			System.out.println("El número debe ser > 1");
			num = leer.nextInt();
		}
		for (int i = 2; i < num; i += 2) {
			System.out.println(i);
		}

		leer.close();
	}

}
