package EjerAbst;

public class Pedido_principal {
	public static void main(String[] args) {
		Pedido[] pedidos = new Pedido[3];
		pedidos[0] = new PedidoDomicilio(1, 35.5, 4.75);
		pedidos[1] = new PedidoEnLocal(2, 20);
		pedidos[2] = new PedidoParaLlevar(3, 4);
		
		double totalIngresados = 0;
		
		for(Pedido p: pedidos) {
			System.out.println("Pedido número " + p.getNumPedido() + " con un precio de " + p.calcularPrecioFinal());
			totalIngresados += p.calcularPrecioFinal();
		}
		
		System.out.println("Total ingresado es : " + totalIngresados);
	}
}
