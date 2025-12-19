package EjerciciosArrayBi;

public class Ejercicio101 {
	/*
	 * Invertir una matriz de modo que todos los elementos de la fila de abajo pasen
	 * a estar arriba y viceversa. Mostrar las dos matrices. Probarlo con: {{1, 2,
	 * 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}}
	 */
	public static void main(String[] args) {
		int[][] nums = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] nums1 = new int[nums.length][nums.length];
		
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums1[i][nums[i].length-j-1]=nums[i][j];
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("======= MATRIZ INVERTIDA ========");
		for(int i=0; i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				System.out.print(nums1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
