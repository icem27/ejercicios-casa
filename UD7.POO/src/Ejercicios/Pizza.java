package Ejercicios;

public class Pizza {
	private static int totalPedidas;
	private static int totalServidas;
	
	private String tamanio;
	private String tipo;
	private String estado;
	
	Pizza(){
		
	}
	
	Pizza(String tamanio, String tipo){
		this.tamanio=tamanio;
		this.tipo=tipo;
		this.estado="pedida";
		totalPedidas++;
	}

	public static int getTotalPedidas() {
		return totalPedidas;
	}

	public static int getTotalServidas() {
		return totalServidas;
	}
	
	public void sirve() {
		if(this.estado=="servida") {
			System.out.println("Esta pizza ya se ha servido");
		} else {
			this.estado="servida";
			totalServidas++;
		}
	}

	@Override
	public String toString() {
		return "Pizza " + tipo + " " + tamanio + " " + estado;
	}
	
	
	
}
