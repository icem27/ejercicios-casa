package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		final int VIP=1;
		final int REGULAR=2;
		
		System.out.println("¿Eres cliente VIP? \n 1. Si \n 2. No");
		int tipoCliente = leer.nextInt();
		System.out.println("¿Cual es el importe de la compra?");
		double importe= leer.nextDouble();
		System.out.println("¿Es fin de semana? [0->No, 1->Sí]");
		//boolean esFinde = leer.nextInt()==1; //Para leer el booleano como un número entero
		 boolean esFinde=leer.nextBoolean(); //Para leer el booleano con true o false.

		 leer.close();
		 
		double descuento=0;
		
		if (tipoCliente==VIP && importe>100) {
			descuento=0.10;
		} else if (tipoCliente==REGULAR && importe>200) {
			descuento=0.05;
		}
		
		double importeTotal=importe-descuento*importe;
		
		if (importe < 50) {
			importeTotal = 2 + importeTotal;//importeTotal +=2;
		}
		
		if (tipoCliente==VIP && importe>150 && esFinde) {
			System.out.println("Oferta Especial.");
		}
		
		System.out.println("La compra tiene un importe de "+importeTotal);
		
	}

}
