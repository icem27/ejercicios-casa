package org.barajas.ies;

import java.util.Scanner;

public class Principal_calc {

	public static void main(String[] args) {

		int opcion = -1;
                Scanner entrada = new Scanner(System.in);
                do {        
                        System.out.println("*** ########## OPERACIONES ARITMETICAS ########## ***");
			System.out.println("*** -------------------------------------------------------------- ***");
			System.out.println("1. Suma ");
			System.out.println("2. Resta ");
			System.out.println("3. Multiplicación ");
			System.out.println("4. División ");
			System.out.println("5. Cuadrado ");
			System.out.println("6. Raíz cuadrada ");
			System.out.println("7. Factorial ");
			System.out.println("0. Terminar programa");

			System.out.println();

			opcion = entrada.nextInt();
			// A veces el Scanner deja en la caché un salto de línea
			// Hay que obligar a vaciar el buffer.
			if (entrada.hasNextLine())
				entrada.nextLine();

			int resultado = 0;

			switch (opcion) {
			case 0:
				System.out.println("*** ----------------------- FIN DEL PROGRAMA --------------------- ***");
				break;
			case 1:
				// SUMA
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado += opcion;

				System.out.println("\t*** Introduzca el segundo número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado += opcion;

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;
			case 2:
				// RESTA
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado = opcion;

				System.out.println("\t*** Introduzca el segundo número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado -= opcion;

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;
			case 3:
				// MULTIPLICACION
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado = opcion;

				System.out.println("\t*** Introduzca el segundo número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado *= opcion;

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;
			case 4:
				// DIVISION
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado = opcion;

				System.out.println("\t*** Introduzca el segundo número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado /= opcion;

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;

			case 5:
				// CUADRADO
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado = (int) Math.pow(opcion, 2);

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;

			case 6:
				// RAIZ CUADRADA
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				resultado = (int) Math.sqrt(opcion);

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;

			case 7:
				// FACTORIAL
				System.out.println("\t*** Introduzca el primer número y después pulse ENTER ***");
				opcion = entrada.nextInt();
				// A veces el Scanner deja en la caché un salto de línea
				// Hay que obligar a vaciar el buffer.
				if (entrada.hasNextLine())
					entrada.nextLine();

				if (opcion == 0 || opcion == 1) {
					resultado = 1;
				} else {
					for (int i = 2; i <= opcion; i++) {
						resultado *= i;
					}
				}

				System.out.println("\t*** El resultado de la operación es  ***");
				System.out.println("\t\t >>> " + resultado + " <<< ");

				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

				break;

			default:
				System.out.println("\t*** Opción incorrecta ***");
				// FIN OPCIÓN
				System.out.println("*** Pulse ENTER para volver al menú ... ***");

				// La utilizamos para recoger la opción que haya introducido poniendo el número
				// correspondiente el usuario por teclado
				entrada.nextLine();

				System.out.println("\n\n\n");

			}

		} while (opcion != 0);

	}
}