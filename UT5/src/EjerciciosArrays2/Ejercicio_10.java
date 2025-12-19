package EjerciciosArrays2;

public class Ejercicio_10 {

	/*
	 * Escribe un programa en Java que genere 20 números enteros aleatorios entre 0
	 * y 100 y que los almacene en un array.
	 * 
	 * El programa debe ser capaz de pasar todos los números pares a las primeras
	 * posiciones del array (del 0 en adelante) y todos los números impares a las
	 * celdas restantes.
	 */

	public static void main(String[] args) {
		int[] nums = new int[20];
		int[] numsOrdenados = new int[20];
		int indice = 0;
		// Este es un for para crear los numeros aleatorios
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * (101));
		}
		// Este es el for para meter los pares primero
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				numsOrdenados[indice] = nums[i];
				indice++;
			}
		}
		// Este for es para meter los números impares en el resto del array
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				numsOrdenados[indice] = nums[i];
				indice++;
			}
		}
		// Para visualizar el array
		for (int a : numsOrdenados) {
			System.out.print(a + " ");
		}

	}

}
