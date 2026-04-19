package Ejercicio1;

import java.io.*;
import java.util.InputMismatchException;

public class Ejercicio1 {
	public static void main(String[] args) {
		/*Crea un programa que pida al usuario dos números y realice la división, 
		 * manejando la posible división por cero.*/
		
		try {
			int n1=1;
			int n2=0;
			int div = n1/n2;
			System.out.println(div);
		} catch (ArithmeticException | InputMismatchException x) {
			System.out.println("Error. " + x.getMessage());
		} finally {
			System.out.println("adios");
		}
		
	}
}
