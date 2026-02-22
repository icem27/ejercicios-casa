package EjerPolimorfismo;

public class Alquiler_principal {

	public static void main(String[] args) {
//		Alquiler_vehiculos[] alquiler = new Alquiler_vehiculos[8];
//		alquiler[0] = new Alquiler_coches("BMW", 5, 2020, Alquiler_combustion.HIBRIDO, false);
//		alquiler[1] = new Alquiler_furgonetas("VW", 6, 2024, true);
//		alquiler[2] = new Alquiler_microbus("Pegaso", 15, 2010);
		
		Alquiler_gestionGarage garage = new Alquiler_gestionGarage();
		garage.AltaCoches(new Alquiler_coches("BMW", 5, 2020, Alquiler_combustion.HIBRIDO, false));
		garage.altaFurgo(new Alquiler_furgonetas("VW", 6, 2024, true));
		garage.AltaMicro(new Alquiler_microbus("Pegaso", 15, 2010));
		garage.AltaCoches(new Alquiler_coches("Audi", 5, 2025, Alquiler_combustion.GASOLINA, true));
		garage.mostrarGarate();
	}

}
