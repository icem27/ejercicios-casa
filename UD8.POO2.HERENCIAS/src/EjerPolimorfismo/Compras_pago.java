package EjerPolimorfismo;

public class Compras_pago {
	protected double importe;

	public Compras_pago(double importe) {
		this.importe = importe;
	}
	
	void realizarPago() {
		System.out.println("Pago de " + importe + "€ realizada");
	}
}
