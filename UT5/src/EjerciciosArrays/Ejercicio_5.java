package EjerciciosArrays;

public class Ejercicio_5 {
	/*Crear una array llamado ejemplo de 5 elementos de tipo entero e 
	 * inicializar sus elementos con el valor de cada índice( posición).*/
	public static void main(String[] args) {
		int[] ejemplo= new int[5];
		int tam=ejemplo.length;
		
		for (int i=0;i<tam;i++) {
			ejemplo[i]= i;
			System.out.println(ejemplo[i]);
		}

	}

}
