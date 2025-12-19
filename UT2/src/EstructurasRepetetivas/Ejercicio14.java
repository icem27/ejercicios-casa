package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		//Suma todos los números de manera consecutiva 1 + 2 + 3 + 4 ...etc.
		// Dejará de sumarse  cuando la suma anterior sea mayor de 40. 
		// Muestra cuál ha sido el último número sumado.
		
		Scanner leer = new Scanner(System.in);
		
		int num=0, suma = 0;
		
		do {
			num++;
			suma+=num;
		} while (suma<=40);
		System.out.println("El último número sumado es: "+num);
		leer.close();
	}

}
