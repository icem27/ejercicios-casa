package EstructurasSecuenciales2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/****************** PROBLEMA *********************************/
		// Una tienda ofrece un descuento del 15% sobre el total de la compra 
		// y un cliente desea saber cuánto deberá pagar finalmente por su compra. 
		// El comprador introduce el importe del producto.

		/****************** ANÁLISIS *********************************/
		// Hay que solicitar un dato.
		// Datos de entrada: Precio del producto
		// Información de salida: El precio con el descuento final
		// Variables: dato y formula
		/****************** DISEÑO *********************************/
		// 1. Leer 1 numero
		// 2. Se realiza la formula y despues se da el resultado
		
		Scanner leer = new Scanner(System.in);
		
		double dato, formula;
		
		System.out.println("Introduce el precio del producto: ");
		dato = leer.nextDouble();

		formula= dato*0.15;
		System.out.println("Despues del descuento pagarás: " + (dato-formula));
		
		
	}

}
