package ArraysRepaso;

public class Jugador_principal {

	public static void main(String[] args) {
		Jugador[] jugadores = new Jugador[5];
		jugadores[0] = new Jugador("Ismael", 15);
		jugadores[1] = new Jugador("Chaniel", 5);
		jugadores[2] = new Jugador("Yukai", 20);
		jugadores[3] = new Jugador("Xavi", 19);
		jugadores[4] = new Jugador("Ruth", 4);
		
		Jugador max = jugadores[0];
        for (int i=0;i<jugadores.length;i++) {
            if (jugadores[i].getGolesMarcados() > max.getGolesMarcados()) {
                max = jugadores[i];
            }
        }
        System.out.println(max.getNombre() + " con " + max.getGolesMarcados() + " goles.");


	}

}
