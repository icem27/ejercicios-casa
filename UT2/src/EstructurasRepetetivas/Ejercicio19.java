package EstructurasRepetetivas;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Mopstrar todos los números entre 1 y 50 cuando encuentre el primer 
		 * múltiplo de 2 y 5 dejará de mostrar */
		
		for (int i=1; i <= 50; i++) {
			if(i%3==0 && i%5==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("=====FIN=====");

	}

}
