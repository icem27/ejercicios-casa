package EjercicioHerencia;

public class Circulo extends Figura {
	private int radio;
	
	Circulo(){
		this.radio=5;
	}
	
	@Override
	void calcularArea() {
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El área es " + area);
	}
	
	@Override
	void mostrarNombre() {
		System.out.println("Círculo");
	}
}
