package EjercicioHerencia;

public class Alimento extends Producto {
	private int peso;

	public Alimento(String nombre, double precio, int stock, int peso) {
		super(nombre, precio, stock);
		this.peso = peso;
	}
	
	public void mostrarInto() {
		super.mostrarInfo();
		System.out.println("El preso del alimento es de: " + peso + " gramos");
	}

}
