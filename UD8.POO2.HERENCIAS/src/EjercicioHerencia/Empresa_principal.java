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
		
		System.out.println("ALTA EMPLEADOS: ");
		System.out.println("1.-Empleado");
		System.out.println("2.-Programador");
		int opcion=sc.nextInt();
		sc.nextLine();
		switch(opcion) {
		case 1: 
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
			Empresa_Empleado emp1 = new Empresa_Empleado(nombre, dni, edad, false, salario);
			break;
		case 2:
			break;
		default: 
			System.out.println("Debes introducir la opción 1 o 2");
		}
	}

}
