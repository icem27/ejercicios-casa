package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio15_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("¿Eres cliente VIP? \n 1. Si \n 2. No");
		int vip = leer.nextInt();
		
		System.out.println("¿Cual es el importe de la compra?");
		int compra= leer.nextInt();
		
		
		
		System.out.println("¿Es fin de semana? True/False");
		boolean finSemana = leer.nextBoolean();
		
		
		
		
		double descuento10 = compra*0.10;
		double descuento5 = compra*0.05;
		int gastoGestion = compra+2;
		
		switch (vip) {
			case 1:
				if (finSemana==true && compra>=150) {
				System.out.println("Oferta especial. El precio final es: " + (compra-descuento10));
				} else if (compra>=100){
				System.out.println("El precio final es: " + (compra-descuento10));
				} else if (compra<=50) {
					System.out.println("El precio final es: " + (gastoGestion));
				} 
				if (finSemana==false && compra>=150) {
					System.out.println("Oferta especial. El precio final es: " + (compra-descuento10));
					} else if (compra>=100){
					System.out.println("El precio final es: " + (compra-descuento10));
					} else if (compra<=50) {
						System.out.println("El precio final es: " + (gastoGestion));
					}
				break;
			case 2:
				if (compra>=200) {
				System.out.println("El precio final es: " + (compra-descuento5));
				} else if (compra<=50) {
					System.out.println("El precio final es: " + (compra+gastoGestion));
				} else {
					System.out.println("El precio final es: " + (compra));
				} 
				break;
		}
		
		
	leer.close();
	}

}
