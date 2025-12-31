package Ejercicios_repaso;

public class Ejercicio_6 {
	/*
	 * Crea una función que reciba el precio de un producto y muestre el precio
	 * final: 10% de descuento si cuesta más de 100 5% si cuesta entre 50 y 100 Sin
	 * descuento si cuesta menos de 50
	 */
	public static void main(String[] args) {
		double precio=100;
		System.out.println(descuento(precio)+"€");
	}
	
	public static double descuento(double n) {
		if(n>=100) return (n-(n*0.1));
		else if (n>=50 && n<=100) return (n-(n*0.05));
		else return n;
}
}