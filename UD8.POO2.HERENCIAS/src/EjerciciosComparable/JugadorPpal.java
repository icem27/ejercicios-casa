package EjerciciosComparable;

import java.util.Arrays;

public class JugadorPpal {

	public static void main(String[] args) {
		Jugador j1 = new Jugador("Ismael", 548);
		Jugador j2 = new Jugador("Juan", 548);
		Jugador j3 = new Jugador("Perla", 256);
		Jugador j4 = new Jugador("Sara", 356);
		Jugador j5 = new Jugador("Antonia", 264);
		
		Jugador[] jugadores = {j1, j2, j3, j4, j5};
		Arrays.sort(jugadores);
		
		for(Jugador j:jugadores) {
			System.out.println(j);
		}
		
	}

}
