package RepasoNavidadSolcProfe;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7_SacoRegalos {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿A cuántas casas hay que ir?");
		int numCasas = leer.nextInt();
		String[][] regalos = llenarSaco(numCasas);
//		System.out.println(Arrays.deepToString(regalos));
		boolean continuar = true;
		while (continuar) {

			int opcion = menu();
			leer.nextLine();
			switch (opcion) {
			case 1:
				int tot = totalRegalos(regalos);
				System.out.println("Se han cargado " + tot + " regalos para " + numCasas + " casas");
				
				break;
			case 2:
				mostrarRegalos(regalos);
				
				break;
			case 3:
				int casa = casaVIP(regalos);
				System.out.println("La casa con más regalos es la casa " + casa);
				
				break;
			case 4:
				continuar = false;
				break;
			}
		}
		System.out.println("Feliz noche");
		leer.close();

	}

	public static String[][] llenarSaco(int numCasas) {
		String[][] regalos = new String[numCasas][];

		for (int i = 0; i < numCasas; i++) {
			System.out.println("Cuántos regalos hay para la casa " + (i + 1));
			int numRegalos = leer.nextInt();
			leer.nextLine();
			regalos[i] = new String[numRegalos];
			for (int j = 0; j < numRegalos; j++) {
				System.out.println("Introduce el regalo " + (j + 1));
				regalos[i][j] = leer.nextLine();
			}
		}
		return regalos;
	}

	public static int menu() {

		System.out.println(
				"El saco ya está listo, ¿qué quieres hacer?\n1. Ver el total de regalos\n2. Mostrar todos los regalos\n3. ¿Qué casa tendrá más regalos?\n4. Salir a repartir los regalos");
		return leer.nextInt();
	}

	public static int totalRegalos(String[][] regalos) {
		int total = 0;
		for (int i = 0; i < regalos.length; i++) {
			total += regalos[i].length;
		}
		return total;
	}

	public static void mostrarRegalos(String[][] regalos) {
		for (int i = 0; i < regalos.length; i++) {
			System.out.println("Regalos de la casa " + (i + 1));
			System.out.println("===================");
			for (int j = 0; j < regalos[i].length; j++) {
				System.out.println((j + 1) + " " + regalos[i][j]);
			}
			System.out.println("===================");
		}
	}

	public static int casaVIP(String[][] regalos) {

		int max = 0;
		int casa = 0;
		for (int i = 0; i < regalos.length; i++) {
			int numRegalos = regalos[i].length;
			if (max < numRegalos) {
				max = numRegalos;
				casa = i + 1;
			}
		}
		return casa;
	}

}
