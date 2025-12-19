package operadoresMatematicos;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Operadores matematicos
		System.out.println("Operadores matemáticos: ");

		int a = 10;
		int b = ++a;

		System.out.println("a=" + a + " b=" + b);

		a = 10;
		b = a++;

		System.out.println("a=" + a + " b=" + b);

		a = 10;
		b = --a;

		System.out.println("a=" + a + " b=" + b);

		a = 10;
		b = a--;

		System.out.println("a=" + a + " b=" + b);

		// Operadores relacionales

		int c = 10, d = 3;

		boolean esMayor = (c > d);
		boolean esIgual = (c == d);
		boolean esDistinto = (c != d);
		System.out.println("Operadores relacionales. C=10 y D=3: ");
		System.out.println("¿c es mayor? " + esMayor);
		System.out.println("¿Es igual a y d? " + esIgual);
		System.out.println("¿Son distintos c y d? " + esDistinto);
		
		// Operadores lógicos
		
		boolean condicion1 = (a > 3);
		boolean condicion2 = (d < 3);
		
		boolean ambas = condicion1 && condicion2; // AND
		boolean una = condicion1 || condicion2; // OR
		boolean negada = !condicion1; // NOT
		
		System.out.println("Operadores lógicos. a = 10 d = 3");
		System.out.println("¿a > 3 y d < 3? " + ambas);
		System.out.println("¿a > 3 o d < 3? " + una);
		System.out.println("Negación de ( a > 3) " + negada);
		
		/*
		 * Cuando && si uno es falso, el resto es falso
		 * Cuando es || si uno es verdadero, el resultado es verdadero*/
		
		
	}

}
