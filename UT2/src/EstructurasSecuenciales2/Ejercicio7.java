package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Un alumno desea saber cuál será su calificación final en una materia. 
		// Dicha calificación se compone de los siguientes porcentajes:
		// 55% del promedio de sus tres calificaciones parciales.
		// 30% de la calificación del examen final.
		// 15% de la calificación de un trabajo final.
		// El alumno introduce las calificaciones de los 4 exámenes y el trabajo.

		/****************** ANÁLISIS *********************************/
		// Hay que solicitar 5 datos.
		// Datos de entrada: notas de examen, mas examen final y trabajo final
		// Información de salida: la suma de los examenes mas trabajo por el porcentaje de cada uno
		// Variables: nota1, nota2, nota3, examenFinal, notaTrabajo, notaFinal,promedioNota,promedioFinal,promedioTrabajoFinal
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		double nota1, nota2, nota3, examenFinal, notaTrabajo, notaFinal,promedioNota,promedioFinal,promedioTrabajoFinal;
		
		System.out.println("Introduce nota examen 1: ");
		nota1 = leer.nextDouble();
		System.out.println("Introduce nota examen 2: ");
		nota2 = leer.nextDouble();
		System.out.println("Introduce nota examen 3: ");
		nota3 = leer.nextDouble();
		System.out.println("Introduce nota examen final: ");
		examenFinal = leer.nextDouble();
		System.out.println("Introduce nota del trabajo: ");
		notaTrabajo = leer.nextDouble();
		
		promedioNota = ((nota1+nota2+nota3)/3)*0.55;
		promedioFinal = examenFinal*0.30;
		promedioTrabajoFinal = notaTrabajo*0.15;
		notaFinal= promedioNota+promedioFinal+promedioTrabajoFinal;
		
		
		
		System.out.println("La nota final es: " + notaFinal);
		
		
		
		
		
		
	}

}
