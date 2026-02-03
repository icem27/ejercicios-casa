package Practica;

import java.util.Scanner;


public class Incidencia_principal {
	static Scanner sc = new Scanner(System.in);
	static Incidencia[] averia = new Incidencia[30];
	
	public static void main(String[] args) {
		for(int i=0;i<averia.length;i++) {
			averia[i]=new Incidencia();
		}
		final int PUESTOS_MAX = 30;
		int puesto;
		String aver;
		int opcion;
		do {
			opcion = menu();
			switch(opcion) {
			case 1: 
				boolean si_hay=false;
				for(Incidencia in:averia) {
					if(in.getEstado()=="PENDIENTE" || in.getEstado()=="RESUELTA") {
					System.out.println(in);
					si_hay=true;
					}
				} 
				if(!si_hay) {
					System.out.println("No existen incidencias");
				}
				break;
			case 2: 
				
				abrirIncidencia();
				break;
			case 3: 
				System.out.println("Ingresa el numero de puesto:");
				puesto = sc.nextInt();
				sc.nextLine();
				cerrarIncidencia(puesto);
				break;
			case 4: 
				System.out.println("Hasta la próxima!");
				break;
			default: 
				System.out.println("La opción introducida no es correcta");
			}
		} while(opcion!=4);

		
	

	}
	
	public static void abrirIncidencia() {
		int puesto;
		String aver;
		System.out.println("Ingresa el numero de puesto:");
		puesto = sc.nextInt();
		if (averia[puesto].getAveria()!=null) {
			System.out.println("Ya existe una incidencia no resuelta en este puesto.");
			return;
		}
		sc.nextLine();
		System.out.println("Ingresa la descripcion de la incidencia: ");
		aver = sc.nextLine();
		averia[puesto] = new Incidencia(puesto, aver);
		System.out.println("Se ha abierto la averia " + aver + " con exito");
		averia[puesto].setEstado("PENDIENTE");
	}
	
	public static void cerrarIncidencia(int puesto) {
		if(averia[puesto].getEstado()=="PENDIENTE") {
			averia[puesto].setEstado("RESUELTA");
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
