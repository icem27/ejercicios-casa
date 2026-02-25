package EjerAbst;

public abstract class Empleado {
	private String nombre;
	private double salarioBase;
	
	public Empleado(String nombre, double salarioBase) {
		this.nombre = nombre;
		this.salarioBase = salarioBase;
	}

	public abstract double calcularSueldo();
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + nombre + " con un salario base de: " + salarioBase);
	}

	public String getNombre() {
		return nombre;
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	
	
}
