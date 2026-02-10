package Ejer3_herencias;

public class Cuenta {
	protected float saldo;
	protected int num_ingresos = 0;
	protected int num_retiradas = 0;
	protected float tas;
	protected float comision = 0;
	
	Cuenta(){
		
	}
	
	public Cuenta(float saldo, float tas) {
		this.saldo = saldo;
		this.tas = tas;
	}
	
	void ingresarDinero(int ingreso) {
		this.saldo+=ingreso;
	}
	
	void retiradaDinero(int retirada) {
		this.saldo-=retirada;
	}
	
	void calcularInteres() {
		this.saldo+=(saldo*tas);
	}
	
	void extractoMensual() {
		this.saldo-=comision;
		calcularInteres();
	}
	
	void muestra() {
		System.out.println("Saldo actual: " + saldo
				+ " con " + num_ingresos + " número de ingresos y "
				+ num_retiradas + " número de retiradas.\n" 
				+ tas + "% es la tasa actual y la comisión " + comision);
	}
	

}
