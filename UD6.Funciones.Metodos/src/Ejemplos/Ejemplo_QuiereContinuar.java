package Ejemplos;

import java.util.Scanner;

public class Ejemplo_QuiereContinuar {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		quiereContinuar(leer);

	}
	
	static boolean quiereContinuar(Scanner lector) {
		int continua=0;
		System.out.println("¿Quieres continuar? [1-Si | 2-No]");
		continua = lector.nextInt();
		if(continua==1) {
			return true;
		} else {
			return false;
		}
	}

}
