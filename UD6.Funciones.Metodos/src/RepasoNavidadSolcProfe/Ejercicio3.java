package RepasoNavidadSolcProfe;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char letra;
		
		System.out.println("Introduce una letra:");
		letra = sc.nextLine().charAt(0);
		pintarPiramide(letra);
		

	}
	public static void pintarPiramide(char letra) {
		// La paso a mayusculas
				letra = Character.toUpperCase(letra);
				
				int vecesletra = 1;
				int distancia = letra - 'A';
				for (char iletra = 'A'; iletra <= letra; iletra++ ){
					// Guiones ---
					for (int i=1; i <= distancia; i++) System.out.print('-');
					// letra  CCC
					for (int i=1; i <= vecesletra; i++) System.out.print(iletra);
					// Guiones ---
					for (int i=1; i <= distancia; i++) System.out.print('-');
					System.out.println();
					distancia--;
					vecesletra +=2;
				}
	}

}
