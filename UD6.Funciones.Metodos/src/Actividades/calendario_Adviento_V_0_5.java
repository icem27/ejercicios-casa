package Actividades;

import java.util.Scanner;

public class calendario_Adviento_V_0_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[][] array = {{false, false, false, false, false}, 
				{false, false, false, false, false}, 
				{false, false, false, false, false}, 
				{false, false, false, false, false}, 
				{false, false, false, false}};
		int dia;
		boolean salir=false;
		boolean es_dia_valido=false;
		do {
			System.out.println("Introduce el dia o 0 para salir:");
			dia = sc.nextInt();
			if (dia == 0) {
				salir = true;
			} else {
				while (dia < 1 || dia > 25) {
					System.out.println("Sólo días entre 1 y 25");
					dia = sc.nextInt();
				}
				es_dia_valido = comprobarDiaValido(dia, array);
				if (diaAbierto(dia, array)) {
					System.out.println(
							"El día " + dia + " ya ha sido abierto, vas por el dia " + (posicion_actual(array) + 1));
				} else if (es_dia_valido && dia < 25) {
					abrirDia(dia, array);
				} else if (dia == 25) {
					System.out.println("¡Feliz Navidad!");
					System.out.println("    *\r\n" + "   ***\r\n" + "  *****\r\n" + " *******\r\n" + "*********");
					salir = true;
				} else {
					System.out.println("No puedes abrir el día " + dia
							+ " hasta que abras todos los anteriores, vas por el dia " + (posicion_actual(array) + 1));
				}
			}
		} while (!salir);
		if (dia!= 25)
			System.out.println("Hasta la próxima.");
		
		sc.close();
	}
	//Para poder el estado del array de booleano, si esta abierto o no 
	static boolean diaAbierto(int num, boolean[][] array) {
		boolean diaAbierto = false;
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				contador++;
				if (contador == num) {
					diaAbierto = array[i][j];
					break;
				}
			}
		}
		return diaAbierto;
	}
	//Desde aqui retornamos el la frase segun el dia introducido y convertimos dicho dia en true
	static void abrirDia(int dia, boolean[][] array) {
		String frase="";
		String[][] frases = {{"¡Muchas felicidades!", "¡Enhorabuena por tu logro!", "¡Lo conseguiste, bravo!", "¡Qué orgullo, felicidades!", "¡Celebrando contigo!"},
				{"¡Bien hecho, de verdad!", "¡Felicidades, te lo mereces!", "¡Gran trabajo, admirable!", "¡Éxito bien ganado, felicidades!", "¡Mis mejores deseos para ti!"}, 
				{"¡Felicidades por este paso!", "¡A seguir brillando!", "¡Tu esfuerzo dio frutos!", "¡Qué alegría por ti!", "¡Felicidades, sigue así!"}, 
				{"¡Motivo de celebración!", "¡Muy feliz por tu logro!", "¡Gran mérito, felicidades!", "¡Hoy celebramos tu éxito!", "¡Felicidades, lo lograste!"}, 
				{"¡Todo un triunfo, bravo!", "¡Aplausos para ti!", "¡Logro impresionante!", "¡Felicidades, eres increíble!"}};
		
		int contador = 0;
		for (int i = 0; i < frases.length; i++) {
			for (int j = 0; j < frases[i].length; j++) {
				contador++;
				if (contador == dia) {
					frase = frases[i][j];
					array[i][j] = true;
				}
			}
		}
		System.out.println(frase);
		if (dia == 24) {
			System.out.println("Te queda " + (25 - dia) + " dia para la Navidad");
		} else {
			System.out.println("Te quedan " + (25 - dia) + " dias para la Navidad");
		}
	}
	//Para poder comprobar el dia anterior si es true o false. 
	static boolean comprobarDiaValido(int dia, boolean[][] array) {
		boolean estado_dia_anterior = true;
		boolean dia_valido = false;

		if (dia > 1) {
			estado_dia_anterior = diaAbierto(dia - 1, array);
		}
		dia_valido = estado_dia_anterior && !diaAbierto(dia, array);
		return dia_valido;
	}
	//Esta función es solo para indicar en que posición estamos. El ultimo true dentro del array
	static int posicion_actual(boolean[][] array) {
		int posicion = 0;
		int contador = 0;
		for (int i = 1; i < 25; i++) {
			contador++;
			if (diaAbierto(i, array)) {
				posicion = contador;
			}
		}
		return posicion;
	}
	
}
