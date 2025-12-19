package ArraysBi2;

import java.util.Arrays;

import java.util.Scanner;

public class Examen_2024 {

	public static void main(String[] args) {
		String[][] golosinas = { { "KitKat", "Huesitos", "Lacasitos", "Palotes" },
				{ "Kinder Bueno", "Bolsa variada Haribo", "Cheetos", "Pelotazos" },
				{ "Kinder Bueno", "M&M'S", "Lays", "Chicles de menta" },
				{ "Lacasitos", "Crunch", "Milkybar", "Conguitos" },
				{ "Chicles de fresa", "Lays", "Risketos", "Pipas baconeras" } };

		Scanner leer = new Scanner(System.in);
		double totalVendido = 0;
		final int CAPACIDAD_MAX = 5;

		int totFilas = golosinas.length;
		int totColumnas = golosinas[0].length;
		
		int[][] cantidades = new int[totFilas][totColumnas];

		// Rellenamos todas las golosinas con 5 unidades
		for (int i = 0; i < cantidades.length; i++) {
			Arrays.fill(cantidades[i], CAPACIDAD_MAX);
		}
		boolean salir = false;
		while (!salir) {
			System.out.println("\n*********************************************************");
			System.out.println("Bienvenid@ a Daw Candy 2025. Selecciona una opción:");
			System.out.println("1. Pedir golosina");
			System.out.println("2. Mostrar golosinas");

			System.out.println("3. Rellenar golosinas");
			System.out.println("4. Apagar");
			System.out.println("*********************************************************");
			int opcion = leer.nextInt();

			switch (opcion) {
			case 1:
			
				int fila = 0;
				int columna = 0;
				boolean error = false;
				System.out.println("Introduce la posición de la golosina");

				String posicion = leer.next();
				if (posicion.length() != 2) {
					System.out.println("La posición introducida no es válida");
					error=true;
				} else if (!Character.isDigit(posicion.charAt(0)) || !Character.isDigit(posicion.charAt(1))) {
					System.out.println("Dato con formato incorrecto");
					error=true;
				} else {
					
					fila = Integer.parseInt(Character.toString(posicion.charAt(0)));// convertimos el character a String
																					// y de String a int
					columna = Integer.parseInt(Character.toString(posicion.charAt(1)));

					if (fila >= totFilas || columna >= totColumnas) {// si la fila/columna introducidas son mayores que
																		// el
																		// número de filas/columnas, devolvemos error
						System.out.println("Posicion no existente en la máquina");
						error=true;
					}

				}
				if (!error) {

					if (cantidades[fila][columna] > 0) {
						// si hay disponibilidad

						double precio = 0;
						if (columna % 2 == 0) {
							precio = 0.85;
						} else {
							precio = 1.15;
						}
						totalVendido += precio;
						// actualizamos la cantidad
						cantidades[fila][columna]--;
						System.out
								.println("Aquí tienes tu " + golosinas[fila][columna] + ". Importe: " + precio + " €");
					}
				}
				break;
			case 2:
				System.out.println("Golosinas disponibles");
				System.out.println("=======================================================");
				System.out.printf("%8s%10s%15s\n", "Código", "Precio", "Cantidad");
				System.out.println("=======================================================");
				for (int i = 0; i <totFilas; i++) {

					for (int j = 0; j < totColumnas; j++) {
						if (cantidades[i][j] > 0) {
							double precio = 0;
							if (j % 2 == 0) {
								precio = 0.85;
							} else {
								precio = 1.15;
							}
							System.out.printf("\n%5s%10.2f €%20s ---> %s", "" + i + j, precio,
									cantidades[i][j] + " disponibles", golosinas[i][j]);
						}

					}
				}
				break;

			case 3:
				String password = "";
				boolean errorR = false;

				System.out.println("Introduce la clave");
				password = leer.next();

				if (password.toUpperCase().equals("1DAWCHUCHE2025")) {

				
					System.out.println("Introduce la posición de la golosina");

					String posicionR = leer.next();
					int filaR = 0;
					int colR = 0;
					if (posicionR.length() != 2) {
						System.out.println("La posición introducida no es válida");
						errorR=true;
					} else if (!Character.isDigit(posicionR.charAt(0)) || !Character.isDigit(posicionR.charAt(1))) {
						System.out.println("Dato con formato incorrecto");
						errorR=true;
					} else {
					
						filaR = Integer.parseInt(Character.toString(posicionR.charAt(0)));
						colR = Integer.parseInt(Character.toString(posicionR.charAt(1)));

						if (filaR >= totFilas || colR >= totColumnas) {// si la fila/columna introducidas son mayores
																		// que el
																		// número de filas/columnas, devolvemos error
							System.out.println("Posicion no existente en la máquina");
							errorR = true;
						}

					}
					if (!errorR) {
						String golosina = golosinas[filaR][colR];
						int cant = 0;

						System.out.println("Introduce la cantidad que vas a añadir (hay " + cantidades[filaR][colR]
								+ " unidades)");
						cant = leer.nextInt();
						if (cantidades[filaR][colR] + cant <= CAPACIDAD_MAX) {
							cantidades[filaR][colR] += cant;
							System.out.println("Se han añadido " + cant + " unidades de " + golosina);
						} else {
							int cuantas = CAPACIDAD_MAX - cantidades[filaR][colR];
							cantidades[filaR][colR] += cuantas;
							System.out.println("La cantidad maxima es de " + CAPACIDAD_MAX + ". Se han añadido "
									+ cuantas + " unidades de " + golosina);
						}
					}

				} else {
					System.out.println("Clave incorrecta");
				}
				break;
			case 4:
				salir = true;
				System.out.println("Se han vendido " + totalVendido + " €");

				break;
			default:
				System.out.println("La opción introducida no es correcta");
				break;
			}
		}

	}

}
