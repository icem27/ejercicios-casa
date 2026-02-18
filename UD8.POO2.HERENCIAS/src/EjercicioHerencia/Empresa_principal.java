package EjercicioHerencia;

import java.util.Scanner;

public class Empresa_principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Empresa_Empleado em1 = new Empresa_Empleado("Juan Carlos Gonzalez", "13019283X", 27, true, 2896);
//		System.out.println(em1);
//		System.out.println("======================================");
//		Empresa_Programador pr1 = new Empresa_Programador("Carlos Perez Perez", "0195846J", 27, false, 1845, 12, 1);
//		System.out.println(pr1);
		Empresa_Empleado[] empleado = new Empresa_Empleado[100];

		int opcion;
		do {
		opcion=menu(sc);
		sc.nextLine();
		switch(opcion) {
		case 1: 
			alta_empleado(sc, empleado);
			break;
		case 2:
			for(int i=0;i<empleado.length;i++) {
			if(empleado[i]!=null) {
				System.out.println(empleado[i]);
			}
		}
			break;
		case 3:
			System.out.println("Hasta la próxima!");
			break;
		default: 
			System.out.println("Debes introducir la opción 1 o 2");
		}
		} while(opcion!=3);
	}
	
	public static int menu(Scanner sc) {
		System.out.println("Bienvenido al Sistema de gestión: ");
		System.out.println("1.-Alta del empleado");
		System.out.println("2.-Mostrar empleados en el sistema");
		System.out.println("3.-Salir");
		return sc.nextInt();
	}
	
	public static void alta_empleado(Scanner sc, Empresa_Empleado[] emple) {
		System.out.println("Introduce la letra \"E\" para empleados y la letra \"P\" para programador.");
		char tipo_empleado = sc.nextLine().charAt(0);
		System.out.println("Introduce el nombre y apellido: ");
		String nombre=sc.nextLine();
		System.out.println("Introduce el DNI: ");
		String dni=sc.nextLine();
		System.out.println("Introduce la edad: ");
		int edad=sc.nextInt();
		System.out.println("Estado civil: [Casado|Soltero]");
		String estado_civil = sc.nextLine();
		sc.nextLine();
		System.out.println("Salario: ");
		int salario = sc.nextInt();
		for(int i=0;i<emple.length;i++) {
			if(tipo_empleado=='E') {
				if(emple[i]==null) {
					emple[i] = new Empresa_Empleado(nombre, dni, edad, false, salario);
					break;
				}
			} else if (tipo_empleado=='P') {
				System.out.println("Introduce las lineas de programación por hora:");
				int lineasPorHora = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce el lenguaje de programación que dominas: ");
				String lenguajeDominante = sc.nextLine();
				if(emple[i]==null) {
					emple[i] = new Empresa_Programador(nombre, dni, edad, false, salario, lineasPorHora, lenguajeDominante);
					break;
				}
			} else {
				System.out.println("La opción que has introducido no es valida. ");
			}
		}
	}

}
