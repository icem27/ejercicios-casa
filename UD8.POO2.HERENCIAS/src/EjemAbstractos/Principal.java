package EjemAbstractos;

public class Principal {

	public static void main(String[] args) {
		Figura f = new Circulo(2.5);
		
		System.out.println("El área del círculo es: " + f.calcularArea());
		
		Figura f2 = new Rectangulo(3,  2);
		
		System.out.println("El área del rectángulo es: " + f2.calcularArea());

	}

}
