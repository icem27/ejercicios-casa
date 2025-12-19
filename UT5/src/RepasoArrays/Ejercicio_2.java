package RepasoArrays;

public class Ejercicio_2 {

	public static void main(String[] args) {
		double[][] tiendaA = { { 100.5, 200, 30.80, 12.5, 250.65, 210 }, { 85, 0, 20.3, 8, 310.20, 250 },
				{ 0, 120, 45, 23, 210, 86.9 } };
		double[][] tiendaB = { { 10.8, 201.58, 300, 125, 210.65, 210 }, { 56, 20.2, 23.3, 8, 10.20, 250 },
				{ 100.86, 0, 45, 230, 250, 89.9 } };
		int empleado = 0;
		int dia = 0;
		int empleadoA = 0;
		int empleadoB = 0;

		double empleado_A_Venta_Semana = 0;
		double venta_Empresa_A = 0;
		double maxVentasEmpleadoA = Math.max(tiendaA[0][0], tiendaA[0][1]);
		for (empleado = 0; empleado < tiendaA.length; empleado++) {
			empleado_A_Venta_Semana = 0;
			for (dia = 0; dia < tiendaA[empleado].length; dia++) {
				empleado_A_Venta_Semana += tiendaA[empleado][dia];
			}

			if(empleado_A_Venta_Semana>maxVentasEmpleadoA) {
				empleadoA=empleado+1;
			}
			maxVentasEmpleadoA = Math.max(empleado_A_Venta_Semana, maxVentasEmpleadoA);
			venta_Empresa_A += empleado_A_Venta_Semana;
			System.out.println(empleado_A_Venta_Semana);
		}

		System.out.println(venta_Empresa_A);
		System.out.println("======");
		double empleado_B_Venta_Semana = 0;
		double venta_Empresa_B = 0;

		double maxVentasEmpleadoB = Math.max(tiendaA[0][0], tiendaA[0][1]);
		for (empleado = 0; empleado < tiendaB.length; empleado++) {
			empleado_B_Venta_Semana = 0;
			for (dia = 0; dia < tiendaB[empleado].length; dia++) {
				empleado_B_Venta_Semana += tiendaB[empleado][dia];
			}

			if(empleado_B_Venta_Semana>maxVentasEmpleadoB) {
				empleadoB=empleado+1;
			}
			maxVentasEmpleadoB = Math.max(empleado_B_Venta_Semana, maxVentasEmpleadoB);
			venta_Empresa_B += empleado_B_Venta_Semana;
			System.out.println(empleado_B_Venta_Semana);
		}
		System.out.println(venta_Empresa_B);

		if (venta_Empresa_B > venta_Empresa_A) {
			System.out.println("La empresa que mas ha vendido ha sido la empresa B");
		} else {
			System.out.println("La empresa que mas ha vendido ha sido la empresa A");
		}
		
		if(maxVentasEmpleadoB>maxVentasEmpleadoA) {
			System.out.println("El empleado que mas ha vendido es de la empresa B y es el empleado " + empleadoB);
		} else {
			System.out.println("El empleado que mas ha vendido es de la empresa A y es el empleado " + empleadoA);
		}

	}

}
