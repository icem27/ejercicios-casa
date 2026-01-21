package Ejercicios;

import java.util.Scanner;

public class Zona_principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Zona sala_principal = new Zona(1000);
		Zona sala_compra_venta = new Zona(200);
		Zona sala_vip = new Zona(25);
		int opcion;
		do {
			opcion=menu(sc);
			switch(opcion) {
			case 1:
				mostrar_disponibilidad(sala_principal, sala_compra_venta, sala_vip);
				break;
			case 2:
				opcion = zonas(sc);
				System.out.println("¿Cuantas entradas deseas comprar?");
				int entradas = sc.nextInt();
				switch (opcion) {
				case 1:
					sala_principal.vender(entradas);
					break;
				case 2:
					sala_compra_venta.vender(entradas);
				case 3:
					sala_vip.vender(entradas);
				default:
					System.out.println("Opción elegida no valida");
				}
				break;
			case 3: 
				System.out.println("Hasta la próxima!");
				break;
			default:
				System.out.println("Opción elegida no valida");
			}
		} while (opcion!=4);

	}
	
	public static int menu(Scanner sc) {
		System.out.println("====== MADCOOL 2026 ======");
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Vendidas por zonas");
		System.out.println("4. Salir");
		System.out.println("Elige la opción: ");
		return sc.nextInt();
	}
	
	public static int zonas(Scanner sc) {
		System.out.println("1. Sala principal");
		System.out.println("2. Sala de compra-venta");
		System.out.println("3. Sala VIP");
		System.out.println("¿Que zona desea comprar?");
		return sc.nextInt();
	}
	
	public static void mostrar_disponibilidad(Zona uno, Zona dos, Zona tres) {
		System.out.println("Entradas disponibles para la sala principal: " + uno.getEntradasPorVender() + " y se han vendido: " + uno.getEntradas_vendidas());
		System.out.println("Entradas disponibles para la zona de compra-venta: " + dos.getEntradasPorVender() + " y se han vendido: " + dos.getEntradas_vendidas()) ;
		System.out.println("Entradas disponibles para la zona vip: " + tres.getEntradasPorVender() + " y se han vendido: " + tres.getEntradas_vendidas());
	}
}
