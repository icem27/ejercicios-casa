package EjerciciosArrays;

public class Ejemplo_4 {

	public static void main(String[] args) {
		/* A partir del siguiente array {2, 3, 4, 7, 8, 10, 11} 
		 * obtener otro con ceros intercalados entre sus posiciones {2, 0, 3, 0, 4, 0, …}*/

		int[] nums = {2, 3, 4, 7, 8, 10, 11};
		int[] res = new int[nums.length*2];
		int tam=res.length;
		
		for (int i=0; i<tam;i++) {
			if (i%2==0) {
				res[i]=nums[i/2];
						}
			
		}
		for (int i=0; i<tam;i++) {
			System.out.print(res[i] + ", ");
		}
		
	}

}
