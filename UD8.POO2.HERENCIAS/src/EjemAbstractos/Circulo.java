package EjemAbstractos;

public class Circulo extends Figura {
	private double radio ;
	Circulo(double radio){
		this.radio=radio;
	}
	
	@Override
	public double calcularArea() {
		double area=Math.PI*Math.pow(radio, 2);
		return area;
	}

}
