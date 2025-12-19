package EjerciciosArrayBi;

public class Ejercicio1 {

	public static void main(String[] args) {
		int[][] arrayA = {{3,6,8,5},{4,7,1,9}};
		int[][] arrayB = {{2,5,6,3},{7,-7,3,4}};

		int[][] suma =new int[arrayA.length][arrayA[0].length];
		
		//Mi solución
		for(int i=0;i<arrayA.length;i++) {
			for(int j=0;j<arrayA[0].length;j++) {
				if((i+j)%2==0) {
				suma[i][j]=arrayA[i][j]+arrayB[i][j];
				}
				System.out.print(suma[i][j]+" ");
			}
			System.out.println();
		}
		
		//solución de la profesora: 
//		for(int i=0;i<arrayA.length;i++) {
//			int[] arrA=arrayA[i];
//			int[] arrB=arrayB[i];
//			for(int j=0;j<arrA.length;j++) {
//				if((i+j)%2==0) {
//				suma[i][j]=arrA[j]+arrB[j];}
//				
//				System.out.print(suma[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
