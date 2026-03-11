package EscuelaMagia;

public class MagoFuego extends MagoElemental {
	double superficieQuemada;
	
	public MagoFuego(String nombre, double superficieQuemada) {
		super(nombre);
		this.superficieQuemada = superficieQuemada;
	}



	@Override
	String lanzarHechizo() {
		return " lanza fuego y quema " + superficieQuemada + "²";
	}

	public double getSuperficieQuemada() {
		return superficieQuemada;
	}

	public void setSuperficieQuemada(double superficieQuemada) {
		this.superficieQuemada = superficieQuemada;
	}
	
	@Override
	public String capacidades() {
		return nombre + " - Superficie: " + superficieQuemada + "²";
	}

}
