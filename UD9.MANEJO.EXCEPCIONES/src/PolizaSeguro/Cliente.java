package PolizaSeguro;


public class Cliente {
	String nombre;
	int edad;
	String nif;
	
	public Cliente(String nombre, int edad, String nif) {
		this.nombre = nombre;
		this.edad = edad;
		this.nif = nif;
	}
	
	public void edadIncorrecta() throws edadEnRango {
		if(edad<18 || edad>64) {
			throw new edadEnRango("Edad fuera de rango");
		}
	}
	
	public void cuotasClientes() {
		if(edad<30) {
			System.out.println("La cuota es de 40€");
		} else if (edad<40) {
			System.out.println("La cuota es de 50€");
		} else if (edad<50) {
			System.out.println("La cuota es de 60€");
		} else if (edad<60) {
			System.out.println("La cuota es de 70€");
		} else {
			System.out.println("La couta es de 80€");
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

	public void setEdad(int edad) {
		try {
			this.edad = edad;
		} catch (NumberFormatException x) {
			System.out.println("Debes introduce numeros");
		}
	}
	

}
