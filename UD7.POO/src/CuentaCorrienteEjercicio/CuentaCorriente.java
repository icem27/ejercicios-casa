package CuentaCorrienteEjercicio;

import java.util.Scanner;

public class CuentaCorriente {
	String nombre;
	String apellidos;
	String dni;
	String direccion;
	long numCuenta;
	double saldo;
	
	double ingresarDinero(double importe) {
		saldo+=importe;
		return saldo;
	}
	double sacarDinero(double importe) {
		while(importe-saldo>0) {
			System.out.println("No puede sacar dinero que no tienes");
			return saldo;
		}
		
		saldo -= importe;
		return saldo;
	}
	void mostrarSaldo() {
		System.out.println("Su salgo actual es de: " + String.format("%.2f€", saldo));
	}
	void modificarDatosCuenta() {
		System.out.println("Datos de la cuenta: ");
		System.out.println("Nombre titular: " + nombre);
		System.out.println("Apellidos titular: " + apellidos);
		System.out.println("DNI titular: " + dni);
		System.out.println("Dirección titular: " + direccion);
		System.out.println("Número de la cuenta: " + numCuenta);
		System.out.println("Salgo actual: " + String.format("%.2f€", saldo));
		Scanner leer=new Scanner(System.in);
		System.out.println("¿Qué quieres modificar? (1-Nombre, 2-Apellidos, 3-DNI, 4-Dirección)" );
		int opcion=leer.nextInt();
		leer.nextLine();
		switch (opcion) {
		case 1: 
			System.out.println("Introduce el nombre: ");
			nombre=leer.nextLine();
			System.out.println("El nombre ahora es: " + nombre);
			break;
		case 2: 
			System.out.println("Introduce los apellidos: ");
			apellidos=leer.nextLine();
			System.out.println("Los nuevos apellidos ahora es: " + apellidos);
			break;
		case 3: 
			System.out.println("Introduce el DNI: ");
			dni=leer.nextLine();
			System.out.println("El nuevo DNI: " + dni);
			break;
		case 4: 
			System.out.println("Introduce la dirección: ");
			direccion=leer.nextLine();
			System.out.println("La nueva direccion ahora es: " + direccion);
			break;
		default:
			System.out.println("Opción no valida");
		}
	}
	
}
