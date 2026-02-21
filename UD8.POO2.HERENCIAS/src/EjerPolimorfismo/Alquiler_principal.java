package EjerPolimorfismo;

public class Alquiler_principal {

	public static void main(String[] args) {
		Alquiler_vehiculos[] alquiler = new Alquiler_vehiculos[8];
		alquiler[0] = new Alquiler_coches("BMW", 5, 2020, Alquiler_combustion.HIBRIDO, false);
		alquiler[1] = new Alquiler_furgonetas("VW", 6, 2024, true);
		alquiler[2] = new Alquiler_microbus("Pegaso", 15, 2010);
		
		for(Alquiler_vehiculos d:alquiler) {
			if(d!=null) {
				System.out.println(d);
				System.out.println("===========================");
			}
		}
	}

}
