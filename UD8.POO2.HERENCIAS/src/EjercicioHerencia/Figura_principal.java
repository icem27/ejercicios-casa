package EjercicioHerencia;

public class Figura_principal {

	public static void main(String[] args) {
//		Circulo cir = new Circulo(5);
//		Rectangulo rec = new Rectangulo(5, 10);
//		cir.CalcularArea();
//		rec.calcularArea();
		Circulo cir = new Circulo();
		cir.calcularArea();
		cir.mostrarNombre();
		
		Rectangulo r1 = new Rectangulo();
		r1.calcularArea();
		r1.mostrarNombre();
	
	}

}
