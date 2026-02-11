package Ejer3_herencias;

public class Cuenta {
	protected float saldo;
	protected int num_ingresos;
	protected int num_retiradas;
	protected float tasa;
	protected float comision=0;
	
	Cuenta(float saldo, float tasa){
		this.saldo=saldo;
		this.tasa=tasa;
	}
	
	void ingresoDinero(float ingreso) {
		this.saldo+=ingreso;
	}
	
	void retirarDinero(float retiro) {
		this.saldo-=retiro;
	}
	

}
