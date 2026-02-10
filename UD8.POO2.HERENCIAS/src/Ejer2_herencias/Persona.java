package Ejer2_herencias;

public class Persona {
	/*
	 * Atributos privados (nombre, teléfono y edad). Constructor por defecto
	 * Constructor con 3 parámetros para las 3 variables de instancia Set y get
	 * necesarios Método toString para mostrar los valores de las tres variables en
	 * una sola cadena.
	 */
	
	private String nombre;
	private String telefono;
	private int edad;
	
	Persona(){
		
	}
	
	public Persona(String nombre, String telefono, int edad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

//	@Override
//	public String toString() {
//		return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", edad=" + edad + "]";
//	}
	
	

}
