package EjerciciosArrays2;

public class Ejercicio_7 {
	/*
	 * Crea un programa que cree un array de enteros e introduzca la siguiente
	 * secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta
	 * introducir 10 diez veces, y luego la muestre por pantalla.
	 */

	public static void main(String[] args) {
		int totalElementos = 0;
		for (int i = 0; i <= 10; i++) {
			totalElementos += i;
		}

		int[] nums = new int[totalElementos];

		int indice = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 0; j < i; j++) {
				nums[indice] = i;
				indice++;
			}
		}

		System.out.println("secuencia generada");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
