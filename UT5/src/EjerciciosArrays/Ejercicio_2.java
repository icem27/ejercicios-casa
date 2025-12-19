package EjerciciosArrays;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*Obtener la suma de los elementos del siguiente array:  {1, 4, 6, 10, -3, 4, 6, -5}*/
		
		int[] arraySuma= {1, 4, 6, 10, -3, 4, 6, -5};
		int tam = arraySuma.length;
		int suma=0;
		
		for(int i=0;i<tam;i++) {
			suma+=arraySuma[i];
		}
		System.out.println(suma);
		/*
		for(int n:arraySuma) {
			suma+=n;
		}*/
		System.out.println(suma);
		
	}

}
