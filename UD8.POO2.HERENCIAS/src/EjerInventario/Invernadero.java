package EjerInventario;

import java.util.Scanner;

public class Invernadero {

	static Scanner leer = new Scanner(System.in);
	static final int MAX_PLANTAS = 18;
	static Planta[] plantas = new Planta[MAX_PLANTAS];
	static int semana = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		plantas[0] = new Tomate(TipoTomate.CHERRY);
		plantas[1] = new Tomate(TipoTomate.CHERRY);
		plantas[2] = new Tomate(TipoTomate.PERA);
		plantas[3] = new Tomate(TipoTomate.KUMATO);
		plantas[4] = new Tomate(TipoTomate.PERA);
		plantas[5] = new Lechuga(TipoLechuga.ICEBERG);
		plantas[6] = new Lechuga(TipoLechuga.ICEBERG);
		plantas[7] = new Lechuga(TipoLechuga.RIZADA);
		plantas[8] = new Lechuga(TipoLechuga.ROMANA);
		plantas[9] = new Lechuga(TipoLechuga.ROMANA);
		plantas[10] = new Lechuga(TipoLechuga.ROMANA);

		mostrarMenu();
	}

	public static void mostrarMenu() {
		int opcion = 0;
		/*
		 * 1.- Cosechar planta 2.- Plantación de nueva planta 3.- Informe del
		 * invernadero 4.- Avanzar 1 semana 5.- Salir
		 */

		while (opcion != 5) {
			System.out.println("==========================================");
			System.out.println("MENÚ PRINCIPAL – SEMANA " + semana);
			System.out.println("==========================================");
			System.out.println("1.- Cosechar planta");
			System.out.println("2.- Nueva planta");
			System.out.println("3.- Informe del invernadero");
			System.out.println("4.- Avanzar 1 semana");
			System.out.println("5.- Salir");
			System.out.println("==========================================");
			opcion = leer.nextInt();
			switch (opcion) {
			case 1:
				cosecharPlanta();
				break;
			case 2:
				nuevaPlanta();
				break;
			case 3:
				mostrarInforme();
				break;
			case 4:
				avanzarSemana();
				break;
			case 5:
				break;
			default:
				System.out.println("La opción introducida no es correcta");
				break;
			}
		}
	}

	private static void mostrarInforme() {
		// TODO Auto-generated method stub
		System.out.println("¿Qué informe quieres ver: Tomates(1), Lechugas(2), Todas las plantas (cualquier otra tecla)");
		int opcion = leer.nextInt();
		mostrarInforme(opcion);

	}

	private static void mostrarInforme(int opcion) {
		String nombre = "";
		for (int i = 0; i < plantas.length; i++) {
			if (plantas[i] != null) {
				if (plantas[i] instanceof Lechuga) {
					nombre = "Lechuga";
					if (opcion != 1) {
						System.out.println((i + 1) + ".-" + nombre + " " + plantas[i].mostrarPlanta());
					}
				} else {
					nombre = "Tomate";
					if (opcion != 2) {
						System.out.println((i + 1) + ".-" + nombre + " " + plantas[i].mostrarPlanta());
					}
				}
			}
		}
		System.out.println("-----------------------------------------------------------------------------");

	}

	private static void avanzarSemana() {
		// TODO Auto-generated method stub
		semana++;
		for (Planta p : plantas) {
			if (p != null) {
				p.envejecer();
			}
		}

	}

	private static void nuevaPlanta() {
		// TODO Auto-generated method stub
		int opcion;
		do {
			System.out.println("Qué vas a plantar?Tomate(1) o Lechuga(2)");
			opcion = leer.nextInt();
		} while (opcion != 1 && opcion != 2);
		if (opcion == 1)// tomate
		{
			plantarTomate();
		} else {
			plantarLechuga();
		}
	}

	private static void plantarLechuga() {
		// TODO Auto-generated method stub
		int vacio = 0;
		if (Lechuga.getTotalLechugas() < Lechuga.MAX_LECHUGAS) {
			while (plantas[vacio] != null && plantas[vacio].isPlantada()) {
				vacio++;
			}
		}
		TipoLechuga tipo = TipoLechuga.ICEBERG;
		int t;
		do {
			System.out.println("Qué tipo de lechuga vas a plantar?ROMANA(1), ICEBERG(2), RIZADA(3)");
			t = leer.nextInt();
		} while (t <= 0 || t > 3);
		tipo = TipoLechuga.values()[t - 1];
		plantas[vacio] = new Lechuga(tipo);
	}

	private static void plantarTomate() {
		// TODO Auto-generated method stub
		int vacio = 0;
		if (Tomate.getTotalTamates() < Tomate.MAX_TOMATES) {
			while (plantas[vacio] != null && plantas[vacio].isPlantada()) {
				vacio++;
			}
		}
		TipoTomate tipo = TipoTomate.CHERRY;
		int t;
		do {
			System.out.println("Qué tipo de tomate vas a plantar?CHERRY(1), PERA(2), KUMATO(3)");
			t = leer.nextInt();
		} while (t <= 0 || t > 3);
		tipo = TipoTomate.values()[t - 1];
		plantas[vacio] = new Tomate(tipo);
	}

	private static void cosecharPlanta() {
		// TODO Auto-generated method stub
		int posicion;
		mostrarInforme(3);
		do {
			System.out.println("Introduce la posición del producto que vas a cosechar:");
			posicion = leer.nextInt();
		} while (posicion < 0 && posicion > plantas.length);
		plantas[posicion - 1].cosechar();
	}

}
