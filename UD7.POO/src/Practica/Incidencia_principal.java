package Practica;

import java.util.Scanner;

public class Incidencia_principal {
	static Scanner sc = new Scanner(System.in);
	static Incidencia[] averia = new Incidencia[30];
	
	public static void main(String[] args) {
		for(int i=0;i<averia.length;i++) {
			averia[i]= new Incidencia();
		}
		final int PUESTOS_MAX = 30;
		System.out.println("Ingresa el numero de puesto:");
		int puesto = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa la descripcion de la incidencia: ");
		String aver = sc.nextLine();
		abrirIncidencia(puesto, aver);
		System.out.println("Ingresa el numero de puesto:");
		puesto = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingresa la descripcion de la incidencia: ");
		aver = sc.nextLine();
		abrirIncidencia(puesto, aver);
		for(Incidencia in:averia) {
			System.out.println(in.isEstado());
		}

	}
	
	public static void abrirIncidencia(int puesto, String averia_usuario) {
		if(!averia[puesto].isEstado()) {
			averia[puesto] = new Incidencia(puesto, averia_usuario);
			averia[puesto].setEstado(true);
			System.out.println("Se ha abierto la averia " + averia_usuario + " con exito");
		}
		
	}
	
	public static void cerrarIncidencia(int puesto, String averia_usuario) {
		if(averia[puesto].isEstado()) {
			averia[puesto] = new Incidencia(puesto, averia_usuario);
			averia[puesto].setEstado(false);
			System.out.println("Se ha cerrado la averia " + averia_usuario + " con exito");
		}
	}
	public static int menu() {
		System.out.println("Seleccione una opcion (1-4):\n"
				+ "1. Listado\n"
				+ "2. Alta\n"
				+ "3. Baja\n"
				+ "4. Salir");
		return sc.nextInt();
	}

}
