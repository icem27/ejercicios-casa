package PolizaSeguro;


public class Cliente {
	private String nombre;
	private int edad;
	private String Nif;
	
	public Cliente(String nombre, int edad, String nif) {
		this.nombre = nombre;
		this.edad = edad;
		this.Nif = nif;
	}
	
	public int cuotasClientes() {
		if(edad<30) {
			return 40;
		} else if (edad<40) {
			return 50;
		} else if (edad<50) {
			return 60;
		} else if (edad<60) {
			return 70;
		} else {
			return 80;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	

}
