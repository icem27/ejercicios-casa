package RepasoNavidades;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8_Cine {

	static Scanner leer = new Scanner(System.in);
	static double totalReservados = 0;

	public static void main(String[] args) {
		boolean[][] sala = { { false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ true, false, false, false, true, true, false, false, false },
				{ false, false, false, false, false, false, true, true, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false } };

		double[][] preciosAsientos = new double[sala.length][sala[0].length];
		double recaudado=0;
		inicializarPrecios(preciosAsientos, 9, 12.5);

		mostrarMenu(recaudado, sala, preciosAsientos);
	}

	public static void inicializarPrecios(double[][] preciosAsientos, double precioMin, double precioMax) {
		//En este método se debe cargar el precio de los asientos en función de su ubicación
		for(int i=0;i<preciosAsientos.length;i++) {
			for(int j=0;j<preciosAsientos[i].length;j++) {
				if((i%1==0 && j==0) || j%8==0) {
					preciosAsientos[i][j]=precioMax;
				} else {
					preciosAsientos[i][j]=precioMin;
				}
			}
		}
	}

	public static void mostrarMenu(double recaudado, boolean[][] sala, double[][] precioAsientos) {
		//Se muestra el menú y en función de la opción elegida 
		//se llama a las funciones que realizan la acción
		System.out.println("*********************************************************\n");
		Scanner sc = new Scanner(System.in);
		char letra;
		do {
		System.out.println("Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:");
		System.out.println("M. Mostrar asientos");
		System.out.println("R. Reservar entrada");
		System.out.println("D. Cancelar reserva");
		System.out.println("C. Contar asientos");
		System.out.println("S. Salir");
		String entrada = sc.nextLine();
		letra = Character.toUpperCase(entrada.charAt(0));
		switch(letra) {
		case 'M': 
			mostrarAsientos(sala, precioAsientos);
			break;
		case 'R': 
			reservarAsiento(sala, precioAsientos);
			break;
		case 'D': 
			cancelarReserva(sala, precioAsientos);
			break;
		case 'C': 
			contarAsientos(sala);
			break;
		case 'S': 
			recaudacion(recaudado, sala, precioAsientos);
			break;
		default:
			System.out.println("Opción incorrecta");
		}
		} while(letra!='S');
	}

	private static void contarAsientos(boolean[][] sala) {
		System.out.println("*********************************************************\n");
		int contLibres=0;
		int contOcupados=0;
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[i].length;j++) {
				if(!sala[i][j]) {
					contLibres++;
				} else {
					contOcupados++;
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
				System.out.println("Posicion no existente en la maquina");
				asiento = null;
			}

		}

		return asiento;
	}

	public static void cancelarReserva(boolean[][] sala,double[][] precio) {
		Scanner sc = new Scanner(System.in);
		String contra="Polis1DAWM";
		System.out.println("Introduce la clave: ");
		String clave=sc.nextLine();
		boolean claveCorrecta=false;
		if(clave.equals(contra)) {
			claveCorrecta=true;
		}
		while(claveCorrecta) {
			int[] fila = pedirPosicionAsiento(8, 8);
			int columna = fila[0];
			int fil = fila[1];
			sala[columna][fil]=false;
			System.out.println("Reserva cancelada: " + "-"+precio[columna][fil]+"€");
			claveCorrecta=false;
			return;
		}
		System.out.println("La clave introducida no es correcta");
		//Se pedirá al usuario la contraseña, si es correcta se le pedirá la posición del asiento para liberarlo
	}

//El método reservarAsiento se encarga de llamar al método pedirPosicionAsiento, si éste le devuelve el array con la posición, la marcaremos como ocupada
	public static void reservarAsiento(boolean[][] sala, double[][] precio) {
		System.out.println("*********************************************************\n");
		int[] fila = pedirPosicionAsiento(8, 8);
		int columna = fila[0];
		int fil = fila[1];
		sala[columna][fil]=true;
		System.out.println("Reserva realizada por " + precio[columna][fil] + "€");
	}

	/*
	 * El método mostrarAsientos() recibe el array con los estados de los asientos y
	 * el precio de cada uno de ellos, para mostrar el código, estado y precio de
	 * cada asiento
	 */
	public static void mostrarAsientos(boolean[][] sala, double[][] precioAsientos) {

		System.out.println("Codigo Estado Precio");
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[i].length;j++) {
				String plaza = (sala[i][j]) ? "Ocupado":"Libre";
				System.out.printf("%5s [%s] %.2f€","S"+i+j ,plaza, precioAsientos[i][j]);
				System.out.println();
			}
		}

		System.out.println("*********************************************************\n");
	}

	/*
	 * El método devolverEstado() recibe el estado del asiento (true/false) y
	 * devuelve la cadena Ocupado o Libre
	 */
	public static String devolverEstado(boolean estado) {
		String cadenaEstado="";
		//tenéis que rellenar
		return cadenaEstado;
	}
	
	public static void recaudacion(double recaudado, boolean[][] sala, double[][] precioAsientos) {
		
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[i].length;j++) {
				if(sala[i][j]) {
					recaudado+=precioAsientos[i][j];
				}
			}
		}
		
		System.out.println("Se ha recaudado un total de " + recaudado);
		contarAsientos(sala);
		
	}

}
