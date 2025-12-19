package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_12 {
	/*
	 * Escribe un programa en Java que lea 15 números por teclado y que los almacene
	 * en un array.
	 * 
	 * Desplaza los elementos de ese array una posición, es decir, el elemento de la
	 * posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc. El número que
	 * se encuentra en la última posición debe pasar a la posición 0.
	 * 
	 * Finalmente, muestra el contenido del array.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int tam=5;
		int[] nums=new int[tam];

		System.out.println("Ve introduciendo numeros enteros y pulsando INTRO");
		for(int i=0;i<nums.length;i++) {
			nums[i]=leer.nextInt();
		}
		System.out.println("-------Array Original--------");
		for(int a:nums) {
			System.out.print(a + " | ");
		}
		
		int aux=nums[4];
		for (int i=tam-1;i>0;i--) {
			nums[i]=nums[i-1];
		}
		nums[0]=aux;
		
		System.out.println("\n-------Array desplazado--------");
		for(int b:nums) {
			System.out.print(b + " | ");
		}

	leer.close();
	}

}
