package EjerciciosComparable;

import java.util.Arrays;

public class AlumnoPpal {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Ismael", 10);
		Alumno a2 = new Alumno("Ismael", 16);
		Alumno a3 = new Alumno("Ismael", 19);
		Alumno a4 = new Alumno("Ismael", 5);
		Alumno a5 = new Alumno("Ismael", 11);
		
		Alumno[] alumnos = {a1, a2, a3, a4, a5};
		Arrays.sort(alumnos);
		
		for(Alumno a:alumnos) {
			System.out.println(a);
		}

	}

}
