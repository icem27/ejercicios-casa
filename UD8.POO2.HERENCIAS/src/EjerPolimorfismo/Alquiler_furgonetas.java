package EjerPolimorfismo;

public class Alquiler_furgonetas extends Alquiler_vehiculos {
	private boolean cubierta;
	
	public Alquiler_furgonetas() {
	}

	public Alquiler_furgonetas(String marca, int n_asientos, int anio_matriculacion, boolean cubierta) {
		super(marca, n_asientos, anio_matriculacion);
		this.cubierta = cubierta;
	}
	
	private String esCubierta() {
		if(cubierta) {
			return "Si";
		} else {
			return "No";
		}
	}
	
	@Override
	public String toString() {
		return "Furgoneta matriculada en " + anio_matriculacion
				+ "\nMarca: " + marca + "\nCapacidad: " + n_asientos
				+ "\nCubierta: " + esCubierta();
	}
	
	
}
