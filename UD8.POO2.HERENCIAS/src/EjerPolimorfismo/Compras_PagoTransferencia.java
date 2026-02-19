package EjerPolimorfismo;

public class Compras_PagoTransferencia extends Compras_pago {

	public Compras_PagoTransferencia(double importe) {
		super(importe);
	}
	
	@Override
	void realizarPago() {
		System.out.println("Pago realizado por transferencia " + importe + "€");
	}
}
