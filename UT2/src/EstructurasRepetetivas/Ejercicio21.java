package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		int num, suma=0;
		
		while (true) {
			System.out.println("Introduce un número");
			num=leer.nextInt();
			if (num>0) {
				suma+=num;
			} else {
				break;
			}
		}
		
		System.out.println("La suma es: " + suma);
		

	}

}
