package EstructurasRepetetivas;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Sin utilizar la estructura FOR sacar un listado de todos los 
		// números impares del 7 al 21

		System.out.println("----WHILE----");
		int i=7;
		while (i<=21) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("----DO WHILE----");
		int n=7;
		do {
			System.out.println(n);
			n+=2;
		} while (n<=21);

	}

}
