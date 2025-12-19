package EjerciciosArrayBi;


public class Ejercicio_11 {
	/*
	 * Dada una matriz cuadrada obtener cual es la suma de todos los elementos que
	 * componen las dos diagonales.
	 * 
	 * Probarlo con: {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,9,
	 * 20},{21,22,23,24,25}}
	 */

	public static void main(String[] args) {
		int[][] num={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,9,20},{21,22,23,24,25}};
		int sumaD1=0;
		int sumaD2=0;
		
		for(int i=0;i<num.length;i++) {
			sumaD1+=num[i][i];
			sumaD2+=num[i][num.length-1-i];
		}
		
		System.out.println("Suma D1= " + sumaD1 + " y la suma D2= " + sumaD2 + " y la suma total es: " + (sumaD1+sumaD2));

	}

}
