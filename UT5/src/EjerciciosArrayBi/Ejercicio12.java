package EjerciciosArrayBi;

public class Ejercicio12 {
	/*
	 * Escribe un programa que guarde 20 números entre 100 y 999 generados
	 * aleatoriamente en un array de 4 filas por 5 columnas.
	 * 
	 * El programa mostrará las sumas parciales de filas y columnas igual que si de
	 * una hoja de cálculo se tratara.
	 * 
	 * La suma total debe aparecer en la esquina inferior derecha.
	 */

	public static void main(String[] args) {
		int nums[][] = new int[4][5];
		int sumaFila=0;
		int sumaColumna=0;
		int num=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
			nums[i][j]=(int) (Math.random()*(999-100+1)+100);
			}
		}
		for(int i=0;i<nums.length;i++) {
			sumaFila=0;
			for(int j=0;j<nums[i].length;j++) {
				sumaFila+=nums[i][j];
				System.out.print(nums[i][j] + " ");
			}
			System.out.printf("|%3d", sumaFila);
			System.out.println();
		}
		System.out.println("-------------------------");
		for(int i=0;i<5;i++) {
			sumaColumna=0;
			for(int j=0;j<4;j++) {
				sumaColumna+=nums[i][i];
				System.out.print(nums[i][j] + " ");
			}
			System.out.printf("|%3d", sumaColumna);
			System.out.println();
		}
		
		
	}

}
