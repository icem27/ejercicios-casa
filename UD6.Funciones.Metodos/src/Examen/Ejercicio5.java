package Examen;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] puntuaciones = {10,20,0,30,0,25};
		String[] nombres = {"CCB1","CCB2","CCB3","CCB4","CCB5","CCB6"};
		int mejorAgente = agenteMayorPuntuacion(puntuaciones);
		
		System.out.println("El mejor agente es " + nombres[mejorAgente]);

	}
	public static int agenteMayorPuntuacion(int[] puntuaciones) {
		int mejorAgente = 0;
		int maxPuntuacion = puntuaciones[0];
		
		for(int i=1; i<puntuaciones.length;i++) {
			if(puntuaciones[i]>maxPuntuacion) {
				maxPuntuacion = puntuaciones[i];
				mejorAgente = i;
			}
		}
		return mejorAgente;
	}
}
