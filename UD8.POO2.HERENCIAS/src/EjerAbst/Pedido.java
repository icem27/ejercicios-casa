package EjerAbst;

public abstract class Pedido {
	private int numPedido;
	private double precioBase;
	public abstract double calcularPrecioFinal();
	
	Pedido(int numPedido, double precioBase){
		this.numPedido=numPedido;
		this.precioBase=precioBase;
	}
	
	public void mostrarDetalles() { 
		System.out.println("Número de pedido es: " + numPedido + " con un precio de " + precioBase + "€");
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public int getNumPedido() {
		return numPedido;
	}
	
	
	
}
