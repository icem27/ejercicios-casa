package RepasoNavidadSolcProfe;
//  Dado un número entero que se introduce por teclado, determinar si es par o impar. 

import java.util.Scanner;
public class Eje01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if ( num % 2 == 0) System.out.println(" Es Par.");
		else System.out.println(" Es Impar.");
		
	}

}
