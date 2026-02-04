package Practica;

public class Incidencia {
	private int puesto;
	private String averia;
	private Estado estado;
	
	
	public Incidencia(int puesto, String averia) {
		this.puesto = puesto;
		this.averia = averia;
		this.estado = Estado.PENDIENTE;
	}

	public int getPuesto() {
		return puesto;
	}

	public String getAveria() {
		return averia;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Puesto: " + puesto + " --> " + averia + " " + estado;
	}
	
}
