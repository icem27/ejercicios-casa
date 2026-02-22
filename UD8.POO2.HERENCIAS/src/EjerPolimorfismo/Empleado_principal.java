package EjerPolimorfismo;

public class Empleado_principal {

	public static void main(String[] args) {
		Empleado_gestionEmp empleados = new Empleado_gestionEmp();
		empleados.altaEmpleadoCompleta(new Empleado_completa("Ismael", 100));
		empleados.altaEmpleadoCompleta(new Empleado_completa("Francisco", 1000));
		empleados.altaEmpleadoMedia(new Empleado_media("Carlos", 100));
		empleados.MostrarEmpleados();
		
	}

}
