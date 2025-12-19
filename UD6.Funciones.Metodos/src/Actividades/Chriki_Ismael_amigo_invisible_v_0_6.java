package Actividades;

import java.util.Scanner;

public class Chriki_Ismael_amigo_invisible_v_0_6 {
	static String[][] participantes = null;
	static int numeroParticipantes=0;
	static final int MINIMO_PARTICIPANTES=3;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcionElegida;
		do {
			opcionElegida=menu(sc);
			switch(opcionElegida){
			case 1: 
				asignarParticipantes(sc);
				break;
			case 2:
				realizarSorteo();
				break;
			case 3:
				mostrarSorteo();
				break;
			case 4: 
				repetirSorteo();
				break;
			case 5:
				salir();
				break;
			default:
				opcionInvalida();
			}
			
		} while(opcionElegida !=5);
	}
	
	public static int menu(Scanner sc) {
		System.out.println("MENÚ AMIGO INVISIBLE");
		System.out.println("1. Introducir participantes");
		System.out.println("2. Realizar sorteo");
		System.out.println("3. Mostrar asignaciones actuales");
		System.out.println("4. Repetir sorteo (nueva mezcla)");
		System.out.println("5. Salir\n");
		return leerNumero(sc, "Elige la opción: ");
	}
	//Para rellenar el array con los participantes
	public static String[][] asignarParticipantes(Scanner sc) {
		numeroParticipantes = leerNumero(sc, "¿Cuántas personas participan? ");
		//No puede introducir menos de tres participantes, es una tonteria hacer un sorteo con dos personas
		while(numeroParticipantes<MINIMO_PARTICIPANTES) {
				System.out.println("Debes introducir un minimo de " + MINIMO_PARTICIPANTES +" participantes\n");
				numeroParticipantes = leerNumero(sc, "¿Cuántas personas participan? ");
		}
		//Inicializamos el array de participantes con el numero de participantes
		participantes = new String[2][numeroParticipantes];
		for(int i=0;i<numeroParticipantes;i++) {
			participantes[0][i]=leerParticipante(sc, "Nombre "+ (1+i)+": ");
		}
		
		System.out.println("Participantes guardados correctamente\n");
		return participantes;
	}
	//Para mostrar el sorteo
	public static void mostrarSorteo() {
		//No se puede visualizar el sorteo si el array de participantes esta vacio
		if(participantes==null || participantes[1][0]==null) {
			System.out.println("No se puede mostrar las asignación sin haber realizado el sorteo\n");
			return;
		}
		
		System.out.println("\n--- Asignación del Amigo Invisible ---");
			for(int i=0;i<numeroParticipantes;i++) {
				System.out.printf("%s ➔ %s\n",participantes[0][i], participantes[1][i] );
			}
		System.out.println("--------------------------------------\n");
	}
	//Para realizar el sorteo
	public static void sorteo() {
		int[] orden=new int[numeroParticipantes];
		boolean sorteoRealizado=false;
		for(int i=0;i<numeroParticipantes;i++) {
				while(!sorteoRealizado){
				//Inicializamos el array de numeros con el número de su posición
				for(int j=0;j<numeroParticipantes;j++) {
					orden[j]=j;
				}
				//Barajamos las posiciones de manera aleatorio, para que no sea igual en otros sorteos
				for(int j=0;j<numeroParticipantes;j++) {
					int temp=(int)(Math.random()*numeroParticipantes);
					int aux=orden[j];
					orden[j]=orden[temp];
					orden[temp]=aux;
				}
				//Realizamos la verificación para que no se regale a si mismo, si es asi
				//Si es asi, lo cambiamos de posición con otro número
				for(int j=0;j<numeroParticipantes;j++) {
					if(j==orden[j]) {
						int aux = (j+1)%numeroParticipantes;
						int temp=orden[j];
						orden[j]=orden[aux];
						orden[aux]=temp;
					}
				}
				sorteoRealizado=true;
				}
			participantes[1][i]=participantes[0][orden[i]];
		}
		System.out.println("Sorteo realizado correctamente\n");
	}
	//Para realizar una nueva mezcla y vaciar la columna de sorteados
	public static void repetirSorteo() {
		if(participantes==null || participantes[1][0]==null) {
			System.out.println("No se puede realizar nueva mezclado sin haber realizado el sorteo primero\n");
			return;
		}
		for(int i=0;i<numeroParticipantes;i++) {
			participantes[1][i]=null;
		}
		sorteo();
	}
	//Para realizar el sorteo, si ya se realizó no se puede realizar, sino una nueva mezcla
	public static void realizarSorteo() {
		if(numeroParticipantes==0) {
			System.out.println("No puedes realizar el sorteo. \nDebes introducir primero a los participantes\n");
			return;
		}
		if(participantes[1][0]==null) {
			sorteo();
		} else {
			System.out.println("\nYa se ha realizado el sorteo, \ndebes realizar nueva mezcla.\n");
		}
	}
	//Para realizar la comprobación de que el usuario solo mete números. 
	public static int leerNumero(Scanner sc, String mensaje) {
		while(true) {
		System.out.print(mensaje);
		String lector = sc.nextLine();
		boolean esNumero=lector.length()>0;
		for(int i=0;i<lector.length();i++) {
			if(!Character.isDigit(lector.charAt(i))) {
				esNumero=false;
			}
		}
		if(esNumero) {
			return Integer.parseInt(lector);
		} 
		System.out.println("Debes introducir un número entero");
		}
	}
	//Para comprobar que el usuario solo mete letras, espacio y guión
	public static String leerParticipante(Scanner sc, String mensaje) {
		while(true) {
			System.out.print(mensaje);
			String nombre=sc.nextLine().trim();
			boolean esPalabra= nombre.length()>0;
			
			for(int i=0;i<nombre.length();i++) {
				char c = nombre.charAt(i);
				if(!Character.isLetter(c) && c != ' ' && c != '-') {
					esPalabra=false;
				}
			}
			if(esPalabra) {
				return nombre;
			}
			System.out.println("Solo se permiten letras, espacios y guiones");
		}
	}
	//Solo para despedir
	public static void salir() {
		System.out.println("\nHasta la próxima!");
	}
	//Solo para indicar al usuario los números correctos que debe introducir
	public static void opcionInvalida() {
		System.out.println("\nDebes selecionar una opción del 1 al 5\n");
	}
	

}