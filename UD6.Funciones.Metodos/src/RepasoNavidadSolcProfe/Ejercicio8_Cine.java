package RepasoNavidadSolcProfe;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8_Cine {

	static Scanner leer = new Scanner(System.in);
	static double totalReservados = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] sala = { { false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ true, false, false, false, true, true, false, false, false },
				{ false, false, false, false, false, false, true, true, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false } };

		double[][] preciosAsientos = new double[sala.length][sala[0].length];
		inicializarPrecios(preciosAsientos, 9, 12.5);
//		System.out.println(Arrays.deepToString(preciosAsientos));
		mostrarMenu(sala, preciosAsientos);
	}

	public static void inicializarPrecios(double[][] preciosAsientos, double precioMin, double precioMax) {
		for (int i = 0; i < preciosAsientos.length; i++) {
			preciosAsientos[i][0] = precioMax;
			preciosAsientos[i][preciosAsientos[i].length - 1] = precioMax;
			for (int j = 1; j < preciosAsientos[i].length - 1; j++) {
				preciosAsientos[i][j] = precioMin;
			}
		}
	}

	public static void mostrarMenu(boolean[][] sala, double[][] precioAsientos) {
		boolean salir = false;
		while (!salir) {
			System.out.println("\n*********************************************************");
			System.out.println("Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:");
			System.out.println("M. Mostrar asientos");
			System.out.println("R. Reservar entrada");
			System.out.println("D. Cancelar reserva");
			System.out.println("C. Contar asientos");
			System.out.println("S. Salir");
			System.out.println("*********************************************************");
			String opcion = leer.next().toUpperCase();

			switch (opcion) {
			case "M":
				mostrarAsientos(sala, precioAsientos);
				break;
			case "R":
				reservarAsiento(sala, precioAsientos);
				break;
			case "D":
				cancelarReserva(sala, precioAsientos);
				break;
			case "C":
				contarAsientos(sala);
				break;
			case "S":
				salir=true;
				System.out.println("Se han recaudado "+totalReservados+ "€");
				contarAsientos(sala);
				break;
				default:
					System.out.println("La opción introducida no es correcta");
					break;
			}
		}
	}

	private static void contarAsientos(boolean[][] sala) {
		int contLibres=0;
		int contOcupados=0;
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[i].length;j++) {
				if(sala[i][j]==true) {
					contOcupados++;
				}
				else {
					contLibres++;
				}
			}
		}
		System.out.println("Hay un total de "+contOcupados+" asientos ocupados y "+contLibres+" asientos libres");
	}

	/*
	 * La función pedirPosicionAsiento() se encarga de solicitar al usuario el
	 * código del asiento y devuelve la fila y columna a las que corresponde ese
	 * código. Si el código introducido no es válido se devolverá un valor nulo
	 * (null)
	 */
	public static int[] pedirPosicionAsiento(int totFilas, int totCols) {
		int[] asiento = null; // array en el que guardaremos la fila y columna a la que corresponde el código
								// del asiento introducido. Lo inicializamos a null para detectar cuándo el
								// código no es válido
		System.out.println("Introduce el código del asiento");
		String codigo = leer.next();
		if (codigo.length() != 3) {// como el código debe tener 3 caracteres, vamos a comprobar el tamaño del
									// código introducido
			System.out.println("El código introducido no es válido");
		} else if (!Character.isDigit(codigo.charAt(1)) || !Character.isDigit(codigo.charAt(2)))// comprobamos que cada
																								// uno de los caracteres
																								// (posición 1 y 2, la
																								// posición 0 es la
																								// letra C)
																								// es un número y si no
																								// mostramos error
		{
			System.out.println("Dato con formato incorrecto");
		} else {// si todo va bien, ya indicamos el tamaño del array y le damos valores
			asiento = new int[2];
			asiento[0] = Integer.parseInt(Character.toString(codigo.charAt(1)));
			asiento[1] = Integer.parseInt(Character.toString(codigo.charAt(2)));

			if (asiento[0] > totFilas || asiento[1] > totCols) {// si la fila/columna introducidas son mayores que el
																// número de filas/columnas, devolvemos error
				System.out.println("Posicion no existente en la sala");
				asiento = null;
			}

		}

		return asiento;
	}

	public static void cancelarReserva(boolean[][] sala,double[][] precio) {
		
		System.out.println("Introduce la clave: ");
		String pass=leer.next();
		if(pass.equals("Polis1DAWM")){
		int[] asiento = pedirPosicionAsiento(sala.length, sala[0].length);
		if (asiento != null) {
			int fila = asiento[0];
			int col = asiento[1];
			if (sala[fila][col] == true) {
				sala[fila][col] = false;
				
				System.out.println("Reserva cancelada: -"+precio[fila][col]+"€");
			} else {
				System.out.println("Ese asiento no está reservado");
			}
		}
		}
		else {
			System.out.println("La clave no es correcta");
		}
	}

//El método reservarAsiento se encarga de llamar al método pedirPosicionAsiento, si éste le devuelve el array con la posición, la marcaremos como ocupada
	public static void reservarAsiento(boolean[][] sala, double[][] precio) {

		int[] asiento = pedirPosicionAsiento(sala.length, sala[0].length);
		if (asiento != null) {
			int fila = asiento[0];
			int col = asiento[1];
			if (sala[fila][col] == false) {
				sala[fila][col] = true;
				totalReservados+=precio[fila][col];
				System.out.println("Reserva realizada por "+precio[fila][col]+" €");

			} else {
				System.out.println("El asiento ya está ocupado");
			}
		}
	}

	/*
	 * El método mostrarAsientos() recibe el array con los estados de los asientos y
	 * el precio de cada uno de ellos, para mostrar el código, estado y precio de
	 * cada asiento
	 */
	public static void mostrarAsientos(boolean[][] sala, double[][] precioAsientos) {
		System.out.printf("%10s%10s%10s\n", "Código", "Estado", "Precio");
		System.out.println(" ______________________________");
		for (int i = 0; i < sala.length; i++) {

			for (int j = 0; j < sala[i].length; j++) {

				System.out.printf("%8s %10s %10.2f €\n", "S" + i + j, devolverEstado(sala[i][j]), precioAsientos[i][j]);
			}

		}

	}

	/*
	 * El método devolverEstado() recibe el estado del asiento (true/false) y
	 * devuelve la cadena Ocupado o Libre
	 */
	public static String devolverEstado(boolean estado) {
		if (estado) {
			return "Ocupado";
		} else {
			return "Libre";
		}
	}

}
