package EjerciciosArrays2;

import java.util.Scanner;

public class Ejercicio_11 {
	/*
	 * Escribe un programa que rellene un array de 100 elementos con números enteros
	 * aleatorios comprendidos entre 0 y 500 (ambosincluidos).
	 * 
	 * A continuación el programa mostrará el array y preguntará si el usuario
	 * quiere destacar el máximo o elmínimo.
	 * 
	 * Seguidamente se volverá a mostrar el array escribiendo el número destacado
	 * entre dobles asteriscos.
	 */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int[] nums = new int[10];
		nums[0]= (int) (Math.random()*(501));
		int num_min=nums[0], num_max=nums[0];
		int numUsuario;
		
		for (int i=0; i<nums.length;i++) {
			nums[i]= (int) (Math.random()*(501));
			//num_min=nums[i];
			//num_max=nums[i];
			num_min=Math.min(num_min, nums[i]);
			num_max=Math.max(num_max, nums[i]);
		}
		
		for (int i=0;i<nums.length;i++) {
			if (nums[i]>num_max) {
				num_max=nums[i];
			}
			if (nums[i]<num_min) {
				num_min=nums[i];
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i] + " ");
			if(i%20==0 && i !=0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		System.out.println("¿Que quieres destacar? [1-minimo | 2-máximo]");
		numUsuario=leer.nextInt();
		
		switch(numUsuario){
		case 1:
			for (int i=0;i<nums.length;i++) {
				if(nums[i]==num_min) {
					System.out.print(" **"+nums[i]+"** ");
					if(i%20==0 && i !=0) {
						System.out.print("\n");
					}
				} else {
					System.out.print(nums[i] + " ");
					if(i%20==0 && i !=0) {
						System.out.print("\n");
					}
				}
			}
			break;
		case 2:
			for (int i=0;i<nums.length;i++) {
				if(nums[i]==num_max) {
					System.out.print(" **"+nums[i]+"** ");
					if(i%20==0 && i !=0) {
						System.out.print("\n");
					}
				} else {
					System.out.print(nums[i] + " ");
					if(i%20==0 && i !=0) {
						System.out.print("\n");
					}
				}
			}
			break;
		default:
			System.out.println("Debe selecionar el numero correcto.");
		}	
		leer.close();		
		
	}

}
