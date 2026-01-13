package CuentaCorrienteEjercicio;

import java.util.Scanner;

public class CrearCuenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaCorriente miCuenta = new CuentaCorriente();
		miCuenta.nombre = "Yukai";
		miCuenta.apellidos = "Damas";
		miCuenta.dni = "164895852J";
		miCuenta.direccion = "Call Alcalá Nº90, CP: 28651, MADRID";
		miCuenta.numCuenta = 565656565656565656L;
		miCuenta.saldo = 500;
		
//		miCuenta.visualiza();
//		miCuenta.mostrarSaldo();
		int opcion;
		do {
		System.out.println("Bienvenido a tu banco.");
		System.out.println("¿Que desea realizar?");
		System.out.println("1. Sacar dinero");
		System.out.println("2. Ingresar dinero");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Modificar datos personales");
		System.out.println("5. Terminar");

		opcion = sc.nextInt();
		switch(opcion) {
		case 1: 
			System.out.println("¿Cuanto quieres sacar?");
			int importe = sc.nextInt();
			miCuenta.sacarDinero(importe);
			System.out.println("Operación realizada con éxito");
			break;
		case 2: 
			System.out.println("¿Cuanto dinero quiere ingresar?");
			importe = sc.nextInt();
			miCuenta.ingresarDinero(importe);
			System.out.println("Operación realizada con éxito");
			break;
		case 3: 
			miCuenta.mostrarSaldo();
			break;
		case 4: 
			miCuenta.modificarDatosCuenta();
			break;
		case 5: 
			System.out.println("Hasta la próxima!");
			break;
		default:
			System.out.println("La opción selecionada no existe");
		}
		}while(opcion!=5);
		
		
		sc.close();
	}

}
