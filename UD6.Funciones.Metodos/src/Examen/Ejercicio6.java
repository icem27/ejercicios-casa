package Examen;

public class Ejercicio6 {

	public static void main(String[] args) {
		String mensaje= repiteMensaje("FUTURO", 3);
		System.out.println(mensaje);
	}
	public static String repiteMensaje(String mensaje, int repetir) {
		if(repetir<=0) return "";
		
		return mensaje+" "+repiteMensaje(mensaje, repetir-1);
		
		
		
//		for(int i=0;i<repetir;i++) {
//		System.out.print(mensaje + " ");
//		}
		
	}
	
}
