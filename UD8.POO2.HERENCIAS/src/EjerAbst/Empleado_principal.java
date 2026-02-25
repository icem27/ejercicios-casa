package EjerAbst;

public class Empleado_principal {

	public static void main(String[] args) {
		Empleado emp = new EmpleadoFijo("Ismael", 1000, 10);
		Empleado emp1 = new EmpleadoPorHoras("Juan", 1000, 10);
		System.out.println(emp.calcularSueldo());
		System.out.println(emp1.calcularSueldo());
		emp.mostrarInfo();
		emp1.mostrarInfo();
		

	}

}
