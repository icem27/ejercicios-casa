package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		Crea un programa que lea 3 datos de entrada A, B y C. 
		Estos datos corresponden a las dimensiones de los lados de un triángulo.
		El programa debe determinar qué tipo de triangulo es, teniendo en cuenta los siguiente:
		Si se cumple Pitágoras entonces es triángulo rectángulo
		Si sólo dos lados del triángulo son iguales entonces es isósceles.
		Si los 3 lados son iguales entonces es equilátero.
		Si no se cumple ninguna de las condiciones anteriores, es escaleno.*/
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el lado A: ");
		int a = leer.nextInt();

		System.out.println("Introduce el lado B: ");
		int b = leer.nextInt();

		System.out.println("Introduce el lado C: ");
		int c = leer.nextInt();
		
		
		if ((Math.pow(c,2)==(Math.pow(a, 2)+Math.pow(b, 2))) || (Math.pow(b,2)==(Math.pow(a, 2)+Math.pow(c, 2))) || (Math.pow(a,2)==(Math.pow(c, 2)+Math.pow(b, 2)))) {
			System.out.println("Es triángulo rectángulo");
		} else if (a==b && a!=c || a==c && a!=b || b==c && b!=a) {
			System.out.println("Es isósceles");
		} else if (a==b && a==c || b==c && b==a || c==a && c==b) {
			System.out.println("Es equilátero");	
		}
		else {
			System.out.println("Es escaleno");
		}
		leer.close();
	}

}
