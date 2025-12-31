package Ejercicios_repaso;

public class Ejercicio_2 {
	/*
	 * Crea una función que reciba tres números y muestre cuál es el mayor. Si hay
	 * empate, indícalo.
	 */
	public static void main(String[] args) {
		int n1=1, n2=2, n3=3;
		mayorQue(n1, n2, n3);
	}
	public static void mayorQue(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) System.out.println("El número " + n1 + " es mayor que el " + n2 + " y el número " + n3);
		else if (n2>n1 && n2>n3) System.out.println("El número " + n2 + " es mayor que el " + n1 + " y el número " + n3);
		else if (n1==n2 || n1==n3 || n2==n3) System.out.println("Hay empate");
		else System.out.println("El número " + n3 + " es mayor que el " + n1 + " y el número " + n2);
	}
}
