package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Realiza un programa que nos diga el dinero que tenemos en euros y céntimos después de 
		// pedirnos cuantas monedas tenemos de 2 euros, 1 euro, 50 céntimos, 20 céntimos y 10 céntimos.. 
		/****************** ANÁLISIS *********************************/
		// Hay que solicitar 5 datos.
		// Datos de entrada: notas de examen, mas examen final y trabajo final
		// Información de salida: la suma de los examenes mas trabajo por el porcentaje de cada uno
		// Variables: nota1, nota2, nota3, examenFinal, notaTrabajo, notaFinal,promedioNota,promedioFinal,promedioTrabajoFinal
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		int euro2, euro1, totalEuros, euros;
		int totalCentimos, centimos5, centimos2, centimos1, centimos;
		
		System.out.println("Introduce cuántas monedas de 2€ tienes: ");
		euro2 = leer.nextInt();

		System.out.println("Introduce cuántas monedas de 1€ tienes: ");
		euro1 = leer.nextInt();
		
		System.out.println("Introduce cuántas monedas de 50 céntimos tienes: ");
		centimos5 = leer.nextInt();

		System.out.println("Introduce cuántas monedas de 20 céntimos tienes: ");
		centimos2 = leer.nextInt();

		System.out.println("Introduce cuántas monedas de 10 céntimos tienes: ");
		centimos1 = leer.nextInt();
		
		centimos = (centimos1*10)+(centimos2*20)+(centimos5*50);
		euros = (euro2*2)+euro1;
		totalEuros = (centimos/100)+euros;
		totalCentimos= centimos%100;
		
		System.out.println("Total euros: " + totalEuros + " céntimos: " + totalCentimos );
		
		leer.close();
	}

}
