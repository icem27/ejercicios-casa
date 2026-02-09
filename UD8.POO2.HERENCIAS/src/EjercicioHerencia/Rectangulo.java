package EjercicioHerencia;

public class Rectangulo extends Figura{
	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public void mostrarArea() {
		this.calcularArea();
		System.out.println("");
	}
	
}
