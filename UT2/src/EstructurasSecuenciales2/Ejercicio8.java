package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Escribir un programa que calcule la nota final de un test, considerando que:
		// Por cada respuesta correcta se obtienen 5 puntos
		// Por cada incorrecta -1 
		// En blanco 0. 
		// Imprime el resultado obtenido por el estudiante si introduce la cantidad de respuestas correctas, 
		// incorrectas y en blanco.

		/****************** ANÁLISIS *********************************/
		// Hay que solicitar 5 datos.
		// Datos de entrada: notas de examen, mas examen final y trabajo final
		// Información de salida: la suma de los examenes mas trabajo por el porcentaje de cada uno
		// Variables: nota1, nota2, nota3, examenFinal, notaTrabajo, notaFinal,promedioNota,promedioFinal,promedioTrabajoFinal
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		int respuestaCorrecta, respuestaIncorrecta, respuestaBlanco, notaMedia;
		
		System.out.println("Introduce la cantidad de respuestas correctas: ");
		respuestaCorrecta = leer.nextInt();
		
		System.out.println("Introduce la cantidad de respuestas incorrectas: ");
		respuestaIncorrecta = leer.nextInt();

		System.out.println("Introduce la cantidad de respuestas en blanco: ");
		respuestaBlanco = leer.nextInt();
		
		notaMedia= (respuestaCorrecta*5)+(respuestaIncorrecta*(-1))+(respuestaBlanco*0);
		System.out.println("La nota del test es:  "+notaMedia);
	}

}
