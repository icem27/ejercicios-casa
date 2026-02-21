package EjerPolimorfismo;

public class Alquiler_coches extends Alquiler_vehiculos {
		private Alquiler_combustion combustion;
		private boolean descapotable;
		private int alta;
		
		public Alquiler_coches() {
			
		}

		public Alquiler_coches(String marca, int n_asientos, int anio_matriculacion,  Alquiler_combustion combustion, boolean descapotable) {
			super(marca, n_asientos, anio_matriculacion);
			this.combustion = combustion;
			this.descapotable = descapotable;
			alta++;
		}
		
		private String estaDescapotable() {
			if(descapotable) {
				return "Si";
			} else {
				return "No";
			}
		}
		
		@Override
		public String toString() {
			return "Coche matriculado en " + anio_matriculacion 
					+ "\nMarca: " + marca + "\nCapacidad: " + n_asientos
					+ "\nTipo: " + combustion + "\nDescapotable: " + estaDescapotable();
		}
		
		
		
}
