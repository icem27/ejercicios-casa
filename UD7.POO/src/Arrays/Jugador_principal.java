package Arrays;

public class Jugador_principal {

	public static void main(String[] args) {
		Jugador[] jugadores = new Jugador[5];
		jugadores[0] = new Jugador("Ismael", 15);
		jugadores[1] = new Jugador("Chaniel", 5);
		jugadores[2] = new Jugador("Yukai", 2);
		jugadores[3] = new Jugador("Xavi", 0);
		jugadores[4] = new Jugador("Ruth", 4);
		
		for(int i=0;i<jugadores.length;i++) {
			int max=Math.max(jugadores[0].getGolesMarcados(), -1);
			if(max<=jugadores[i].getGolesMarcados()) {
				System.out.println("El máximo goleador es "  + jugadores[i].getNombre() + " con " + jugadores[i].getGolesMarcados() + " goles.");
			}
		}

	}

}
