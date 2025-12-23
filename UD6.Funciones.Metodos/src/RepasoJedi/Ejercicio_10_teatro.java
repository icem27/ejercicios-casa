package RepasoJedi;
import java.util.Scanner;

public class Ejercicio_10_teatro {
	static final int MAX_SALAS=2;
	static final int MAX_FILAS = 6;
	static final int MAX_ASIENTOS = 8;
	static double totalVenta=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][][] teatro = new boolean[MAX_SALAS][MAX_FILAS][MAX_ASIENTOS];
		double precio[][] = inicializarPrecios(15, 12, 9, 2);
		
		char opcion;
		do {
			opcion=menu(sc);
			switch(opcion) {
			case 'M':
				mostrarTeatro(teatro, precio);
//				mostrarTeatro(teatro);
				break;
			case 'R':
				reservar_asiento(sc, teatro, precio);
				break;
			case 'D':
				cancelarReserva(sc, teatro);
				break;
			case 'C':
				contarAsientos(teatro);
				break;
			case 'I':
				informeOcupacion(teatro);
				break;
			case 'S':
				System.out.println("El total recaudado ha sido de " + totalVenta + "€");
				break;
			default:
				System.out.println("La opción seleciona es errorea");
			}
		}while(opcion!='S');
		sc.close();

	}
	public static char menu(Scanner sc) {
		System.out.println("*********************************************************");
		System.out.println("Bienvenid@ al sistema de reservas del Teatro DAW. Selecciona una opción:\n");
		System.out.println("M. Mostrar estado del teatro");
		System.out.println("R. Reservar asiento");
		System.out.println("D. Cancelar reserva");
		System.out.println("C. Contar asientos");
		System.out.println("I. Informe de ocupación");
		System.out.println("S. Salir");
		System.out.println("*********************************************************");
		return sc.next().toUpperCase().charAt(0);
	}
	
