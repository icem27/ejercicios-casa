package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_5 {
	/*
	 * Coger el siguiente array [6, 9, 8, 10, 11] y dividirlo por este otro posición
	 * a posición [2, 3, 4, 2, 3] y en el array resultado sumarle 10 a todos los
	 * valores menores de 4.
	 */
	public static void main(String[] args) {
		int[] num= {6, 9, 8, 10, 11};
		int[] num1= {2, 3, 4, 2, 3};
		int[] resultado= new int[num.length];
		
		for(int i=0;i<num.length;i++) {
			resultado[i]=num[i]/num1[i];
			if(resultado[i]<4) {
				resultado[i]+=10;
			}
		}
		System.out.println(Arrays.toString(resultado));
	}

}
