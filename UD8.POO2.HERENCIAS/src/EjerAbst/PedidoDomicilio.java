package EjerAbst;

public class PedidoDomicilio extends Pedido {
	private double costeEnvio;
	
	PedidoDomicilio(int numPedido, double precioBase, double costeEnvio){
		super(numPedido, precioBase);
		this.costeEnvio=costeEnvio;
	}
	
	@Override
	public double calcularPrecioFinal() {
		return super.getPrecioBase()+costeEnvio;
	}

}
