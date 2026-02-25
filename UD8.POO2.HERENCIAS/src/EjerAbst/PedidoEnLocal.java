package EjerAbst;

public class PedidoEnLocal extends Pedido {
	
	private static final double IMPORTE_PARA_DTO=50;
	private static final double DTO=10;
	
	public PedidoEnLocal(int numPedido, double precioBase) {
		super(numPedido, precioBase);
	}
	
	@Override
	public double calcularPrecioFinal() {
		double precioFinal=super.getPrecioBase();
		if(super.getPrecioBase()>=IMPORTE_PARA_DTO) {
			precioFinal = super.getPrecioBase() - super.getPrecioBase() * DTO / 100;
		}
		return precioFinal;
	}

}
