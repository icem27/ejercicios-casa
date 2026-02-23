package EjerInventario;

public class Tomate extends Planta{
	public static final int MAX_TOMATES = 8;
	private static int totalTamates = 0;
	private TipoTomate tipo;
	private static double COSTO_TOMATE=0.5;
	
	public Tomate(TipoTomate tipo){
		super(COSTO_TOMATE);
		this.tipo=tipo;
		totalTamates++;
	}

	public static int getTotalTamates() {
		return totalTamates;
	}

	public static void setTotalTamates(int totalTamates) {
		Tomate.totalTamates = totalTamates;
	}
	
	@Override
	public void cosechar() {
		if(!this.isPlantada()) {
			System.out.println("El tomate no se puede cosechar porque ya ha sido recogido");
		} else {
			if(getSemana()>=6) {
				super.setPlantada(false);
				System.out.println("Tomate cosechado");
			} else {
				System.out.println("El tomate no está suficientemente maduro");
			}
		}
	}
	@Override
	public String estado() {
		String estadoT="";
		if(getSemana()<3) {
			estadoT="Verde";
		} else if (getSemana()<6) {
			estadoT="Madurando";
		} else {
			estadoT="Maduro (Listo para cosechar)";
		}
		
		return estadoT;
	}

	public TipoTomate getTipo() {
		return tipo;
	}

	public void setTipo(TipoTomate tipo) {
		this.tipo = tipo;
	}

	public static int getMaxTomates() {
		return MAX_TOMATES;
	}

	@Override
	public String mostrarPlanta() {
		if(isPlantada()) {
		double beneficio=tipo.getPrecio()-calcularCostoTotal();
		String descripcion=tipo.name() + " " + estado() + " su venta generará " + beneficio+"€ de geneficio";
		return descripcion;
		} else {
			return "Cosechada";
		}
	}
}
