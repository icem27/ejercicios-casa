package EjercicioHerencia;

public class Producto_principal {

	public static void main(String[] args) {
		Electronico lavadora = new Electronico("Lavadora", 540, 20, 24);
		Alimento manzana = new Alimento("Manzana", 4.9, 24, 1000);
		lavadora.mostrarInfo();
		manzana.mostrarInto();

	}

}
