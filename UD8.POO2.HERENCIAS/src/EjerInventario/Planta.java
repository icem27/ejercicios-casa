package EjerInventario;

public class Planta {
	protected boolean plantada;
	protected int semana;
	protected double costoCultivo;
	
	Planta(double costo){
		semana=1;
		this.plantada=true;
		this.costoCultivo=costo;
	}
	
	
	public void envejecer() {
		this.semana++;
	}


	public boolean isPlantada() {
		return plantada;
	}


	public void setPlantada(boolean plantada) {
		this.plantada = plantada;
	}
	
	public void cosechar() {
		this.plantada=false;
	}
	
	public String mostrarPlanta() {
		return "";
	}
	
	public double calcularCostoTotal() {
		return costoCultivo*semana;
	}


	public int getSemana() {
		return semana;
	}


	public void setSemana(int semana) {
		this.semana = semana;
	}


	public double getCostoCultivo() {
		return costoCultivo;
	}


	public void setCostoCultivo(double costoCultivo) {
		this.costoCultivo = costoCultivo;
	}
	
	public String estado() {
		return "";
	}
	
	
	
}
