package Arrays;

public class Equipo_principal {

	public static void main(String[] args) {
		Equipo[] miEquipo = new Equipo[6];
		miEquipo[0] = new Equipo("Real Madrid C.F.", 15);
		miEquipo[1] = new Equipo("F.C. Barcelona", 16);
		miEquipo[2] = new Equipo("Real Oviedo", 13);
		miEquipo[3] = new Equipo("Betis palombié", 18);
		miEquipo[4] = new Equipo("Athletic Club de Bilbao", 8);
		miEquipo[5] = new Equipo("Girona", 11);
		
		Equipo equipoGanador = miEquipo[0];
		for(Equipo max:miEquipo) {
			if(max.getPartidosGanados() > equipoGanador.getPartidosGanados()) {
				equipoGanador = max;
			}
		}
		
		System.out.println("El equipo con mas partidos ganados es " + equipoGanador.getNombre() + " con " + equipoGanador.getPartidosGanados() + " goles");

	}

}
