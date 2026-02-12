package Ejer3_herencias;

public class CuentaCorriente extends Cuenta{
	private float descubierto=0;
	
	CuentaCorriente(float saldo, float tasa){
		super(saldo, tasa);
	}
	
	void retirar(float retirada) {
		num_retiradas++;
		saldo-=retirada;
		if(saldo<=0) {
			descubierto=Math.abs(saldo);
		}
	}
	
	void ingreso(float dinero) {
		super.ingresoDinero(dinero);
		if(saldo>=0) {
			descubierto=0;
		} else {
			descubierto=Math.abs(saldo);
		}
	}
	
	@Override
	void imprimir() {
		super.imprimir(); System.out.println("Has realizado " + (num_ingresos+num_retiradas) + " operaciones");
		System.out.println("Descubierto: " + descubierto);
	}
	
	public static void main(String[] args) {
		CuentaCorriente c2=new CuentaCorriente(100, 2);
		c2.retirar(150);
		c2.retirar(50);
		c2.calcInteres();
		c2.imprimir();
	}

}
