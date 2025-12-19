package Actividades;

import java.util.Scanner;

public class amigo_invisible_completo {
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
	//Mostrar el menú
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
		for(int i=0;i<numeroParticipantes;i++) {
			int indice;
			boolean indiceValido;
			do {
				//Se ha la comprobación simepre de la ultima persona, para ver ya ha salido
				if(i==(numeroParticipantes-1) && esSorteoInvalido()) {
					i=0;
					resetearParticipantes();
				} 
				indiceValido=true;
				indice=(int)(Math.random()*numeroParticipantes);
				//No tiene que regalarse a si mismo y no puede regalar al que le regalo
				if(i==indice || (participantes[1][indice]!=null && participantes[0][i].equals(participantes[1][indice]))) {
					indiceValido=false;
				} else {
				//Aqui hacermos la comprobamos de si el nombre ya ha salido
				for(int j=0;j<numeroParticipantes;j++) {
					if(participantes[1][j]!=null && participantes[0][indice].equals(participantes[1][j])) {
						indiceValido=false;
						break;
						}
					}
				}
			} while(!indiceValido);
			//rellenamos la columna con el nombre que nos ha salido
			participantes[1][i]=participantes[0][indice];
		}
		System.out.println("Sorteo realizado correctamente\n");
	}
	//Para realizar una nueva mezcla
	public static void repetirSorteo() {
		if(participantes==null || participantes[1][0]==null) {
			System.out.println("No se puede realizar nueva mezclado sin haber realizado el sorteo primero\n");
			return;
		}
		resetearParticipantes();
		sorteo();
	}
	//Comprobar si la ultima persona sin escoger es valida, sino, el sorteo es invalido
	public static boolean esSorteoInvalido() {
		boolean esInvalido=false;
		int indice=-1;
		for(int i=0;i<numeroParticipantes;i++) {
			for(int j=0;j<numeroParticipantes-1;j++) {
				if(participantes[0][i].equals(participantes[1][j])) {
					break;
				} else if (j==(numeroParticipantes-2)) {
					indice=i;
					break;
				}
			} 
			if(indice!=-1) {
				break;
			}
		}
		if(indice==(numeroParticipantes-1) || participantes[1][indice]==participantes[0][numeroParticipantes-1]) {
			esInvalido=true;
		}
		
		return esInvalido;
	}
	//Reseteamos los participantes
	public static void resetearParticipantes() {
		for(int i=0;i<numeroParticipantes;i++) {
			participantes[1][i]=null;
		}
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
