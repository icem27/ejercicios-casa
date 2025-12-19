package EjerciciosArrays;

public class Ejercicio_3 {
	/*
	 * Imprimir en pantalla los elementos del siguiente array {2, 3, 4, 7, 8, 10,
	 * 11} indicando para cada uno de ellos si es par o impar.
	 */
	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 7, 8, 10, 11 };
		int tam = nums.length;

		for (int i = 0; i < tam; i++) {
			System.out.println("Número: " + nums[i] + (nums[i] % 2 == 0 ? " es Par" : " es Impar"));
		}

	}

}
