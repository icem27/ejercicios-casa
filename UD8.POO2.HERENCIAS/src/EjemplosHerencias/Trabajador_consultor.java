package EjemplosHerencias;

import java.util.Locale;

public class Trabajador_consultor extends Trabajador {
	private int horas;
	private double tarifa;
	
	public Trabajador_consultor(String nombre, String puesto, String direccion, int horas, double tarifa) {
		super(nombre, puesto, direccion);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString()+" horas: " + horas + ", tarifa: " + String.format(Locale.GERMAN, "%,.2f€", tarifa);
	}
		
	public double calcularPaga() {
		return horas*tarifa;
	}
}
