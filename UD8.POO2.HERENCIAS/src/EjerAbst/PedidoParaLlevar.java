package EjerAbst;

public class PedidoParaLlevar extends Pedido {

	private static final double RECARGO = 4.5;
	
	PedidoParaLlevar(int numPedido, double precioBase) {
		super(numPedido, precioBase);
	}

	@Override
	public double calcularPrecioFinal() {
		return super.getPrecioBase()+RECARGO;
	}

}
