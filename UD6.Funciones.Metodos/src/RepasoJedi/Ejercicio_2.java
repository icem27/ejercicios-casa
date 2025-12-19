package RepasoJedi;

import java.util.Scanner;

public class Ejercicio_2 {
	/*
	 * Realiza un programa que lea una fecha introduciendo el día, mes y año por
	 * separado y nos diga si la fecha es correcta o no. Supondremos que todos los
	 * meses tienen 30 días.
	 * 
	 * Se debe crear una función a la que le pasemos los datos y devuelva si la
	 * fecha es correcta o no
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el dia: ");
		int dia=sc.nextInt();
		System.out.print("Introduce el mes: ");
		int mes=sc.nextInt();
		System.out.print("Introduce el año: ");
		int anyo=sc.nextInt();
		fecha(dia, mes, anyo);
		sc.close();
	}
	
	public static void fecha(int dia, int mes, int anyo) {
		if((dia>0 && dia<31) && (mes>0 && mes<13)) {
			System.out.println("Fecha correcta");
		} else {
			System.out.println("La fecha no es correcta");
		}
	}

}
