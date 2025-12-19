package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Realiza un programa que reciba una cantidad de segundos y muestre por pantalla cuántas horas y minutos son. 
		/****************** ANÁLISIS *********************************/
		// Hay que solicitar 5 datos.
		// Datos de entrada: notas de examen, mas examen final y trabajo final
		// Información de salida: la suma de los examenes mas trabajo por el porcentaje de cada uno
		// Variables: nota1, nota2, nota3, examenFinal, notaTrabajo, notaFinal,promedioNota,promedioFinal,promedioTrabajoFinal
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		int segundos, horas, minutos, segundosf;
		
		System.out.println("Introduce la cantidad de segundos: ");
		segundos = leer.nextInt();
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundosf = segundos;
		
		
		System.out.println(segundos + " segundos son " + horas + " horas y " + minutos + " minutos " + segundosf + " segundos");
		leer.close();
	}

}
