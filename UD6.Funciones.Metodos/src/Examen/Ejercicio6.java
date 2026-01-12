package Examen;

public class Ejercicio6 {

	public static void main(String[] args) {
		repiteMensaje("FUTURO", 5);

	}
	public static void repiteMensaje(String mensaje, int repetir) {
		if(repetir<=0) System.out.print("");
		for(int i=0;i<repetir;i++) {
		System.out.print(mensaje + " ");
		}
	}
	
}
