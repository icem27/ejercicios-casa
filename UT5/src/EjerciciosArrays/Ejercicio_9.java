package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio_9 {
	/*Realizar un programa Java que inicialice un vector de tipo numérico de tipo 
	 * flotante llamado notas de 3 elementos cuyos valores serán  solicitados  
	 * e introducidos por teclado por el usuario. 
	 * El programa calcula y muestra la media obtenida. */

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		double[] nota = new double[3];
		int tam=nota.length;
		double notaUsuario, notaTotal=0;
		double notaMedia=notaTotal/tam;
		int contador=1;
		
		System.out.println("Introduce las notas obtenidas para calcular la media. ");
		
		for(int i=0; i<tam;i++) {
			System.out.println("Introduce la " + contador + "ª nota");
			notaUsuario=leer.nextDouble();
			nota[i]=notaUsuario;
			
			contador++;
		}
		
		for (int i=0; i<tam;i++) {
			notaTotal+=nota[i];
			
		}
		System.out.println("La suma total es: " + notaTotal);
		System.out.println("La nota media de las " + tam + " notas es: " + notaMedia);

		leer.close();
	}

}