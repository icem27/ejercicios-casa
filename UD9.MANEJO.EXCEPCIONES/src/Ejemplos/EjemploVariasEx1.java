package Ejemplos;

import java.util.*;
import java.util.Scanner;

public class EjemploVariasEx1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1 = 0, num2 = 0, division = 0;
		try {
			System.out.println("Introduce el dividendo");
			num1 = leer.nextInt();
			System.out.println("Introduce el divisor");
			num2 = Integer.parseInt(leer.next());
			division = num1 / num2;
			System.out.println("La division es " + division);
		} catch (InputMismatchException | NumberFormatException are) {
			// si el tipo de dato introducido no es correcto o produce error al convertir
			System.out.println("Dato incorrecto");
		} catch (ArithmeticException ae) {
			// se intenta dividir por 0
			System.out.println("Operación imposible");
		} catch (Exception ae) {
			// cualquier otro error que no hayamos controlado con las anteriores capturas
			System.out.println("Error controlado");
		} finally {
			leer.close();
		}
	}
}
