package EscuelaMagia;

public class MagoAire extends MagoElemental {
	double velocidadAtaque;
	
	public MagoAire(String nombre, double velocidadAtaque) {
		super(nombre);
		this.velocidadAtaque = velocidadAtaque;
	}

	@Override
	String lanzarHechizo() {
		return " lanza un hechizo de aire a " + velocidadAtaque + " Km/h";
		
	}

	public double getVelocidadAtaque() {
		return velocidadAtaque;
	}

	public void setVelocidadAtaque(double velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
	}
	
	@Override
	public String capacidades() {
		return nombre + " - Velocidad: " + velocidadAtaque + "Km/h";
	}
	
	
}
