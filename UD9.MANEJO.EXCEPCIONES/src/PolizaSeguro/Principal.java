package PolizaSeguro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		Cliente[] clientes = new Cliente[10];
//		clientes[0] = new Cliente("Ismael", 17, "23216546A");
//		clientes[1] = new Cliente("Javier", 39, "23216546A");
//		clientes[2] = new Cliente("Chaniel", 68, "23216546A");
//		try {
//			clientes[0].edadIncorrecta();
//		} catch (edadEnRango x) {
//			System.out.println(x.getMessage());
//		}
//		if(clientes!=null) {
//			clientes[0].cuotasClientes();
//			clientes[1].cuotasClientes();
//			clientes[2].cuotasClientes();
//		}
		int num = introducirNumClientes();
		System.out.println("vas a introducir " + num + " clientes");
		ClienteMio[] clientes = new ClienteMio[num];
		cargarListaClientes(clientes);
		System.out.println("La media de edad es de:  " + calcularMedia(clientes));
		mayorYmenor(clientes);
//		String nombre=capturarNombre();
//		System.out.println("Te llamas: " + nombre);
		
	}

	public static int introducirNumClientes() {
		int numClientes = 0;
		boolean correcto = false;
		do {
			System.out.println("Cuántos clientes vas a introducir?");
			try {
				numClientes = sc.nextInt();
				correcto = (numClientes > 0);
			} catch (InputMismatchException ex) {
				sc.nextLine();
			}
		} while (!correcto);
		return numClientes;
	}
	
	public static String capturarNombre() {
		String nombre="";
		boolean correcto=false;
		do {
		System.out.println("Introduce el nombre del cliente: ");
		nombre=sc.next();
		for(int i=0;i<nombre.length();i++) {
			char letra=nombre.charAt(i);
			if(!Character.isAlphabetic(letra) && letra !=' ') {
				nombre="";
				break;
			}
		}
		if (nombre.length()==0) {
			System.out.println("El nombre no es válido");
			sc.nextLine();
		} else {
			correcto=true;
		}
		} while(!correcto);
		
		return nombre;
	}
	
	public static int capturarEdad() {
		int edad=0;
		boolean correcto =false;
		do {
			System.out.println("Edad del clientes: ");
			try {
				edad=sc.nextInt();
				correcto = (edad >=18 && edad <=65);
			} catch (InputMismatchException ex) {
				sc.nextLine();
			}
		} while(!correcto);
		return edad;
	}
	
	public static void cargarListaClientes(ClienteMio[] clientes) {
		for(int i=0;i<clientes.length;i++) {
			System.out.println("Introduce el clientes número " + (i+1));
			String nombre=capturarNombre();
			int edad = capturarEdad();
			String nie = sc.nextLine();
			clientes[i] = new ClienteMio(nombre, edad, nie);
			System.out.println("La cuota es de: " + clientes[i].cuotasClientes());;
		}
	}
	
	public static double calcularMedia(ClienteMio[] clientes) {
		double media=0;
		for(int i=0;i<clientes.length;i++) {
			media+=clientes[i].getEdad();
		}
		return (media/clientes.length);
	}
	
	public static void mayorYmenor(ClienteMio[] clientes) {
		int max=clientes[0].getEdad();
		int min=clientes[0].getEdad();
		for(int i=0;i<clientes.length;i++) {
			if(max<clientes[i].getEdad()) {
				max=clientes[i].getEdad();
			}
			if(min>clientes[i].getEdad()) {
				min=clientes[i].getEdad();
			}
		}
		System.out.println("El mayor es: " + max);
		System.out.println("El monor es: " + min);
	}

}
