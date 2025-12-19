package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio14_1 {
	public static void main(String[] args) {
		//Suma todos los números de manera consecutiva 1 + 2 + 3 + 4 ...etc.
		// Dejará de sumarse  cuando la suma anterior sea mayor de 40. 
		// Muestra cuál ha sido el último número sumado.
		
		Scanner leer = new Scanner(System.in);
		//System.out.println("Introduce un número");
		int num;
		int acumulador=0, suma = 0;
		
		do {
			System.out.println("Introduce un número");
			num=leer.nextInt();
			suma+=num;
			acumulador++;
		} while (suma<=40);
		
		
		System.out.println("Has introducido "+acumulador + " lol: " + suma);
		leer.close();
	}

}
