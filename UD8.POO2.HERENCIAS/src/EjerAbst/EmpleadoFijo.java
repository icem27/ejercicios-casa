package EjerAbst;

public class EmpleadoFijo extends Empleado {
	private int horasTrabajo;
	
	public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajo) {
		super(nombre, salarioBase);
		this.horasTrabajo=horasTrabajo;
	}

	@Override
	public double calcularSueldo() {
		return super.getSalarioBase()*horasTrabajo;
	}

}
