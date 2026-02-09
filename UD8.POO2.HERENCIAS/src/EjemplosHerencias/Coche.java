package EjemplosHerencias;

public class Coche extends Vehiculo {
	private int numPuertas;
	
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Puertas: " + numPuertas);
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	
	
}
