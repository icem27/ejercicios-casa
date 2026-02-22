package EjerPolimorfismo;

public class Alquiler_gestionGarage {
	private Alquiler_coches[] coches = new Alquiler_coches[5];
	private Alquiler_furgonetas[] furgon = new Alquiler_furgonetas[2];
	private Alquiler_microbus[] microBus = new Alquiler_microbus[1];
	
	int numCoche = 0;
	int numFurgo = 0;
	int numMicro = 0;
	
	public void AltaCoches(Alquiler_coches coche) {
		if(numCoche < coches.length) {
			coches[numCoche]=coche;
			numCoche++;
		} else {
			System.out.println("No puedes dar de alta mas coches, el garage esta lleno");
		}
	}
	
	public void altaFurgo(Alquiler_furgonetas furgo) {
		if(numFurgo < furgon.length) {
			furgon[numFurgo]=furgo;
			numFurgo++;
		} else {
			System.out.println("No puedes dar de alta mas furgonetas, el garage esta lleno");
		}
	}
	
	public void AltaMicro(Alquiler_microbus micro) {
		if(numMicro < microBus.length) {
			microBus[numMicro]=micro;
			numMicro++;
		} else {
			System.out.println("No puedes dar de alta mas microbuses, el garage esta lleno");
		}
	}
	
	public void mostrarGarate() {
		for(Alquiler_coches coche:coches) {
			if(coche!=null) {
				System.out.println(coche); 
				System.out.println("==================");
			}
		}
		
		for(Alquiler_furgonetas furgo:furgon) {
			if(furgo!=null) {
				System.out.println(furgo);
				System.out.println("==================");
			}
		}
		
		for(Alquiler_microbus micro:microBus) {
			if(micro!=null) {
				System.out.println(micro);
				System.out.println("==================");
			}
		}
	}
	
}
