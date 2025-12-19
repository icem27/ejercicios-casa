package Ejercicios_1;

public class Ejercicio_11 {
	/*
	 * Dos números son amigos si cada uno de ellos es igual a la suma de los
	 * divisores del otro ( no consideramos divisor el propio número).
	 * 
	 * Como por ejemplo el 220 y el 284 (que son amigos):
	 * 
	 * 284 => divisores 1 + 2 + 4 + 71 + 142 = 220
	 * 
	 * 220 => divisores 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
	 * 
	 * Diseña un programa modular que dados dos números introducidos por teclado me
	 * muestre mediante un mensaje si los dos número son amigos.
	 * 
	 * Realiza un método auxiliar que calcule la suma de divisores.
	 */
	public static void main(String[] args) {
		int num=1184;
		int num2=1210;
		calcDivisores(num);
		System.out.println(calcDivisores(num));
		System.out.println(calcDivisores(num2));
		
		
		if(calcDivisores(num)==num2 && calcDivisores(num2)==num) {
			System.out.println("Son amigos");
		} else {
			System.out.println("No son amigos");
		}

	}
	
	static int calcDivisores(int x) {
		int acumulador=0;;
		for(int i=1;i<x;i++) {
			boolean n= x%i==0;
			if(n) {
				acumulador+=i;
			}
		}
		return acumulador;
	}
	
	

}
