package Ejercicios;

public class Electrodomestico {
	private String tipo;
	private String marca;
	private double potencia;
	
	Electrodomestico(){
	}
	
	Electrodomestico(String tipo, String marca, double potencia){
		this.tipo=tipo;
		this.marca=marca;
		this.potencia=potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", potencia=" + potencia + "]";
	}
	public double getConsumo(int tiempo) {
		double consumo=tiempo*this.potencia;
		return consumo;
	}
	public double getCosteConsumo(int tiempo, double precio) {
		double coste=tiempo*precio;
		return coste;
	}
	
	
	
}
