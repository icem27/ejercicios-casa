package RepasoProg;

import java.util.Scanner;

public class Ejercicio_3NotasExamen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Inicializamos el array de nombres
		String[] alumno = nombreAlumnos(sc);
		// Inicializamos el array de notas
		double[][] alumnos = notaAlumno(sc, alumno);
		//Visalizamos el resultado
		for (int i = 0; i < alumno.length; i++) {
			System.out.printf("Alumno: %s - Media: %.2f\n", alumno[i], mediaAlumno(alumnos,i));
		}
		System.out.printf("Media de la clase: %.2f\n", mediaClase(alumnos));
		System.out.println("Mejor alumno: " + alumno[mejorAlumno(alumnos)]);
		sc.close();
	}
	
	public static String[] nombreAlumnos(Scanner sc) {
//		System.out.println("¿Cuantos alumnos son?");
//		int cantidad = sc.nextInt();
		int cantidad = esNumero(sc, "¿Cuantos alumnos son?");
//		sc.nextLine();
		String[] nombreAlumnos=new String[cantidad];
		for(int i=0;i<cantidad;i++) {
			System.out.print("Nombre del alumno número " + (i+1) + ": ");
			nombreAlumnos[i]=sc.nextLine();
		}
		return nombreAlumnos;
	}
	
	public static double mediaAlumno(double[][] notas, int alumno) {
		double sumaMediaAlumno=0;
		for(int i=0;i<notas[alumno].length;i++) {
			sumaMediaAlumno+=notas[alumno][i];
		}
		return sumaMediaAlumno/notas[alumno].length;
	}
	
	public static double mediaClase(double[][] notas) {
		double suma=0;
		int totalNotas=0;
		for(int i=0;i<notas.length;i++) {
			for(int j=0;j<notas[i].length;j++) {
				suma+=notas[i][j];
				totalNotas++;
			}
		}
		return suma/totalNotas;
	}
	
	public static int mejorAlumno(double[][] notas) {
		double media=-1;
		int mejorAlumno=0;
		for(int i=0;i<notas.length;i++) {
			double mediaAlumno = mediaAlumno(notas, i);
			if(media<mediaAlumno) mejorAlumno=i;
			media=mediaAlumno;
		}
		return mejorAlumno;
	}
	
	public static double[][] notaAlumno(Scanner sc, String[] alumno) {
		double[][] notas= new double[alumno.length][];
		for(int i=0;i<notas.length;i++) {
			System.out.println("Introduce el número de notas para el alumno " + alumno[i]+": ");
			int examenes=sc.nextInt();
			while(examenes<1 || examenes>5) {
				System.out.println("Solo puede introducir una cantidad entre 1 y 5 notas");
				examenes=sc.nextInt();
			}
			notas[i] = new double[examenes];
			for(int j=0;j<notas[i].length;j++) {
				System.out.println("Nota del examen número " + (j+1) +":");
				notas[i][j] = sc.nextDouble();
				while (notas[i][j] < 0 || notas[i][j] > 10) {
				    System.out.println("Nota inválida. Debe estar entre 0 y 10.");
				    notas[i][j]  = sc.nextDouble();
				}
			}
		}
		return notas;
	}
	
	public static int esNumero(Scanner sc, String mensaje) {
		System.out.println(mensaje);
		String texto = sc.nextLine();
		if(texto.length()!=0 || !Character.isDigit(texto.charAt(0))) {
			System.out.println("Debes introducir número");
		}
		return Character.getNumericValue(texto.charAt(0));
	}

}
