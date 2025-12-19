package Mision2;

import java.util.Scanner;

public class Chriki_Ismael_mision2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		// Todas las variables, booleanos y constantes que se usan en el codigo.
		int entrada;
		int valorEnergia;
		int diaViaje = 0;
		int mesViaje = 0;
		int anhoViaje = 0;
		int contador = 0;
		int crones = 0;
		boolean mes = true;
		boolean dia = true;
		boolean casoUno = false;
		boolean casoDos = false;
		int energia_final;
		String resultado = "";
		String palabra = "CRONOS";
		String palabraOculta = "";
		int intentos = 6;

		do {// Lo realizo con el do while por si el usuario introduce un 0 que no entre de
			// nuevo
			System.out.println("---- CENTRO DE CONTROL TEMPORAL ----" + "\n 1. Calibrar el portal"
					+ "\n 2. Establecer fecha del viaje" + "\n 3. Mostrar carga temporal acumulada"
					+ "\n 4. Iniciar viaje" + "\n 5. Describir la clave temporal" + "\n 0. Salir"
					+ "\n -----------------------------------" + "\n Elige una opción: ");
			entrada = leer.nextInt();

			switch (entrada) {// La mejor opciona fue realizar la actividad con el switch, ya que sabes los
								// casos que tienes
			case 1:
				System.out.println("=====================================" + "\n	Calibrar el portal"
						+ "\n=====================================");

				energia_final = (int) (Math.random() * 151);// Ponemos aqui la formula de random para que
				// una vez salga del while y se consulte de nuevo, se realice nuevo cálculo.

				while (contador < 5) {// Se realiza con un while para que se repita el bucle hasta que el usuario
					// introduzca la energia correcta
					System.out.println("Introduce la cantidad de energia: ");
					valorEnergia = leer.nextInt();
					if (valorEnergia > energia_final) {
						System.out.println("La cantidad introducida es demasiado alta");
						contador++;
					} else if (valorEnergia < energia_final) {
						System.out.println("La cantidad introducida es demasiado baja");
						contador++;
					} else {
						contador++;
						System.out.println("Has acertado en " + contador + " intento/s");
						crones += 10;
						casoUno = true;
						contador = 0;
						break;
					}
				}
				// Este if sirve para si el usuario introduce mas de 5 intrentos salg al menú
				// principal
				if (contador >= 5 && casoUno || !(casoUno)) {
					System.out.println("--------------------" + "\nHas introducido demasiados intentos. "
							+ "\nIntentalo de nuevo mas tarde" + "\n--------------------");
					contador = 0;
				}
				break;

			case 2:
				System.out.println("=====================================" + "\n	Establecer fecha del viaje"
						+ "\n=====================================");

				System.out.println("Introduce dia: ");
				diaViaje = leer.nextInt();
				System.out.println("Introduce mes: ");
				mesViaje = leer.nextInt();
				System.out.println("Introduce año: ");
				anhoViaje = leer.nextInt();

				if (mesViaje < 1 || mesViaje > 12) { // Este if es para verificar si los meses están entre 1 y 12 meses
					mes = false;
				}
				boolean bisiesto = (anhoViaje % 4 == 0 && anhoViaje % 100 != 0) || (anhoViaje % 400 == 0);
				if (diaViaje < 1 || diaViaje > 31) { // Este if es para verificar si los dias están entre 1 y 31 meses
					dia = false;
				} else if ((mesViaje == 4 || mesViaje == 6 || mesViaje == 9 || mesViaje == 11) && diaViaje > 30) {
					dia = false;
				} else if (mesViaje == 2 && diaViaje > 28 && !(bisiesto && diaViaje == 29)) {
					dia = false;
				}

				if (dia && mes) { // La logica para verificar si la fecha introducida es correcta
					resultado = "Las coordenadas son estables";
					crones += 5;
					casoDos = true;
				} else {
					resultado = "Las coordenadas son inestables";
					dia = true;
					mes = true;
				}

				System.out.println(resultado);
				break;
			case 3: // En este caso solo muestrar los crones acumulados.
				System.out.println("Tu carga temporal es de " + crones + " crones");
				break;

			case 4:
				if (casoUno && casoDos && crones >= 10) { // Para este caso solo verifica si los booleanos son
															// verdaderos y los cronos son mas de 10
					resultado = "\"Activando portal..." + "\nCoordenadas estables..."
							+ "\n¡Salto temporal realizado con éxito!\"";
					crones -= 10;
					casoDos = false;
				} else if (!casoUno) {// Si el caso uno es false entra aquí
					resultado = "Error: el portal no está calibrado. Realiza la calibración antes de iniciar el viaje.";
				} else if (!casoDos) {// Si el caso uno es true y caso dos es false entra aquí
					resultado = "Error: coordenadas temporales inestables. Introduce una fecha de destino correcta.";
				} else if (crones < 10) {// Si los dos anteriores casos son false entra aquí
					resultado = "Error: carga temporal insuficiente. Se necesitan al menos 10 crones para abrir el portal.";
				}

				System.out.println(resultado);
				break;
			case 5:
				for (int i = 0; i < palabra.length(); i++) {//Con este if mostramos la palabra pero con casteriscos
					palabraOculta += "*";
				}
				
				leer.nextLine();//Para refrescar el buffer, ya que el sistema se queda con el nextInt anterior.
				
				while (intentos > 0) {
					boolean letraEncontrada = false;
					System.out.println(palabraOculta);
					System.out.println("Intentos restantes: " + intentos);
					System.out.print("Introduce la palabra secreta:");
					String letra = leer.nextLine().toUpperCase();//convierte la letra en mayuscula
					String nuevaPalabraOculta = "";

					for (int i = 0; i < palabra.length(); i++) {//Debemos recorrer la letra para averiguar si la letra introducida por el usuario es correcta o no
						if (palabra.charAt(i) == letra.charAt(0)) {
							nuevaPalabraOculta += letra;//Si la letra es correcta, se introduce en una nueva variable
							letraEncontrada = true;
						} else {
							nuevaPalabraOculta += palabraOculta.charAt(i); //si la letra es incorrecta, se introduce el valor de la posición de la palabra oculta
						}
					}
					
					palabraOculta = nuevaPalabraOculta;//Asignamos el mismo valor de la nueva palabra a la oculta para mostrar al usuario

					if (letraEncontrada) {
						System.out.println("¡Letra correcta!\n");
					} else {
						System.out.println("Letra incorrecta\n");
						intentos -= 1;
					}

					if (palabra.equalsIgnoreCase(palabraOculta)) {
						System.out.println("Has ganado! La palabra era: " + palabra);
						crones += 15;
						break;
					}

					if (intentos == 0) {
						System.out.println("Colapso temporal... La palabra era: CRONOS");
						break;
					}

				}
				intentos=6;
				palabraOculta="";
				break;
				
			case 0:
				System.out.println("Desconectando sistema temporal... Hasta el próximo salto");
				break;

			default:// Si no se seleciona del 0 al 4 le salta directamente aqui para que seleciona
					// el número correcto
				System.out.println("Opción no válida. Por favor, selecciona una opción del 0 al 4");
			}

		} while (entrada != 0);
		leer.close();
	}

}
