package RepasoFinal;

public class Atleta_principal {

	public static void main(String[] args) {
		Atleta[] equipo = new Atleta[4];
		equipo[0] = new Atleta("Antonio", 4.1);
		equipo[1] = new Atleta("Antonio", 2.2);
		equipo[2] = new Atleta("Antonio", 3.7);
		equipo[3] = new Atleta("Antonio", 5.8);

		for(Atleta mi:equipo) {
			System.out.println(mi);
		}
		System.out.println("Tiempo total por equipo: " + Atleta.tiempoEquipo + " del equipo: " + Atleta.equipoNombre());
	}

}
