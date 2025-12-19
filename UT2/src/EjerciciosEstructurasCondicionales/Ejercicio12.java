package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Elige tipo de envio: \n 1. Local(50€/g) \n 2. Nacional(100€/g) \n 3. Europea(150€/g) \n 4. Resto del mundo(200€/g) ");
		int envio = leer.nextInt();
		
		System.out.println("¿Cuanto peso enviarás? indicalo en gramos.");
		int peso = leer.nextInt();
		
		
		if (peso<5000) {
			switch (envio) {
			case 1: 
				System.out.println("El coste del envio es: " + peso*50 + " €");
				break;
			case 2: 
				System.out.println("El coste del envio es: " + peso*100 + " €");
				break;
			case 3: 
				System.out.println("El coste del envio es: " + peso*150 + " €");
				break;
			case 4: 
				System.out.println("El coste del envio es: " + peso*200 + " €");
				break;
			default:
				System.out.println("Tipo de envio selecionado no previsto.");
			}
		} else {
			System.out.println("Por motivos técnicos, no se pueden imprimir piezas que superen los 5 kg (5000 gramos).");
		}
		
		leer.close();
	}

}
