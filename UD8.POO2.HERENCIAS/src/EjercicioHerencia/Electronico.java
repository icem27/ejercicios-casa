package EjercicioHerencia;

public class Electronico extends Producto{
	private int garantiaMeses;

	public Electronico(String nombre, double precio, int stock, int garantiaMeses) {
		super(nombre, precio, stock);
		this.garantiaMeses = garantiaMeses;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tiene una garantia de: " + garantiaMeses + " meses");
	}
}
