package EscuelaMagia;

public class MagoAire extends MagoElemental {
	int velocidadAtaque;

	
	
	public MagoAire(String nombre, int velocidadAtaque) {
		super(nombre);
		this.velocidadAtaque = velocidadAtaque;
	}

	@Override
	String lanzarHechizo() {
		return " lanza un hechizo de aire a " + velocidadAtaque;
		
	}

	public int getVelocidadAtaque() {
		return velocidadAtaque;
	}

	public void setVelocidadAtaque(int velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
	}
	
	
	
	
}
