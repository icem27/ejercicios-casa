package Ejercicios_1;

public class Ejercicio_9 {
	/*
	 * Crea un método llamado hipotenusa que calcule la longitud de la hipotenusa de
	 * un triángulo rectángulo, a partir de las longitudes de los lados (serán
	 * números reales). Utiliza el paquete Math.
	 * 
	 * public static double hipotenusa(double a,double b)
	 */

	public static void main(String[] args) {
		double cateto_A = 5;
		double cateto_B = 12;
		
		System.out.println(hipotenusa(cateto_A, cateto_B));
		

	}
	
	
	public static double hipotenusa(double a, double b) {
		double sumaCatetos;
		sumaCatetos = Math.pow(a, 2) + Math.pow(b, 2);
		return Math.sqrt(sumaCatetos);
	}

}
