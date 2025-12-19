package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Un estudiante realiza cuatro exámenes que tienen la misma ponderación. 
		// Realizar el programa correspondiente para obtener el promedio de las 
		// calificaciones introducidas por el estudiante.
		/****************** ANÁLISIS *********************************/
		// Hay que solicitar cuatro datos, cada uno de ellos es una nota de un examen.
		// Datos de entrada: 4 números
		// Información de salida: La suma de las cuatro notas entre las cuatro notas
		// Variables: nota1, nota2, nota3, nota4 y media
		/****************** DISEÑO *********************************/
		// 1. Leer 4 números
		// 2. En el resultado hacer la división de las notas entre el numero de notas
		
		Scanner leer = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		
		System.out.println("Introduce tu primera nota: ");
		nota1 = leer.nextFloat();
		
		System.out.println("Introduce tu primera nota: ");
		nota2 = leer.nextFloat();

		System.out.println("Introduce tu primera nota: ");
		nota3 = leer.nextFloat();

		System.out.println("Introduce tu primera nota: ");
		nota4 = leer.nextFloat();
		
		media = ((nota1+ nota2+ nota3+ nota4) / 4);
		
		System.out.println("Tu nota media es: " + media );

	}

}
