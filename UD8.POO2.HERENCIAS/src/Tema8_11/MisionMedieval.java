package Tema8_11;

public class MisionMedieval extends Mision implements InformeMisiones, PreparacionEquipamiento {
	private String reinoTerrenoVisitado;
	private int momentosObservados;
	private final int CRONES_POR_DIA = 5;
	
	public MisionMedieval(String codigo, String nombre, int duracionDias, int numeroViajeros, EstadoMision estado, String reinoTerrenoVisitado, int momentosObservados) {
		super(codigo, nombre, duracionDias, numeroViajeros, estado);
		this.reinoTerrenoVisitado = reinoTerrenoVisitado;
		this.momentosObservados = momentosObservados;
	}
	
	public int calcularCronesConsumidos() {
		return getDuracionDias() * getNumeroViajeros() * CRONES_POR_DIA;
	}
	
	@Override
	public String toString() {
		return this.getCodigo()+", " + this.getNombre() +", " + this.getDuracionDias() +" dias, " + this.getNumeroViajeros() +" viajeros, " +
				reinoTerrenoVisitado + ", " + momentosObservados + " momentos históricos";
	}

	public int getCRONES_POR_DIA() {
		return CRONES_POR_DIA;
	}

	@Override
	public void informe() {
		System.out.println("Informe prehistórico: Observadas pinturas rupestres en el 12000 a.C con " + getNumeroViajeros() + " viajeros");
		
	}

	@Override
	public void preparacion() {
		System.out.println("Preparando armaduras y mapas históricos para Batalla de los Reinos");
		
	}
	
	
}
