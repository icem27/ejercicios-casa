package RepasoNavidades;

import java.util.Scanner;

public class Ejercicio_8 {
	static final int MAX_FILAS = 8;
	static final int MAX_ASIENTOS = 9;
	static double ventaTotal=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[][] sala = { { false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ true, false, false, true, true, false, false, false, false },
				{ false, false, false, false, false, true, true, false, false },
				{ false, false, false, false, false, false, false, false, false },
				{ false, false, false, false, false, false, false, false, false } };
		double[][] precio_entradas = preciosEntradas(9, 12.5);
		
		char opcion;
		do {
			opcion=menu(sc);
			switch(opcion) {
			case 'M':
				System.out.printf("%5s %5s %5s\n", "Código", "Estado", "Precio");
				System.out.println("----------------------");
				for (int i = 0; i < precio_entradas.length; i++) {
					for(int j=0;j<precio_entradas[i].length;j++) {
						System.out.printf("%4s %7s %6.2f€", "S"+i+j, estadoEntradas(sala, i, j), precio_entradas[i][j] );
						System.out.println();
					}
				}
				break;
			case 'R':
				reserva_asiento(sc, sala, precio_entradas);
				break;
			case 'D':
				cancelarReserva(sc, sala, precio_entradas);
				break;
			case 'C':
				contarAsientos(sala);
				break;
			case 'S':
				System.out.println("La venta total ha sido de " + ventaTotal + "€");
				break;
			default:
				System.out.println("La opción seleciona es errorea");
			}
		}while(opcion!='S');

	}

	public static double[][] preciosEntradas(double precioMin, double precioMax) {
		double[][] precio = new double[MAX_FILAS][MAX_ASIENTOS];
		for (int fila = 0; fila < precio.length; fila++) {
			for (int asiento = 0; asiento < precio[fila].length; asiento++) {
				precio[fila][asiento] = (asiento == 0 || asiento == 8) ? precioMax : precioMin;
			}
		}
		return precio;
	}
	public static String estadoEntradas(boolean[][] entradas, int fila, int asiento) {
		return entradas[fila][asiento] ? "Ocupado":"Libre";
	}
	
	public static char menu(Scanner sc) {
		System.out.println("*********************************************************");
		System.out.println("Bienvenid@ al sistema de reservas de Cinépolis DAWM. Selecciona una opción:\n");
		System.out.println("M. Mostrar asientos");
		System.out.println("R. Reservar entrada");
		System.out.println("D. Cancelar reserva");
		System.out.println("C. Contar asientos");
		System.out.println("S. Salir");
		System.out.println("*********************************************************");
		return sc.next().toUpperCase().charAt(0);
	}
	
	public static int[] busca_asiento(Scanner sc, boolean[][] entradas) {
		boolean correcto;
		int[] pos = new int[2];
		int fila;
		int asiento;
		do {
			correcto = true;
			System.out.println("Introduce el código del asiento:");
			String reserva = sc.next().toUpperCase();
			if (reserva.length() != 3 || reserva.charAt(0)!='S'
					|| !(Character.isDigit(reserva.charAt(1)) && Character.isDigit(reserva.charAt(2)))) {
				System.out.println("El formato introducido no es correcto");
				correcto = false;
			} else {
				fila = Character.getNumericValue(reserva.charAt(1));
				asiento = Character.getNumericValue(reserva.charAt(2));
				if ((fila < 0 || fila >= entradas.length) || (asiento < 0 || asiento >= entradas[0].length)) {
					System.out.println("El asiento que estas intentando reservar no existe");
					correcto = false;
				} 
				pos[0] = fila;
				pos[1] = asiento;
			}
		} while (!correcto);
		return pos;

	}
	public static void reserva_asiento(Scanner sc, boolean[][] entradas, double[][] precio) {
		int[] pos=busca_asiento(sc, entradas);
		if (estadoEntradas(entradas, pos[0], pos[1]).equals("Ocupado")) {
			System.out.println("El asiento S" + pos[0] + pos[1] + " ya esta ocupado, por favor, selecione otra butaca\n");
			return;
		}
		System.out.printf("Reserva realizada por %.2f€\n", precio[pos[0]][pos[1]]);
		entradas[pos[0]][pos[1]]=true;
		ventaTotal+=precio[pos[0]][pos[1]];
	}
	public static void contarAsientos(boolean[][] sala) {
		int libre=0;
		int ocupado=0;
		for(int i=0;i<sala.length;i++) {
			for(int j=0;j<sala[i].length;j++) {
				if(sala[i][j]) ocupado++;
				else libre++;
			
			}
		}
		System.out.println("Hay un total de "+ocupado+" asientos ocupados y " + libre +  " asientos libres");
	}
	public static void cancelarReserva(Scanner sc, boolean[][] entradas, double[][] precio){
		String clave_acceso="Polis1DAWM";
		System.out.print("Introduce la clave: ");
		String clave=sc.next();
		if(!clave.equals(clave_acceso)) {
			System.out.println("La clave introducida no es correcta.");
			return;
		}
		int[] pos=busca_asiento(sc, entradas);
		String estado = estadoEntradas(entradas, pos[0], pos[1]);
		if(estado.equals("Ocupado")) {
			System.out.printf("Reserva cancelada: -%.2f€\n", precio[pos[0]][pos[1]]);
			entradas[pos[0]][pos[1]]=false;
		} else {
			System.out.println("El asiento que intenta liberar ya se encuentra liberado");
		}
	}

}
