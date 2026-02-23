package EjerInventario;

public class Lechuga extends Planta{
	public static final int MAX_LECHUGAS = 10;
	public static int totalLechugas = 0;
	public TipoLechuga tipo;
	private static double COSTO_TOMATE=0.3;

	Lechuga(TipoLechuga tipo) {
		super(COSTO_TOMATE);
		this.tipo=tipo;
		totalLechugas++;
	}

	public static int getTotalLechugas() {
		return totalLechugas;
	}

	public void setTotalLechugas(int totalLechugas) {
		this.totalLechugas = totalLechugas;
	}
	

	@Override
	public void cosechar() {
		if(!this.isPlantada()) {
			System.out.println("La lechuga no se puede cosechar porque ya ha sido recogido");
		} else {
			if(getSemana()>=5) {
				super.setPlantada(false);
				System.out.println("Lechuga cosechado");
			} else {
				System.out.println("La lechuga no está suficientemente maduro");
			}
		}
	}
	@Override
	public String estado() {
		String estadoT="";
		if(getSemana()<2) {
			estadoT="Tierna";
		} else if (getSemana()<4) {
			estadoT="En crecimiento";
		} else {
			estadoT="Maduro (Listo para cosechar)";
		}
		
		return estadoT;
	}

	public TipoLechuga getTipo() {
		return tipo;
	}

	public void setTipo(TipoLechuga tipo) {
		this.tipo = tipo;
	}

	public static double getCOSTO_TOMATE() {
		return COSTO_TOMATE;
	}

	public static void setCOSTO_TOMATE(double cOSTO_TOMATE) {
		COSTO_TOMATE = cOSTO_TOMATE;
	}

	public static int getMaxLechugas() {
		return MAX_LECHUGAS;
	}
	
	@Override
	public String mostrarPlanta() {
		if(isPlantada()) {
		double beneficio=tipo.getPrecio()-calcularCostoTotal();
		String descripcion=tipo.name() + " " + estado() + " su venta generará " + beneficio +"€ de geneficio";
		return descripcion;
		} else {
			return "Cosechada";
		}
	}
	
}
