package EjerciciosArrays;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[20];
		int[] array3 = new int[30];

		int tam1 = array1.length;
		int tam2 = array2.length;
		int tam3 = array3.length;

		// Para la asignación del array1
		for (int i = 0; i < tam1; i++) {
			array1[i] = i + 100;
		}
		// Para la asignación el array2
		for (int i = 0; i < tam2; i++) {
			array2[i] = 20 - i;
		}

		// Para la asignación del array3
		for (int i = 0; i < tam2; i++) {
			array3[i] = array2[i];
		}

		for (int i = 0; i < tam1; i++) {
			//int j = i + 20;
			array3[20+i] = array1[i];
		}

		// Localiza el número 5 en el array3
		for (int i = 0; i < tam3; i++) {
			if (array3[i] == 5) {
				System.out.println("El número 5 esta en la posición: " + i);
				break;
			}
		}

		// Asignación del 99 a partir del 5 hasta el 8 en el array2
		for (int i = 5; i <= 8; i++) {
			array2[i] = 99;
		}

		// Copia en el array1 desde la posición 2, los 6 primeros elementos del array2
		for (int i = 2; i <= 7 ; i++) {
				array1[i] = array2[i-2];
		}

		// Visualización del array1
		System.out.print("Array1: ");
		for (int i = 0; i < tam1; i++) {
			System.out.print(array1[i] + " ");

		}

		// Visualización del array2
		System.out.println();
		System.out.print("Array2: ");
		for (int i = 0; i < tam2; i++) {
			System.out.print(array2[i] + " ");
		}

		// Visualización del array3
		System.out.println();
		System.out.print("Array3: ");
		for (int i = 0; i < tam3; i++) {
			System.out.print(array3[i] + " ");
		}
		
	}

}