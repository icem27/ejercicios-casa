package EjemplosHerencias;

public class Perro extends Animal {
	protected String raza;
	
	public void ladrar() {
		System.out.println("El perro ladra");
	}
	
	public Perro(String nombre, String tipoAnimal, int edad, String raza){
		super(nombre, tipoAnimal, edad);
		this.raza = raza;
	}

	
	
//	@Override
//	public String toString() {
//		return "Perro [raza=" + raza + ", nombre=" + nombre + ", tipoAnimal=" + tipoAnimal + ", edad=" + edad + "]";
//	}
	
}
