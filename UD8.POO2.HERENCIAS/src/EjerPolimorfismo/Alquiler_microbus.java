package EjerPolimorfismo;

public class Alquiler_microbus extends Alquiler_vehiculos{
	
	public Alquiler_microbus() {
		
	}

	public Alquiler_microbus(String marca, int n_asientos, int anio_matriculacion) {
		super(marca, n_asientos, anio_matriculacion);
	}
	
	@Override
	public String toString() {
		return "Microbús matricula en " + anio_matriculacion
				+ "\nMarca: " + marca + "\nCapacidad: " + n_asientos;
	}
	
}
