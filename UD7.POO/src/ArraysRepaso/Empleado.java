package ArraysRepaso;

public class Empleado {
	/*
	 * Crea una clase Empleado con atributos nombre, sueldo y departamento. Luego,
	 * en el main, crea un array con 5 empleados y cuenta cuántos pertenecen al
	 * departamento de "Ventas".
	 */
	
	private String nombre;
	private double sueldo;
	private String departamento;
	
	public Empleado(String nombre, double sueldo, String departamento) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.departamento = departamento;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", departamento=" + departamento + "]";
	}
	
	
	
}
