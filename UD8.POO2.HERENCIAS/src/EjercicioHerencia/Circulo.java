package EjercicioHerencia;

public class Circulo extends Figura {
	private int radio;
	
	public Circulo(int radio) {
		super();
		this.radio = radio;
	}

	public void CalcularArea() {
		super.calcularArea();
		System.out.println(Math.PI * Math.pow(radio, 2));
	}
}
