package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 Crea un programa en Java que muestre en pantalla un menú con las siguientes opciones:

--- MENÚ PRINCIPAL ---
1. Iniciar sesión
2. Registrarse
3. Recuperar contraseña
4. Salir

El programa debe:

Pedir al usuario que introduzca un número correspondiente a una opción del menú.
Usa un switch para mostrar un mensaje en función de la opción elegida:
Si elige 1, mostrar: "Has elegido Iniciar sesión".
Si elige 2, mostrar: "Has elegido Registrarse".
Si elige 3, mostrar: "Has elegido Recuperar contraseña".
Si elige 4, mostrar: "Saliendo del programa...".
Si introduce un número que no está entre 1 y 4, mostrar: "Opción no válida".*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una de las siguientes opciones: \n --- MENÚ PRINCIPAL --- \n 1.Iniciar sesión \n 2.Registrarse \n 3.Recuperar contraseña \n 4.Salir");
		int opc=leer.nextInt();
		
		switch(opc) {
			case 1: 
				System.out.println("Has elegido Iniciar sesión");
				break;
			case 2: 
				System.out.println("Has elegido Registrarse");
				break;
			case 3: 
				System.out.println("as elegido Recuperar contraseña");
				break;
			case 4: 
				System.out.println("Saliendo del programa...");
				System.out.println("Hasta la próxima");
				break;
			default: 
				System.out.println("Opción no válida");
		}
		leer.close();
		
	}

}
