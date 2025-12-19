package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio_10 {
	/*Construir un programa que pida al usuario 10 números enteros, los almacene en un 
	 * array, e indique en pantalla si dicho array es capicúa, es decir, si la 
	 * secuencia de sus elementos es igual vista de delante hacia atrás y de 
	 * detrás hacia delante.*/

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		
		int[] nums = new int[9];
		int tam=nums.length;
		//int datos;
		boolean capicua=true;
		
		System.out.println("Introduce " + tam + " valores");
		
		for(int i=0;i<tam;i++) {
			System.out.println("Introduce el "+ (i+1)+"ª valor: ");
			nums[i]=leer.nextInt();
			//datos=leer.nextInt();
			//nums[i]=datos;
		}
		
		for(int i=0;i<tam/2;i++) {
			if (nums[i]!=nums[tam-i-1]) {
				capicua=false;
				break;
			}
		}
		String resultado = capicua ? "Es capicúa":"No es capicúa";
		System.out.println(resultado);
	
		leer.close();

	}

}
