package EjemplosHerencias;

import java.util.Locale;

public class Trabajador_empleado extends Trabajador {
	private double sueldo;
	private double impuestos;
	private final int PAGAS=14;
	
	public Trabajador_empleado(String nombre, String puesto, String direccion, double sueldo, double impuestos) {
		super(nombre, puesto, direccion);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public int getPAGAS() {
		return PAGAS;
	}

	@Override
	public String toString() {
		return super.toString()+", sueldo: " + String.format(Locale.GERMANY, "%,.2f€", sueldo) + ", impuestos: " + String.format(Locale.GERMANY, "%,.2f€", impuestos) + ", pagas: " + PAGAS;
	}
	
	public double calcularPaga() {
		return (sueldo-impuestos)/PAGAS;
	}
	
}
