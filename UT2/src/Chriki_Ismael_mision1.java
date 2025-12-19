import java.util.Scanner;

public class Chriki_Ismael_mision1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int entrada;
		do {
		System.out.println("---- CENTRO DE CONTROL TEMPORAL ----"
				+ "\n 1. Calibrar el portal"
				+ "\n 2. Establecer fecha del viaje"
				+ "\n 3. Mostrar carga temporal acumulada"
				+ "\n 4. Iniciar viaje"
				+ "\n 0. Salir"
				+ "\n -----------------------------------"
				+ "\n Elige una opción: ");
		entrada=leer.nextInt();
		int contador = 0;
		int crones=0;
		final int energiaFinal=35;
		boolean mes=false;
		boolean dia=false;
		
		switch(entrada) {
		case 1: 
			System.out.println("====================================="
					+ "\n	Calibrar el portal"
					+ "\n=====================================");
			while(true) {
			System.out.println("Introduce la cantidad de energia: ");
			int valorEnergia=leer.nextInt();
			if (valorEnergia>energiaFinal) {
					System.out.println("La cantidad introducida es demasiado alta");
					contador++;
				} else if (valorEnergia<energiaFinal) {
					System.out.println("La cantidad introducida es demasiado baja");
					contador++;
				} else {
					contador++;
					System.out.println("Has acertado en "+contador);
					crones=10;
					break;
				}
			}
			
			break;
		case 2:
			String respuesta= "";
			System.out.println("====================================="
					+ "\n	Establecer fecha del viaje"
					+ "\n=====================================");
			System.out.println("Introduce el dia: ");
			int diaViaje=leer.nextInt();
			System.out.println("Introduce el mes: ");
			int mesViaje=leer.nextInt();
			System.out.println("Introduce el año: ");
			int anhoViaje=leer.nextInt();
			
			

			System.out.println(respuesta);
			
			break;
		case 3: 
			System.out.println("Caso 3");
			break;
		case 4: 
			System.out.println("Caso 4");
			break;
		case 0: 
			System.out.println("Caso 0");
			break;
		default: 
			System.out.println("No has eligido número");
		}
		} while (entrada!=0);
	
		leer.close();
	}
	
}
