package EstructurasRepetetivas;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		// Realiza un programa que solicite una secuencia de notas 
		// (con valores que van de 0 a 10). El programa terminará 
		// cuando se introduzca el valor -1 y nos indicará si hubo 
		// o no alguna nota con valor 10 y cual es la nota media.
		
		Scanner leer = new Scanner(System.in);
		double nota, suma=0;
		int totalNotas=0;
		boolean hayDiez=false;
		
		System.out.println("Introduce un nota >=0 (-1 para salir)");
		nota=leer.nextDouble();
		if (nota>=10 && nota<=0) {
		while (nota>-1) {
			suma+=nota;
			totalNotas++;
			if (nota==10) {
				hayDiez=true;
				}
			System.out.println("Introduce un nota >=0 (-1 para salir)");
			nota=leer.nextDouble();
			}
		double notaMedia=suma/totalNotas;
		System.out.println("La nota media es de: "+notaMedia);
		if(hayDiez) {
			System.out.println("Se ha introducido algún 10");
		}else {
			System.out.println("No se ha introducido ningún 10");
		}
		} else {
			System.out.println("Se ha introducido una nota superior al 10");
		}

		leer.close();
	}

}