//	public static void mostrarTeatro(boolean[][][] teatro) {
//
//	    for (int s = 0; s < MAX_SALAS; s++) {
//	        System.out.println("\nSala " + s);
//
//	        // Cabecera columnas
//	        System.out.print("    ");
//	        for (int a = 0; a < MAX_ASIENTOS; a++) {
//	            System.out.print(a + "   ");
//	        }
//	        System.out.println();
//
//	        // Filas
//	        for (int f = 0; f < MAX_FILAS; f++) {
//	            System.out.print("F" + f + "  ");
//
//	            for (int a = 0; a < MAX_ASIENTOS; a++) {
//	                if (teatro[s][f][a])
//	                    System.out.print("O   ");
//	                else
//	                    System.out.print("L   ");
//	            }
//	            System.out.println();
//	        }
//	    }
//	}
	
	public static void mostrarTeatro(boolean[][][] teatro, double[][] precio) {
		System.out.printf("%10s%10s%10s\n","Código", "Estado","Precio" );
		for(int sala=0;sala<teatro.length;sala++) {
			for(int fila=0;fila<teatro[sala].length;fila++) {
				for(int asiento=0;asiento<teatro[sala][fila].length;asiento++) {
					String estado = teatro[sala][fila][asiento] ? "Ocupado":"Libre";
					System.out.printf("%9s%10s%10.2f€","T"+sala+fila+asiento ,estado,precio[fila][asiento]);
					System.out.println();
				}
				System.out.println();
			}
		}
	}
	
	public static double[][] inicializarPrecios(double vip, double pref, double general, double suplemento) {
		double[][] precios = new double[MAX_FILAS][MAX_ASIENTOS];
		for(int fila=0;fila<precios.length;fila++) {
			for(int asiento=0;asiento<precios[fila].length;asiento++) {
				switch(fila) {
				case 0,1:
					precios[fila][asiento]=vip;
				break;
				case 2, 3:
					precios[fila][asiento]=pref;
				break;
				case 4, 5:
					precios[fila][asiento]=general;
				}
				if(asiento==0 || asiento==MAX_ASIENTOS-1) {
					precios[fila][asiento]+=suplemento;
				}
			}
		}
		return precios;
	}
	
	public static int[] busca_asiento(Scanner sc) {
		boolean correcto;
		int[] pos = new int[3];
		int sala;
		int fila;
		int asiento;
		do {
			correcto = true;
			System.out.println("Introduce el código del asiento:");
			String reserva = sc.next().toUpperCase();
			if (reserva.length() != 4 || reserva.charAt(0) != 'T'
					|| !(Character.isDigit(reserva.charAt(1)) && Character.isDigit(reserva.charAt(2)) && Character.isDigit(reserva.charAt(3)))) {
				System.out.println("El formato introducido no es correcto");
				correcto = false;
			} else {
				sala = Character.getNumericValue(reserva.charAt(1));
				fila = Character.getNumericValue(reserva.charAt(2));
				asiento = Character.getNumericValue(reserva.charAt(3));
				if ((sala < 0 || sala >= MAX_SALAS) || (fila < 0 || fila >= MAX_FILAS) || (asiento < 0 || asiento >= MAX_ASIENTOS)) {
					System.out.println("El asiento que estas intentando reservar no existe");
					correcto = false;
				}
				pos[0] = sala;
				pos[1] = fila;
				pos[2] = asiento;
			}
		} while (!correcto);
		return pos;
	}
	
	public static void reservar_asiento(Scanner sc, boolean[][][] entradas, double[][] precios) {
		int[] pos = busca_asiento(sc);
		if (entradas[pos[0]][pos[1]][pos[2]]) {
			System.out.println("El asiento T" + pos[0] + pos[1] + pos[2] + " ya esta ocupado, por favor, selecione otra butaca\n");
			return;
		}
		System.out.printf("Reserva realizada por %.2f€\n", precios[pos[1]][pos[2]]);
		entradas[pos[0]][pos[1]][pos[2]]=true;
		totalVenta+=precios[pos[1]][pos[2]];
		
	}
	
	public static void cancelarReserva(Scanner sc, boolean[][][] entradas){
		String clave_acceso="TEATRO2025";
		System.out.print("Introduce la clave: ");
		String clave=sc.next();
		if(!clave.equals(clave_acceso)) {
			System.out.println("La clave introducida no es correcta.");
			return;
		}
		int[] pos=busca_asiento(sc);
		if(entradas[pos[0]][pos[1]][pos[2]]) {
			System.out.println("Reserva cancelada correctamente");
			entradas[pos[0]][pos[1]][pos[2]]=false;
		} else {
			System.out.println("El asiento que intenta liberar ya se encuentra liberado");
		}
	}
	
	public static void contarAsientos(boolean[][][] teatro) {
		int libre=0;
		int ocupado=0;
		for(int i=0;i<teatro.length;i++) {
			for(int j=0;j<teatro[i].length;j++) {
				for(int x=0;x<teatro[i][j].length;x++) {
					if(teatro[i][j][x]) ocupado++;
					else libre++;
				}
			}
		}
		System.out.println("Hay un total de "+ocupado+" asientos ocupados y " + libre +  " asientos libres");
	}
	
	public static void informeOcupacion(boolean[][][] teatro) {
		int[] ocupadosSala = new int[MAX_SALAS];
        int vip = 0, pref = 0, general = 0;

        for (int s = 0; s < MAX_SALAS; s++) {
            for (int f = 0; f < MAX_FILAS; f++) {
                for (int a = 0; a < MAX_ASIENTOS; a++) {

                    if (teatro[s][f][a]) {
                        ocupadosSala[s]++;

                        if (f <= 1) vip++;
                        else if (f <= 3) pref++;
                        else general++;
                    }
                }
            }
        }

        int totalSala = MAX_FILAS * MAX_ASIENTOS;

        for (int s = 0; s < MAX_SALAS; s++) {
            double porcentaje = ocupadosSala[s] * 100.0 / totalSala;
            System.out.printf("Sala %d: %.2f%% ocupación\n", s, porcentaje);
        }

        int salaMasLlena = ocupadosSala[0] >= ocupadosSala[1] ? 0 : 1;
        System.out.println("Sala más llena: " + salaMasLlena);

        String zona;
        if (vip >= pref && vip >= general) zona = "VIP";
        else if (pref >= general) zona = "Preferente";
        else zona = "General";

        System.out.println("Zona más reservada: " + zona);
	}
	
}
