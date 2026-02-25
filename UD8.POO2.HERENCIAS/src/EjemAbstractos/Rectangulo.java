package EjemAbstractos;

public class Rectangulo extends Figura {
	private double base;
	private double altura;
	
	Rectangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public double calcularArea() {
		return base*altura;
	}

}
