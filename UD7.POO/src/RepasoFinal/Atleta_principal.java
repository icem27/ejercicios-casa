package RepasoFinal;

public class Atleta_principal {

	public static void main(String[] args) {
		Atleta[] equipo = new Atleta[4];
		equipo[0] = new Atleta("Antonio", 4.1);
		equipo[1] = new Atleta("Manu", 2.2);
		equipo[2] = new Atleta("Paco", 3.7);
		equipo[3] = new Atleta("Torres", 5.8);

		for(Atleta mi:equipo) {
			System.out.println(mi);
		}
		System.out.println("Tiempo total por equipo: " + Atleta.tiempo() + " del equipo: " + Atleta.equipoNombre());
	}

}
