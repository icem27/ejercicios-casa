package Ejemplos;

import java.util.Scanner;

public class CodigoEspejoB {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n;
		int m=0;
		
		while (true) {
		System.out.println("Introduce un número: ");
		n=leer.nextInt();
		if (n<0) {
			break;
		}
		
		if (n>m) {
			m=n;
		}
		}
			System.out.println(m);

			leer.close();
	}
}
		
			
		
					
		





