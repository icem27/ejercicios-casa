package EjercicioMath;

public class Ejemplo5 {
	/*Genera número aleatorios enteros  comprendidos entre 100 y 250.
	 * Criterio de parada: 20 números generados*/
	public static void main(String[] args) {
			for(int i=0;i<=20;i++) {
				int num = (int) (Math.random()*(151)+100);
				System.out.println(num);
			}
	}

}
