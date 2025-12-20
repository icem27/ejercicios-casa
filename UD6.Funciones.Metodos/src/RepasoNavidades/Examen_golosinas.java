package RepasoNavidades;

import java.util.Arrays;
import java.util.Scanner;


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
		//Inicializamos la cantidad del stock para las golosinas y su precio
		for(int i=0;i<cantidad.length;i++) {
			Arrays.fill(cantidad[i], 5);
			for(int j=0;j<precio[i].length;j++) {
				precio[i][j] = (j % 2 == 0) ? 0.85 : 1.15;
			}
		}
		
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
				rellenarGolosinas(sc, cantidad, golosinas);
				break;
			case 4:
				System.out.printf("El total de ventas ha sido de %.2f€", totalVentas );
				break;
			default:
				System.out.println("La opción introducida no es correcta.");
			}
		} while(opcion!=4);
		sc.close();
	}
	
	public static int menu(Scanner sc) {
		System.out.println("Bienvenid@ a Daw Candy 2025. Selecciona una opción:");
		System.out.println("1. Pedir golosina");
		System.out.println("2. Mostrar golosinas");
		System.out.println("3. Rellenar golosinas");
		System.out.println("4. Apagar");
		return sc.nextInt();
	}
	//Solicitud de la golosina
	public static void pedirGolosina(Scanner sc, int[][] cantidad, String[][] golosinas, double[][] precio) {
		int[] pos = posicionGolosina(sc, cantidad, golosinas);
		cantidad[pos[0]][pos[1]]--;
		System.out.printf("Aqui tienes tu %s. Importe: %.2f€\n", golosinas[pos[0]][pos[1]], precio[pos[0]][pos[1]]);
		totalVentas+=precio[pos[0]][pos[1]];
		System.out.println("*******************************************************");
	}
	//Desplegable para mostrar las golosinas con su precio y cantidad
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
	//Verificación de stock
	public static boolean sinStock(int fila, int columna, int[][] cantidad) {
		return cantidad[fila][columna]==0;
	}
	//Para hacerlo mas eficiente, se crea una función para validar la posición y asi no hace falta duplicar el codigo cada vez que se pida la posición
	public static int[] posicionGolosina(Scanner sc, int[][] cantidad, String[][] golosinas) {
		int[] pos = new int[2];
		boolean correcto;
		String posicion;
		do {
		correcto=true;
		System.out.println("Introduce la posición de la golosina");
		posicion=sc.next();
		if(posicion.length() !=2 || !Character.isDigit(posicion.charAt(0)) || !Character.isDigit(posicion.charAt(1))) {
			System.out.println("Formato incorrecto, solo se admiten 2 digitos enteros");
			correcto=false;
		} else {
			pos[0] = Character.getNumericValue(posicion.charAt(0));
			pos[1] = Character.getNumericValue(posicion.charAt(1));
			
			if((pos[0]<0 || pos[0]>=cantidad.length) || (pos[1]<0 || pos[1]>=cantidad[0].length)) {
				System.out.println("La posición introducida no es correcta");
				correcto=false;
			} else if(sinStock(pos[0], pos[1], cantidad)) {
				System.out.println("Ya no quedan " + golosinas[pos[0]][pos[1]] + " elige otras.");
				correcto=false;
			}
		}
		} while(!correcto);
		
		return pos;
	}
	//Punto 3. Rellenar el stock de las golosinas
	public static void rellenarGolosinas(Scanner sc, int[][] cantidadGolosinas, String[][] golosinas) {
		System.out.print("Introduce la clave: ");
		String clave=sc.next();
		String contra="1DAWCHUCHE2025";
		if(!contra.equals(clave)) {
			System.out.println("La clave introducida no es correcta. Intentelo de nuevo.");
			return;
		} 
		
		int[] pos = posicionGolosina(sc, cantidadGolosinas, golosinas);
		int disponible=cantidadGolosinas[pos[0]][pos[1]];
		System.out.println("Cuantas golosinas quieres añadir? Tienes " + disponible + " golosinas");
		int cantidad=sc.nextInt();
		int max=5;
		if(disponible==max) {		
			System.out.println("Ya tienes la cantidad máxima, no puedes añadir más");
		} else if(disponible + cantidad <= max) {
			cantidadGolosinas[pos[0]][pos[1]]+=cantidad;
			System.out.println("Se han añadido " + cantidad + " de " + golosinas[pos[0]][pos[1]]);
		} else {
			int resto = max - disponible;
			cantidadGolosinas[pos[0]][pos[1]]+=resto;
			System.out.println("La cantidad máxima es de " + max + " por lo cual solo se han añadido "  + resto + " de " + golosinas[pos[0]][pos[1]]);
		}
	}

}
