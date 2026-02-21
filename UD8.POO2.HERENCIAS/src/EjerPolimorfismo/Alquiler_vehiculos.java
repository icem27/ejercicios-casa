package EjerPolimorfismo;

public class Alquiler_vehiculos {
	protected String marca;
	protected int n_asientos;
	protected int anio_matriculacion;
	
	public Alquiler_vehiculos() {
		
	}
	
	public Alquiler_vehiculos(String marca, int n_asientos, int anio_matriculacion) {
		this.marca=marca;
		this.n_asientos=n_asientos;
		this.anio_matriculacion=anio_matriculacion;
	}

	@Override
	public String toString() {
		return "Alquiler_vehiculos [marca=" + marca + ", n_asientos=" + n_asientos + "]";
	}
	
	

}
