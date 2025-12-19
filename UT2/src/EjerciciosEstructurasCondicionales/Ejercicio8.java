package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Para las jornadas de puertas abiertas se está organizando un torneo de eSports y 
		 * se necesita calcular cuánto debe pagar cada participante por la inscripción, 
		 * así como el gasto adicional que asumirá el centro en alquiler de equipos.

		La inscripción depende del número de participantes:

		Si se inscriben 100 jugadores o más, la cuota por jugador es de 12 euros.
		Si se inscriben entre 60 y 99 jugadores, la cuota por jugador es de 15 euros.
		Si se inscriben entre 30 y 59 jugadores, la cuota por jugador es de 20 euros.
		Si se inscriben menos de 30 jugadores, la cuota por jugador es de 25 euros.
		Además:

		Para el torneo se necesitan ordenadores 
		Los ordenadores se alquilan en packs de 20, y cada pack cuesta 500 euros.
		El importe del alquiler de los ordenadores lo paga el instituto (no los jugadores), 
		pero igualmente debe calcularse y mostrarse por pantalla.
		Se pide realizar un programa que pida la cantidad de alumnos que participarán en el torneo 
		y determine:

		El coste total del alquiler de equipos que pagará el instituto.
		La cuota que debe pagar cada jugador por su inscripción en el torneo.*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el número de inscripciones: ");
		int ins= leer.nextInt();
		
		int packs= ins/20;
		
		if (ins % 20>0) {
			packs=packs+1;
		}
		
		int coste = packs*500;
		
		if (ins>=100) {
			System.out.println("La cuota tiene un coste de 12 euros y el coste total por ordeandores es de: " + coste);
		} else if (ins<=99 && ins>=60) {
			System.out.println("La cuota tiene un coste de 15 euros y el coste total por ordeandores es de: " + coste);
		} else if (ins<=59 && ins>=30) {
			System.out.println("La cuota tiene un coste de 20 euros y el coste total por ordeandores es de: " + coste);
		} else if (ins<=29) {
			System.out.println("La cuota tiene un coste de 25 euros y el coste total por ordeandores es de: " + coste);
		}
		
		leer.close();
	}

}
