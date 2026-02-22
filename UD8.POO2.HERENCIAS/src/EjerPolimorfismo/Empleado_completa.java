package EjerPolimorfismo;

import java.util.Locale;

public class Empleado_completa extends Empleado_restaurante {

	public Empleado_completa() {
	}

	public Empleado_completa(String nombre, double salario_base) {
		super(nombre, salario_base);
		salarioMayor();
	}
	
	private void salarioMayor() {
		super.salario_base=(salario_base*0.20)+salario_base;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nSalario: " + String.format(Locale.GERMAN,"%,.2f€", salario_base);
	}
	
}
