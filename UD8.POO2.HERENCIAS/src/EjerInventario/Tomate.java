package EjerInventario;

public class Tomate extends Planta{
	public static final int MAX_TOMATES = 8;
	public static int totalTamates = 0;
	
	public Tomate(TipoTomate tipo) {
		
	}

	public static int getTotalTamates() {
		return totalTamates;
	}

	public static void setTotalTamates(int totalTamates) {
		Tomate.totalTamates = totalTamates;
	}

	
}
