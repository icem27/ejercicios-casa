package RectanguloEjercicio;

import java.util.Scanner;

public class PintarRectangulos {

	public static void main(String[] args) {
		Rectangulo rectangulo= new Rectangulo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base y la altura del rectángulo: ");
		int base=sc.nextInt();
		int altura=sc.nextInt();
		rectangulo.base=base;
		rectangulo.altura=altura;
		System.out.println("Rectángulo con +");
		System.out.println("=====================");
		rectangulo.pintar();
		System.out.println("Introduce el caracter con el que quieres pintar: ");
		char signo = sc.next().charAt(0);
		System.out.println("Rectángulo con "+signo);
		System.out.println("=====================");
		rectangulo.pintarSigno(signo);
		System.out.println("Rectangulo invertido");
		System.out.println("=====================");
		rectangulo.invertir();
		
		System.out.println("El área de este rectangulo vale: " + rectangulo.area());
		System.out.println("El perimetro de este rectangulo vale: " + rectangulo.perimetro());
		sc.close();
	}

}
