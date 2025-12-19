package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_10 {
	/*
	 * Nos piden rellenar 1 boleto de la bonoloto con una apuesta generada de forma
	 * aleatoria (5 números distintos del 0 al 49). El programa debe obtener los 5
	 * números (no se pueden repetir) de forma aleatoria y visualizar la apuesta por
	 * pantalla.
	 */
	
	public static void main(String[] args) {
		
		int[] bonoloto = new int[5];
		
		for(int i=0;i<bonoloto.length;i++) {
			bonoloto[i]=(int)(Math.random()*50);
		}
		System.out.println(Arrays.toString(bonoloto));
	}

}
