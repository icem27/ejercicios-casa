package arrayList;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero;
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		
		do {
			try {
			System.out.println("Introduce números enteros, introduce 0 para salir.");
			numero = leer.nextInt();
			if(numero!=0) {
				numeros.add(numero);
			}
			} catch (InputMismatchException e) {
				System.out.println("Error");
				leer.nextLine();
				numero=-1;
			}
		} while (numero != 0);
		
		System.out.println("Mostrar los números");
		mostrarNumeros(numeros);
		double m=calcularMedia(numeros);
		System.out.println("La media de los números introducidos es: " + m);
		int max=calcularMax(numeros);
		System.out.println("El número mayor es: " + max);
	}
	
	public static void mostrarNumeros(ArrayList<Integer> numeros) {
		for(Integer n:numeros) {
			System.out.println(n);
		}
	}
	
	public static double calcularMedia(ArrayList<Integer> numeros) {
		double media=0;
		try {
		for(Integer n:numeros) {
			media+=n;
		}
		media=media/numeros.size();
		} catch (ArithmeticException e) {
			System.out.println("El array no tiene elementos");
		}
		return media;
	}
	
	public static int calcularMax(ArrayList<Integer> numeros) {
		int max=numeros.get(0);
		int tam=numeros.size();
		for(int i=0;i<tam;i++) {
			max=Math.max(max, numeros.get(i));
		}
		return max;
	}

}
