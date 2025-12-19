package EjerciciosArrays;

public class Ejercicio_1 {

	public static void main(String[] args) {
		/*Dados estos dos arrays: {1, 3, 5, 7, 8} y {1, 2, 3, 4, 5} obtener 
		 * y mostrar un array llamado resultado que sea la suma de ambos 
		 * (suma de elementos de la misma posición).*/
		
		int[] array1 = { 1, 3, 5, 7, 8 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		int tam = array1.length;
		int[] res = new int[tam];

		for (int i = 0; i < tam; i++) {
			res[i] = array1[i] + array2[i];
			System.out.println("La suma de la " + i + ": " + res[i]);
		}

	}

}
