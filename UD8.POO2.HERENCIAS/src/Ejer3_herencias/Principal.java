package Ejer3_herencias;

public class Principal {
	public static void main(String[] args) {
//		Cuenta c1 = new Cuenta(1000, 1);
//		c1.ingresarDinero(1000);
//		c1.retiradaDinero(100);
//		c1.calcularInteres();
//		c1.extractoMensual();
//		c1.muestra();
		Cuenta_ahorros c2 = new Cuenta_ahorros(1000, 1);
		c2.ingresarDinero(1200);
		c2.retiradaDinero(5);
		c2.calcularInteres();
		c2.muestra();
	}
}
