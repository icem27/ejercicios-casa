package EjerPolimorfismo;

import java.util.Locale;

public class Empleado_media extends Empleado_restaurante {

	public Empleado_media() {
	}

	public Empleado_media(String nombre, double salario_base) {
		super(nombre, salario_base);
		salarioMenor();
	}
	
	private void salarioMenor() {
		super.salario_base=salario_base-(salario_base*0.10);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nSalario: " + String.format(Locale.GERMAN,"%,.2f€", salario_base);
	}
}
