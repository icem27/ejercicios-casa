package Actividades;

import java.util.Scanner;

public class amigo_invisible {
	static String[][] nombres = null;
	static int cantidad;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		do {
			opcionElegida=mostrarMenu(sc);
			switch(opcionElegida){
			case 1: 
				asignarParticipantes(sc);
				break;
			case 2:
				sorteo();
				break;
			case 3:
				mostrarSorteo();
				break;
			case 4: 
				sorteo();
				break;
			case 5:
				salir();
				break;
			default:
				opcionMalElegida();
			}
			
		} while(opcionElegida !=5);
	}
	
	public static int mostrarMenu(Scanner sc) {
		System.out.println("MENÚ AMIGO INVISIBLE");
		System.out.println("1. Introducir participantes");
		System.out.println("2. Realizar sorteo");
		System.out.println("3. Mostrar asignaciones actuales");
		System.out.println("4. Repetir sorteo (nueva mezcla)");
		System.out.println("5. Salir");
		System.out.print("\nElige una opción: ");
		return sc.nextInt();
	}
	
	public static String[][] asignarParticipantes(Scanner sc) {
		System.out.print("¿Cuántas personas participan? ");
		cantidad = sc.nextInt();
		nombres = new String[2][cantidad];
		sc.nextLine();
		for(int i=0;i<cantidad;i++) {
			System.out.print("Nombre "+ (1+i)+": ");
			nombres [0][i]=sc.nextLine();
		}
		System.out.println("Participantes guardados correctamente\n");
		return nombres;
	}
	public static String queTengo(int columna0, int columna1) {
		return nombres[columna0][columna1];
	}
	
	public static void mostrarSorteo() {
		System.out.println("\n--- Asignación del Amigo Invisible ---");
			for(int i=0;i<cantidad;i++) {
				System.out.printf("%s -> %s\n",nombres[0][i], nombres[1][i] );
			}
		System.out.println("--------------------------------------\n");
	}
	public static void sorteo() {

		for(int i=0;i<cantidad;i++){
			int num=(int)(Math.random()*cantidad);
			if(i<1 && num!=0) {
				nombres[1][0]=queTengo(0,num);
			} else if (i>0 & !nombres[0][i].equals(queTengo(0,num))){
				nombres[1][i]=queTengo(0,num);	
			}
		}
		System.out.println("Sorteo realizado correctamente\n");
	}
	public static void salir() {
		System.out.println("\nHasta la próxima!");
	}
	public static void opcionMalElegida() {
		System.out.println("\nDebes selecionar una opción del 1 al 5\n");
	}
	public static int[] aleatorio() {
		int cantidad=5;
		int[] nums = new int[cantidad];
		boolean[] salido = new boolean[cantidad];
		
		for(int i=0;i<cantidad;i++) {
			int random;
			do {
				random=(int)(Math.random()*cantidad);
			} while(salido[random] || random == i);
			salido[random]=true;
			nums[i]=random;
		}
		return nums;
	}

}
