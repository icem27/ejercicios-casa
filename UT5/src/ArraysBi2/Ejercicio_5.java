package ArraysBi2;

import java.util.Arrays;

public class Ejercicio_5 {

	public static void main(String[] args) {
		double tiendaA[][] = {{100.5, 200, 30.80, 12.5, 250.65, 210}, {85, 0, 20.3, 8, 310.20, 250}, {0, 120, 45, 23, 210, 86.9}};
		double tiendaB[][] = {{10.8, 201.58, 300.8, 125, 210.65, 210}, {56, 20.2, 23.3, 8, 10.20, 250}, {100.86, 0, 45, 230, 250, 89.9}};
		double empleadoTopA=0;
		double empleadoTopB=0;
		int empleadoA=0;
		int empleadoB=0;
		double tiendaTop=0;
		double totalVentaA=0;
		double totalVentaB=0;
		double diasMasVenta[] = new double[6];
		int fila=0;
		int columna=0;
		double maxVentas_A=0;
		double maxVentas_B=0;
		double mediaDiaria[] = new double[6];
		int index=0;
		
		for(fila=0;fila<tiendaA.length;fila++) {
			empleadoTopA=0;
			for(columna=0;columna<tiendaA[fila].length;columna++) {
					empleadoTopA+=tiendaA[fila][columna];
					diasMasVenta[columna]+=tiendaA[fila][columna];
			}
			mediaDiaria[index]=diasMasVenta[index];
			totalVentaA+=empleadoTopA;
			index++;
			if(maxVentas_A < empleadoTopA) {
				maxVentas_A=empleadoTopA;
				empleadoA=fila;
			}
			
		}

		System.out.println("Hola: "+(Arrays.toString(diasMasVenta)));
		for(fila=0;fila<tiendaB.length;fila++) {
			empleadoTopB=0;
			for(columna=0;columna<tiendaB[fila].length;columna++) {
					empleadoTopB+=tiendaB[fila][columna];
					diasMasVenta[columna]+=tiendaA[fila][columna];
			}
			if(maxVentas_B < empleadoTopB) {
				maxVentas_B=empleadoTopB;
				empleadoB=fila;
			}
			
		}
		System.out.println(Arrays.toString(diasMasVenta));
		if(totalVentaA>totalVentaB) {
			System.out.println("La tienda A ha realizado mas ventas");
		} else {
			System.out.println("La tienda B ha realizado mas ventas");
		}
		if(maxVentas_A>maxVentas_B) {
			System.out.println("El empleado que mas vendió fue de la empresa A y es el " + (empleadoA+1));
		} else if(maxVentas_A<maxVentas_B) {
			System.out.println("El empleado que mas vendió fue de la empresa B y es el " + (empleadoB+1));
		}
		
	}

}
