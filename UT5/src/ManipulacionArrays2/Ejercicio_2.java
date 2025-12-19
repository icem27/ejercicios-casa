package ManipulacionArrays2;

import java.util.Arrays;

public class Ejercicio_2 {
	/*
	 * Separar el siguiente array [2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18] en otros
	 * tres:
	 * 
	 * El primero tiene que contener todos los elementos menores de 10, el segundo
	 * los elementos entre 11 y 20 y el tercero los elementos entre 21 y 30. Los
	 * elementos mayores de 30 serán descartados y los arrays no pueden tener
	 * posiciones vacías.
	 */

	public static void main(String[] args) {
		int[] num = {2, 23, 12, 4, 36, 25, 11, 6, 21, 45, 18};
		int cont10=0, cont20=0, cont30=0; //guardaremos el tamaño de los nuevos arrays
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<=10) {
				cont10++;
			} else if (num[i]>=10 && num[i]<=20) {
				cont20++;
			} else if(num[i]>=21 && num[i]<=30) {
				cont30++;
			}
		}
		
		int[] nums10= new int[cont10];
		int[] nums20= new int[cont20];
		int[] nums30= new int[cont30];
		int indice10=0, indice20=0, indice30=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]<=10) {
				nums10[indice10]=num[i];
				indice10++;
			} else if (num[i]>=10 && num[i]<=20) {
				nums20[indice20]=num[i];
				indice20++;
			} else if(num[i]>=21 && num[i]<=30) {
				nums30[indice30]=num[i];
				indice30++;
			}
		}
		
		System.out.println(Arrays.toString(nums10));
		System.out.println(Arrays.toString(nums20));
		System.out.println(Arrays.toString(nums30));

	}

}
