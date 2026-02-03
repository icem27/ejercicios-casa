package Practica;

public class Incidencia {
	private int puesto;
	private String averia;
	private String estado;
	
	Incidencia(){
	}
	
	public Incidencia(int puesto, String averia) {
		this(puesto);
		this.puesto = puesto;
		this.averia = averia;
	}
	
	public Incidencia(int puesto) {
		this.puesto = puesto;
	}

	public int getPuesto() {
		return puesto;
	}

	public void setPuesto(int puesto) {
		this.puesto = puesto;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Puesto: " + puesto + " --> " + averia + " " + estado;
	}
	
	



}
