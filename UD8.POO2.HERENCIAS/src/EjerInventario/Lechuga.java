package EjerInventario;

public class Lechuga extends Planta{
	public static final int MAX_LECHUGAS = 10;
	public static int totalLechugas = 0;

	public Lechuga(TipoLechuga tipo) {
		
	}

	public static int getTotalLechugas() {
		return totalLechugas;
	}

	public void setTotalLechugas(int totalLechugas) {
		this.totalLechugas = totalLechugas;
	}
	
	
	
}
