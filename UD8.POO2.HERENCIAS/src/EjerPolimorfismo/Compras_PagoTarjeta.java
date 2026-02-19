package EjerPolimorfismo;

public class Compras_PagoTarjeta extends Compras_pago {

	public Compras_PagoTarjeta(double importe) {
		super(importe);
	}
	
	@Override
	void realizarPago() {
		System.out.println("Pago realizado por tarjeta " + importe + "€");
	}

}
