package RepasoJedi;

public class Ejercicio_4 {
	/*
	 * Realiza un programa que calcule el porcentaje de descuento que nos han hecho
	 * al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad
	 * con el descuento aplicado.
	 * 
	 * Se debe crear una función a la que le pasemos ambos valores y nos devuelva el
	 * descuento.
	 */

	public static void main(String[] args) {
		double compra=70.98;
		double compraConDescuento=50.99;
		double descuento = (100-calculaDescuento(compra, compraConDescuento));
		System.out.printf("El precio original es de %.2f€\nCon el descuento de %.2f%%\nSe queda en %.2f€",compra, descuento, compraConDescuento );
		

	}
	public static double calculaDescuento(double sinDescuento, double conDescuento) {
		return (conDescuento*100)/sinDescuento;
	}

}
