package EjerPolimorfismo;

import java.util.Locale;

public class Empleado_restaurante {
	protected String nombre;
	protected double salario_base;
	
	public Empleado_restaurante() {
		
	}
	
	public Empleado_restaurante(String nombre, double salario_base) {
		this.nombre = nombre;
		this.salario_base = salario_base;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nSalario: " + String.format(Locale.GERMAN,"%,.2f€", salario_base);
	}
	
	
	
	
	
}
