package EjerPolimorfismo;

public class Compras_principal {

	public static void main(String[] args) {
		Compras_pago[] p1 = new Compras_pago[4];
		p1[0] = new Compras_pago(10);
		p1[0].realizarPago();
		p1[1] = new Compras_PagoTarjeta(12);
		p1[1].realizarPago();
		p1[2] = new Compras_PagoTransferencia(15);
		p1[2].realizarPago();
		p1[3] = new Compras_PagoTarjeta(25);
		p1[3].realizarPago();

	}

}
