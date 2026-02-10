package Ejer3_herencias;

public class Cuenta_ahorros extends Cuenta {
	private boolean estado = cambioEstado();
	
	Cuenta_ahorros(){
		
	}
	
	public Cuenta_ahorros(float saldo, float tas){
		super(saldo, tas);
	}
	
	@Override
	void ingresarDinero(int ingreso) {
		if(estado) {
			super.ingresarDinero(ingreso);	
		} else {
			System.out.println("La cuenta se encuentra desactivada");
		}
	}

	@Override
	void retiradaDinero(int retirada) {
		if(estado) {
			super.retiradaDinero(retirada);
		} else {
			System.out.println("La cuenta se encuentra desactivada");
		}
	}

	@Override
	void extractoMensual() {
		if(super.num_retiradas>4) {
			super.comision+=100;
		}
		cambioEstado();
	}

	@Override
	void muestra() {
		System.out.println("Saldo de la cuenta actual: " + saldo
		+ " y la comisión es de : " + comision + ", se han realizado"
		+ (num_ingresos+num_retiradas) + " transacciones.");
	}
	
	private boolean cambioEstado() {
		if(this.saldo<1000) {
			return false;
		} else {
			return true;
		}
	}
	
	

}
