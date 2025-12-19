package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// 
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce el número del dia[1-7]");
		int dia = leer.nextInt();
		
		for (int i=1; i <=7; i++) {
			if (i==dia) {
				System.out.println("Hoy es dia " + dia);
				break;
			}
			System.out.println("Dia " + i);
		}
		leer.close();
	}

}
