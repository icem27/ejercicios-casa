package EjemplosHerencias;

public class Animal {
	protected String nombre;
	protected String tipoAnimal;
	protected int edad;
	
	public void comer() {
		System.out.println("El animal come");
	}
	

	public Animal(String nombre, String tipoAnimal, int edad) {
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipoAnimal=" + tipoAnimal + ", edad=" + edad + "]";
	}
	
}
