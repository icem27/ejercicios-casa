package Tema8_11;

public class MisionPrehistorica extends Mision implements PreparacionEquipamiento {
	private int epocaAprox;
	private final int CRONES_POR_DIA = 3;
	
	public MisionPrehistorica(String codigo, String nombre, int duracionDias, int numeroViajeros, EstadoMision estado, int epocaAprox) {
		super(codigo, nombre, duracionDias, numeroViajeros, estado);
		this.epocaAprox = epocaAprox;
	}
	
	public int calcularCronesConsumidos() {
		return getDuracionDias() * getNumeroViajeros() * CRONES_POR_DIA;
	}
	
	@Override
	public String toString() {
		return this.getCodigo()+", " + this.getNombre() +", " + this.getDuracionDias() +" dias, " + this.getNumeroViajeros() +" viajeros, " +
				   epocaAprox + " a.C.";
	}
	public int getCRONES_POR_DIA() {
		return CRONES_POR_DIA;
	}

	@Override
	public void preparacion() {
		System.out.println("Preparando utensilios y trajes de protección primitiva para Caza de Mammut");
	}
}
