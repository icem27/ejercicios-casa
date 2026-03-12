package Tema8_11;

public class MisionFuturista extends Mision implements AutomatizarRobot, InformeMisiones {
	private int anioFuturo;
	private int elementosTecnologicos;
	private final int CRONES_POR_DIA = 4;
	

	public MisionFuturista(String codigo, String nombre, int duracionDias, int numeroViajeros, EstadoMision estado
			, int anioFuturo, int elementosTecnologicos) {
		super(codigo, nombre, duracionDias, numeroViajeros, estado);
		this.anioFuturo = anioFuturo;
		this.elementosTecnologicos = elementosTecnologicos;
	}
	
	@Override
	public int calcularCronesConsumidos() {
		return getDuracionDias() * getNumeroViajeros() * CRONES_POR_DIA;
	}
	
	public void exploracion() {
		// TODO Auto-generated method stub
		System.out.println("Explorando nuevos territorios en el año " + anioFuturo);
	}

	@Override
	public String toString() {
		return this.getCodigo()+", " + this.getNombre() +", " + this.getDuracionDias() +" dias, " + this.getNumeroViajeros() +" viajeros, " +
				 " año " + anioFuturo + ", "  + elementosTecnologicos + " elementos tecnológicos" ;
	}

	public int getCRONES_POR_DIA() {
		return CRONES_POR_DIA;
	}

	@Override
	public void informe() {
		System.out.println("Recolectadores 50 elementos tecnológicos en el año 2150 con " + getNumeroViajeros() + " viajeros");
	}
	
	
}