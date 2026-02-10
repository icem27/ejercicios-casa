package EjemplosHerencias;

import java.util.Locale;

public class Trabajador_principal {

	public static void main(String[] args) {
		Trabajador[] t1 = new Trabajador[3];
		t1[0] = new Trabajador("Bill Gates", "Presidente", "EEUU");
		t1[1] = new Trabajador_empleado("Larry Ellison", "Presidente", "EEUU", 100000, 1000);
		t1[2] = new Trabajador_consultor("Steve Jobs", "Consultor Jefe", "EEUU", 20, 1000);
		
		for(Trabajador empleados:t1) {
			System.out.println(empleados);
			if(empleados.calcularPaga()!=0) {
				System.out.println("El empleado " + empleados.getNombre() + " cobra " + String.format(Locale.GERMANY, "%,.2f€", empleados.calcularPaga()));
			}
		}
		

	}

}
