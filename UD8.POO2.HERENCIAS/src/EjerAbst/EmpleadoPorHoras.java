package EjerAbst;

public class EmpleadoPorHoras extends Empleado {
	private int horasTrabajo;
	private double tarifaPorHora = 10;
	
	public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajo) {
		super(nombre, salarioBase);
		this.horasTrabajo = horasTrabajo;
	}

	@Override
	public double calcularSueldo() {
		return horasTrabajo*tarifaPorHora;
	}

}
