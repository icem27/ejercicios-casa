package Ejer3_herencias;

public class CuentaCorriente extends Cuenta{
	private float descubierto=0;
	
	CuentaCorriente(float saldo, float tasa){
		super(saldo, tasa);
	}
	
	void retirarDinero(float retirada) {
		float saltoAnterior=saldo;
		saldo-=retirada;
		if(saldo<=0) {
			descubierto+=(retirada-saltoAnterior);
			saldo=0;
		}
	}
	
	@Override
	void ingresoDinero(float ingreso) {
		if(descubierto>=0) {
			super.ingresoDinero((ingreso-descubierto));
			descubierto=0;
		} else {
			super.ingresoDinero(ingreso);
		}
	}
	
	@Override
	void extractoMensual() {
		super.extractoMensual();
	}
	
	@Override
	void imprimir() {
		super.imprimir(); System.out.println("Has realizado " + (num_ingresos+num_retiradas) + " operaciones");
		System.out.println("Descubierto: " + descubierto);
	}
	
	public static void main(String[] args) {
		CuentaCorriente c2=new CuentaCorriente(1000, 2);
		c2.retirarDinero(1300);
		c2.ingresoDinero(200);
		c2.calcInteres();
		c2.imprimir();
	}

}
