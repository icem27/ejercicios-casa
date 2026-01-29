package ArraysRepaso;

public class Habitacion {
	/*
	 * Crea una clase Habitacion con los atributos numero y ocupada (boolean). En el
	 * main, crea un array con 10 habitaciones, numeradas a partir del 100, marca
	 * aleatoriamente algunas como ocupadas y muestra cuántas están disponibles.
	 */
	
	private int numero;
	private boolean ocupada;
	
	public Habitacion(int numero, boolean ocupada) {
		this.numero = numero;
		this.ocupada = ocupada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", ocupada=" + ocupada + "]";
	}
	
	
	
	
	
	
}
