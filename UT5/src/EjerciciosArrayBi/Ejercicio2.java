package EjerciciosArrayBi;

public class Ejercicio2 {

	/*
	 * Obtener y mostrar la longitud de la fila más larga de un array bidimensional.
	 * Probarlo con el siguiente array:
	 */
	
	public static void main(String[] args) {
		int[][] array= {{43,1},{67,3,1,8,6,8},{2,7,9,2,1},{1,6,8},{4,7}};
		int max = 0;
		
		for(int i=0;i<array.length;i++) {
			int[] arr=array[i];
			if(array.length>max) {
				max=array.length;
			}
		}
		System.out.println("La fila mas larga tiene "+max + " elementos");
	}

}
