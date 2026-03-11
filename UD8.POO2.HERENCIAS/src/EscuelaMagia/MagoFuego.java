package EscuelaMagia;

public class MagoFuego extends MagoElemental {
	int superficieQuemada;
	
	public MagoFuego(String nombre, int superficieQuemada) {
		super(nombre);
		this.superficieQuemada = superficieQuemada;
	}



	@Override
	String lanzarHechizo() {
		return " lanza fuego y quema " + superficieQuemada;
	}

	public int getSuperficieQuemada() {
		return superficieQuemada;
	}

	public void setSuperficieQuemada(int superficieQuemada) {
		this.superficieQuemada = superficieQuemada;
	}
	
	

}
