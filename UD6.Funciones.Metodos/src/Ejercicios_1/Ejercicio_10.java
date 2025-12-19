package Ejercicios_1;

import java.util.Scanner;

public class Ejercicio_10 {
	/*
	 * Escribe un programa con diseño modular que presenta un menú con una serie de
	 * opciones correspondientes a operaciones aritméticas a realizar (suma, resta,
	 * multiplicación y división ) y luego solicita por teclado dos números enteros.
	 * 
	 * En función a la opción elegida se llamará a la función correspondiente que
	 * retorna el resultado de la operación para que la visualice el programa
	 * principal.
	 * 
	 * Una vez realizada la primera operación se le pregunta al usuario si quiere
	 * seguir realizando mas operaciones. En caso afirmativo se le volverá a
	 * visualizar el menú con las operaciones y en caso negativo se finalizará el
	 * programa.
	 * 
	 * Se tendrán que definir los métodos: mostrarMenu, calSuma, calResta,
	 * calDivision y calMultiplicacion. Se tendrá que evitar el error de división
	 * por cero
	 */
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int primer_valor;
		int segundo_valor;
		int operacion;
		int continuar=0;
		boolean operacionIncorrecta=false;
		do {
		mostrarMenu();
		operacion=leer.nextInt();

		System.out.println("Introduce el primer valor: ");
		primer_valor=leer.nextInt();
		System.out.println("Introduce el segundo valor: ");
		segundo_valor=leer.nextInt();
		
		
		switch(operacion) {
		case 1: 
			System.out.println(calSuma(primer_valor, segundo_valor));
			break;
		case 2: 
			System.out.println(calResta(primer_valor, segundo_valor));
			break;
		case 3: 
			System.out.println(calDivision(primer_valor, segundo_valor));
			break;
		case 4: 
			System.out.println(calMultiplicacion(primer_valor, segundo_valor));
			break;
		default:
			System.out.println("Debes elegir entre 1 y 4");	
		}
		
		if(!operacionIncorrecta) {
			System.out.println("¿Quieres continuar? [1-Si, 2-No]");
			continuar=leer.nextInt();
			debeSeguir(continuar);
		}
		} while (debeSeguir(continuar));
		System.out.println("Hasta la próxima!");
		
		leer.close();

	}
	static void mostrarMenu() {
		System.out.println("\n==================");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. División");
		System.out.println("4. Multiplicación");
		System.out.println("==================");
	}
	
	static int calSuma(int x, int y) {
		return x+y;
	}
	
	static int calResta(int x, int y) {
		return (x-y);
	}

	static double calDivision(int x, int y) {
		double div = (double)x/y;
		return div;
	}
	
	static int calMultiplicacion(int x, int y) {
		return (x*y);
	}
	
	static boolean debeSeguir(int x) {
		boolean resultado;
		if(x==1) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
