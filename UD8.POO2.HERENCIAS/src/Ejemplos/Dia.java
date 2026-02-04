package Ejemplos;

import java.util.Scanner;

public class Dia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiasSemana[] dias = DiasSemana.values();
		for(DiasSemana dia:dias) {
			System.out.println(dia);
		}
		
		System.out.println("Introduce el dia se la semana: ");
		String dia = sc.next();
		DiasSemana diaS = DiasSemana.valueOf(dia);
		switch(diaS) {
		case LUNES:
			System.out.println("Lunes lunes chavalin");
			break;
		case MARTES:
			System.out.println("Martes martes chavalin");
			break;
		case MIERCOLES:
			System.out.println("Miercoles miercoles chavalin");
			break;
		case JUEVES:
			System.out.println("Jueves jueves chavalin");
			break;
		case VIERNES:
			System.out.println("Viernes viernes chavalin");
			break;
		case SABADO:
			System.out.println("Sabado sabado chavalin");
			break;
		case DOMINGO:
			System.out.println("Domingo domingo chavalin");
			break;
		default:
			System.out.println("El dia introducido no existe");
		}
		
		}
	}

