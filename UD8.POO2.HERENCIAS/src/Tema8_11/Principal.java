package Tema8_11;

import java.util.Arrays;

public class Principal {
	static int posicion = 0;
	public static void main(String[] args) {
		Mision[] misiones = new Mision[5];
		misiones[posicion++] = new MisionPrehistorica("P01", "Caza de Mammut", 5, 3, EstadoMision.EN_CURSO, 12000);
		misiones[posicion++] = new MisionMedieval("M01", "Batalla de los Reinos", 6, 4, EstadoMision.EN_CURSO, "Castilla", 10);
		misiones[posicion++] = new MisionMedieval("M02", "Castilla", 3, 2, EstadoMision.EN_CURSO, "Aragón", 5);
		misiones[posicion++] = new MisionFuturista("F01", "Exploración de Marte", 7, 5, EstadoMision.EN_CURSO, 2150, 50);
		Arrays.sort(misiones,0,posicion);
		mostrarMisiones(misiones);
		mostrarCrones(misiones);
	}
	
	public static void mostrarMisiones(Mision[] misiones) {
		for(int i=0;i<misiones.length;i++) {
			if(misiones[i]!=null) {
				System.out.println(misiones[i]);
			}
		}
	}
	
	public static void mostrarCrones(Mision[] misiones) {
		int cronesTotales=0;
		for(int i=0;i<misiones.length;i++) {
			if(misiones[i]!=null) {
				cronesTotales=cronesTotales+misiones[i].getCRONES_POR_DIA();
			}
		}
		System.out.println("Crones totales: " + cronesTotales);
	}

}
