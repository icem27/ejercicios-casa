package EjercicioHerencia;

public class Rectangulo extends Figura{
	private int base;
	private int altura;
	
	Rectangulo(){
		this.altura=10;
		this.base=5;
	}
	
	@Override
	void calcularArea() {
		System.out.println("Base x altura es " + base*altura);
	}
	
	@Override
	void mostrarNombre() {
		System.out.println("Rectangulo");
	}
	
}
