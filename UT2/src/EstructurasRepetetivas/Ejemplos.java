package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejemplos {
	
	public static void main(String[] args) {
		
	//Ejemplo de bucle for
	/*	for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	*/
	//Ejemplo de bucle while
		int num;
		Scanner leer= new Scanner(System.in);
	/*	
		System.out.println("Introduce un número o cero para salir");
		num = leer.nextInt();
		
		while (num != 0) {
			System.err.println("Introduce un número o cero para salir");
			num = leer.nextInt();
		}
	System.out.println("Adiós");
	*/
	/*
		do {
			System.out.println("Introduce un número positivo");
			num = leer.nextInt();
		} while (num<=0);
		System.out.println("Has introducido un número positivo");
	*/
	//Ejemplo:
	//1. Supongamos que queremos pedir una contraseña, 
	// pero solo damos 5 intentos para poder introducirla, 
	// veamos como podríamos hacerlo con los bucles for,
	// while o do-while.

		String miPassword ="Clara";
		String campo="";
		
		for (int i =1; i <=5; i++) {
			System.out.println("Introduce la contraseña");
			campo = leer.next();
			if (miPassword.equals(campo)) {
				System.out.println("Bien, login correcto!!!");
				break;
			}
			System.out.println(i + "º intento fallido.");
		} 
	
	leer.close();
	}

}
