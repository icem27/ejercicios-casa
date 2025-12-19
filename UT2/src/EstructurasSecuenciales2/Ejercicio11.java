package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int dia, mes, ano, suma, resultado1, resultado2, resultado3, resultado4;
		
		System.out.println("Introduce tu fecha de nacimiento: ");
		
		System.out.println("Dia: ");
		dia = leer.nextInt();
		
		System.out.println("Mes: ");
		mes = leer.nextInt();

		System.out.println("Año: ");
		ano = leer.nextInt();
		
		suma = dia+mes+ano;
		resultado1 = suma/1000;
		resultado2 = (suma/100)%10;
		resultado3 = (suma/10)%10;
		resultado4 = suma%10;
		
		System.out.println("Tu número de la suerte es: "+ (resultado1+resultado2+resultado3+resultado4));
		
		leer.close();
	}

}
