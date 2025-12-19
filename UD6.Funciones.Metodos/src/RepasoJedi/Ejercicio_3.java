package RepasoJedi;

public class Ejercicio_3 {
	/*
	 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas.
	 * 
	 * El programa debe tener una función que reciba como parámetro una cantidad en
	 * kilómetros y nos la devuelva en millas.
	 */
	public static void main(String[] args) {
		double kilometros=12;
		System.out.printf("%.2f kilomestros son %.2f millas" , kilometros, convertir_a_millas(kilometros));
		
	}
	public static double convertir_a_millas(double km) {
		return km/1.60934;
	}

}
