package RepasoNavidades;

import java.util.Arrays;
import java.util.Scanner;

/*Prueba*/
public class Examen_golosinas {
	static double totalVentas=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] golosinas = {
				{"KitKat", "Huesitos","Lacasitos","Palotes"},
				{"Kinder Bueno","Bolsa variada Haribo","Cheetos","Pelotazos"},
				{"Kinder Bueno","M&M'S", "Lays", "Chicles de menta"},
				{"Lacasitos", "Crunch", "Milkybar","Conguitos"},
				{"Chicles de fresa","Lays","Risketos","Pipas baconeras"}
				};
		int[][] cantidad=new int[golosinas.length][golosinas[0].length];
		double[][] precio=new double[golosinas.length][golosinas[0].length];
		cantidadGolosinas(cantidad);
		precioGolosinas(precio);
		int opcion;
		do {
			opcion=menu(sc);
			switch(opcion) {
			case 1:
				pedirGolosina(sc, cantidad, golosinas, precio);
				break;
			case 2:
				mostrarGolosinas(cantidad, golosinas, precio);
				break;
			case 3:
				rellenarGolosinas(sc, posicion(sc, cantidad), cantidad);
				break;
			case 4:
				System.out.printf("El total de ventas ha sido de %.2f", totalVentas );
				break;
			default:
				System.out.println("la opción seleciona no existe.");
			}
		} while(opcion!=4);
	}

	public static int[][] cantidadGolosinas(int[][] cantidad) {
		for(int i=0;i<cantidad.length;i++) {
			Arrays.fill(cantidad[i], 5);
		}
		return cantidad;
	}
	public static double[][] precioGolosinas(double[][] precio){
		for(int i=0;i<precio.length;i++) {
			for(int j=0;j<precio[i].length;j++) {
				if(i%2==0) {
					precio[i][j]=0.85;
				} else {
					precio[i][j]=1.15;
				}
			}
		}
		return precio;
	}
	public static int menu(Scanner sc) {
		System.out.println("Bienvenid@ a Daw Candy 2025. Selecciona una opción:");
		System.out.println("1. Pedir golosina");
		System.out.println("2. Mostrar golosinas");
		System.out.println("3. Rellenar golosinas");
		System.out.println("4. Apagar");
		return sc.nextInt();
	}
	public static void pedirGolosina(Scanner sc, int[][] cantidad, String[][] golosinas, double[][] precio) {
		int[] pos = posicion(sc, cantidad);
		modificarInventario(pos, cantidad, -1);
		System.out.printf("Aqui tienes tu %s. Importe: %.2f€\n", golosinas[pos[0]][pos[1]], precio[pos[0]][pos[1]]);
		totalVentas+=precio[pos[0]][pos[1]];
		System.out.println("*******************************************************");
	}
	public static void mostrarGolosinas(int[][] cantidad, String[][] golosinas, double[][] precio) {
		System.out.println("Golosinas disponibles");
		System.out.println("*******************************************************");
		System.out.printf("%7s %7s %15s", "Código", "Precio", "Cantidad\n");
		System.out.println("*******************************************************");
		for(int i=0;i<cantidad.length;i++) {
			for(int j=0;j<cantidad[i].length;j++) {
				System.out.printf("%3d%d %9.2f %5d disponibles ---> %1s", i,j, precio[i][j], cantidad[i][j], golosinas[i][j]);
				System.out.println();
			}
		}
		System.out.println("*******************************************************");
	}
	public static int[][] modificarInventario(int[] pos, int[][] array, int cantidad) {
			array[pos[0]][pos[1]]+=cantidad;
		return array;
	}
	public static boolean inventarioGolosinas(int fila, int columna, int[][] array) {
		if(array[fila][columna]==0) {
			return true;
		} else {
			return false;
		}
	}
	public static void rellenarGolosinas(Scanner sc, int[] pos, int[][] array) {
		int disponible=array[pos[0]][pos[1]];
		System.out.println("Cuantas golosinas quieres añadir? Tienes " + disponible + " golosinas");
		int cantidad=sc.nextInt();
		int max=5;
		if(disponible==max) {		
			System.out.println("Ya tienes la cantidad máxima, no puedes añadir más");
		} else if(disponible + cantidad <= max) {
			modificarInventario(pos, array, cantidad);
			System.out.println("Se han añadido " + cantidad + " de golosinas");
		} else {
			int cuantas = max - disponible;
			modificarInventario(pos, array, cuantas);
			System.out.println("La cantidad máxima es de " + max + " por lo cual solo se han añadido "  + cuantas);
			
		}
	}
	public static int[] posicion(Scanner sc, int[][] cantidad) {
		int[] pos = new int[2];
		boolean correcto=true;
		String posicion;
		do {
		correcto=true;
		System.out.println("Introduce la posición de la golosina");
		posicion=sc.next();
		if(posicion.length()>2 || posicion.length()<2) {
			System.out.println("Debes introducir dos números enteros");
			correcto=false;
		} else if(!Character.isDigit(posicion.charAt(0)) && !Character.isDigit(posicion.charAt(1))) {
			System.out.println("Formato incorrecto, intentalo de nuevo");
			correcto=false;
		} else {
			pos[0] = Integer.parseInt(Character.toString(posicion.charAt(0)));
			pos[1] = Integer.parseInt(Character.toString(posicion.charAt(1)));
			
			if((pos[0]<0 || pos[0]>=cantidad.length) || (pos[1]<0 || pos[1]>=cantidad[0].length)) {
				System.out.println("La posición introducida no es correcta");
				correcto=false;
			} else if(inventarioGolosinas(pos[0], pos[1], cantidad)) {
				System.out.println("Ya no quedan");
			}
		}
		} while(!correcto);
		
		return pos;
	}

}
