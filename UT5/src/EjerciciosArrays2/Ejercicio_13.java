package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_13 {
	/*
	 * Escribe un programa en Java que genere 100 números enteros aleatorios del 0
	 * al 20 y que los muestre por pantalla separados por espacios.
	 * 
	 * El programa pedirá entonces por teclado dos valores y a continuación cambiará
	 * todas las ocurrencias del primer valor por el segundo en el array generado
	 * anteriormente.
	 * 
	 * Los números que se han cambiado deben aparecer entrecomillados.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] nums=new int[20];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)(Math.random()*21);
		}
		for(int a:nums) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\nIntroduce un número de los que se han mostrado: ");

	}

}
