package EjerciciosEstructurasCondicionales;

import java.util.Scanner;

public class reto1_1 {
	public static void main(String[] args) {

		 /****************** PROBLEMA *********************************/
		 // Preguntar al usuario cuántas monedas tiene de cada tipo:
		 // 2 €
		 // 1 €
		 // 50 céntimos
		 // 20 céntimos
		 // 10 céntimos
		 // Calcular el total de dinero que posee el usuario.
		 // Calcular cuántos billetes de 5 € completos le darían en el banco si llevara todo ese dinero.
		 // Calcular el dinero sobrante que no llega a formar un billete de 5 €.
		 // Mostrar toda la información de forma clara, indicando euros y céntimos.
		 /****************** ANÁLISIS *********************************/
		 // Hay que solicitar 5 tipos de datos, para cada moneda.
		 // Datos de entrada: 5 números
		 // Información de salida: 3 salidas, total de dinero, mas los billetes de cinco que hay y resto
		 // Variables: euro2,euro1, centimos5, centimos2, centimos1, centimos, euros, totalCentimos, totalEuros
		 /****************** DISEÑO *********************************/
		 // 1. Leer 5 números y dar el resultado para el usuario de cuanto tiene en total de euros y luego en céntimos. 


		 Scanner leer = new Scanner(System.in);

		 int euro1, euro2, centimos5, centimos2, centimos1, totalCentimos;

		 System.out.println("Introduce cuántas monedas de 2€ tienes: ");
		 euro2 = leer.nextInt();

		 System.out.println("Introduce cuántas monedas de 1€ tienes: ");
		 euro1 = leer.nextInt();

		 System.out.println("Introduce cuántas monedas de 50 céntimos tienes: ");
		 centimos5 = leer.nextInt();

		 System.out.println("Introduce cuántas monedas de 20 céntimos tienes: ");
		 centimos2 = leer.nextInt();

		 System.out.println("Introduce cuántas monedas de 10 céntimos tienes: ");
		 centimos1 = leer.nextInt();

		 totalCentimos = (euro2*200)+(euro1*100)+(centimos5*50)+(centimos2*20)+(centimos1*10);
		 float totalEuro= totalCentimos/100;
		 int resto = (totalCentimos%500)/100;
		 float billetes = (totalEuro - resto) / 5;


		 System.out.println("Total: " + totalEuro + " €");
		 System.out.println("Billetes de 5€: " + billetes);
		 System.out.println("Sobra: " + resto + " €");

		 leer.close();


		 }
}
