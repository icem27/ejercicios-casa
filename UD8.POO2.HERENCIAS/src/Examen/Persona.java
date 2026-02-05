package Examen;

public class Persona {
	private int edad;
	
	Persona(int edad){
		this.edad = edad;
	}
	
	boolean esMayorDeEdad() {
		return edad >= 21;
	}
	
	public static void main(String[] args) {
		Persona ismael = new Persona(20);
		if(ismael.esMayorDeEdad()) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("es menor de edad");
		}
	}

}
