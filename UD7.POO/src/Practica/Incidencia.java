package Practica;

public class Incidencia {
	private int puesto;
	private String averia;
	private boolean estado;
	
	Incidencia(){
		estado=false;
	}
	
	public Incidencia(int puesto, String averia) {
		this.puesto = puesto;
		this.averia = averia;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}



}
