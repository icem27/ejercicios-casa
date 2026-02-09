package EjemplosHerencias;

public class Moto extends Vehiculo {
	private String tipoManillar;
	
	public String getTipoManillar() {
		return tipoManillar;
	}

	public void setTipoManillar(String tipoManillar) {
		this.tipoManillar = tipoManillar;
	}

	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Tipo de manillar: " + tipoManillar);
	}

}
