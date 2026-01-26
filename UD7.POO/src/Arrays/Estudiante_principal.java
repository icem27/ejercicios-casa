package Arrays;

import java.util.Scanner;

public class Estudiante_principal {

	public static void main(String[] args) {
		Estudiante[] estudiantes = new Estudiante[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<estudiantes.length;i++) {
			System.out.println("Introduce los datos del estudiante " + (i+1));
			System.out.println("Nombre: ");
			String nombre=sc.nextLine();
			System.out.println("Edad: ");
			int edad=sc.nextInt();
			System.out.println("Nota media: ");
			double nota=sc.nextDouble();
//			estudiantes[i] = new Estudiante(nombre, edad, nota);
			Estudiante estudiante = new Estudiante(nombre, edad, nota);
			estudiantes[i]= estudiante;
			sc.nextLine();
		}
		sc.close();
		
		System.out.println("Datos de los estudiantes: ");
		for(Estudiante estudiante:estudiantes) {
			System.out.println(estudiante);
		}
	}

}
