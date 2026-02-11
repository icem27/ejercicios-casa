package Ejer3_herencias;

public class CuentaCorriente extends Cuenta{
	private float descubierto=0;
	
	CuentaCorriente(float saldo, float tasa){
		super(saldo, tasa);
	}
	
	void retirarDinero(float retirada) {
		if(saldo<=0) {
			descubierto+=retirada;
		}
	}
	
	@Override
	void ingresoDinero(float ingreso) {
		if(descubierto>=0) {
			descubierto-=ingreso;
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

}
