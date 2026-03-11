package EscuelaMagia;

import java.util.Arrays;

public class Principal {
	public static int posicion = 0;
	public static MagoElemental[] magos = new MagoElemental[4];

	public static void main(String[] args) {
		magos[posicion++] = new MagoAire("Morgana", 100);
		magos[posicion++] = new MagoFuego("Albus", 500);
		magos[posicion++] = new MagoEstudiante("Elminster");
//		lanzarHechizo();
		ordena();
	}
	
	public static void lanzarHechizo() {
		String nombre;
		for(int i=0;i<magos.length;i++) {
			if(magos[i]!=null) {
				nombre = magos[i].getNombre();
			if (magos[i] instanceof Aprendiz) {
				System.out.println(nombre + ": " + magos[i].lanzarHechizo());
				System.out.println(nombre + ": " + ((Aprendiz) magos[i]).mensaje());
				; 
			} else {
				System.out.println(nombre + ": "  + magos[i].lanzarHechizo());
			}
			}
		}
	}
	
	public static void ordena() {
		Arrays.sort(magos, 0, posicion);
		for(MagoElemental m:magos) {
			if (m!=null) System.out.println(m);
			
		}
		
	}

}
