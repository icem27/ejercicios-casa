package Ejer3_herencias;

import java.util.Locale;

public class Cuenta {
	protected float saldo;
	protected int num_ingresos=0;
	protected int num_retiradas=0;
	protected float tasa;
	protected float comision=0;
	
	Cuenta(float saldo, float tasa){
		this.saldo=saldo;
		this.tasa=tasa;
	}
	
	void ingresoDinero(float ingreso) {
		this.saldo+=ingreso;
		num_ingresos++;
	}
	
	void retirarDinero(float retiro) {
		if(retiro<=saldo) {
			this.saldo-=retiro;
			num_retiradas++;
		} else {
			System.out.println("No se puede realizar la operación, no tiene suficientes fondos");
		}
	}
	
	void calcInteres() {
		this.saldo+=(saldo*(tasa/100))/12;
	}
	
	void extractoMensual() {
		this.saldo-=comision;
		calcInteres();
	}
	
	void imprimir() {
		System.out.println("Su saldo actual es de: " + conDecimales(saldo)
				+ "€ ya que el interés mensual es de: " + tasa
				+ "% y la comisión ha sido de: " + conDecimales(comision));
	}
	
	String conDecimales(float num) {
		return String.format(Locale.GERMAN, "%,.2f", num);
	}
	 
	
	
}
