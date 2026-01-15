package NifEjercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
//		Nif miDNI = new Nif(14017386);
//		Nif miDNI2 = new Nif(60361798);
//		miDNI.CalcularLetra();
//		miDNI.mostrar();
//		miDNI2.CalcularLetra();
//		miDNI2.mostrar();

		Nif dniUsuario = new Nif();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de su DNI: ");
		dniUsuario.numero = sc.nextLong();
		sc.nextLine();
		System.out.println("Introduce la letra de su DNI: ");
		char letraUsuario = sc.nextLine().charAt(0);
		if(letraUsuario==dniUsuario.CalcularLetra()) {
			System.out.println("La letras es correcta");
		} else {
			System.out.println("La letra es incorrecta");
			System.out.println("La letra correcta es: " + dniUsuario.letra);
			System.out.print("El DNI completo y correcto es: ");
			dniUsuario.mostrar();
		}
	}

}
