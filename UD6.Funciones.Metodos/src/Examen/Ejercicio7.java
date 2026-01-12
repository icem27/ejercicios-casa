package Examen;

public class Ejercicio7 {

	public static void main(String[] args) {
		String dias = obtenerMaxDias(23);
		System.out.println(dias);
		if(obtenerMaxDias(3).equals("28")) {
			System.out.println("hola");
		} else {
			System.out.println("adios");
		}

	}
	public static String obtenerMaxDias(int mes) {
		switch(mes) {
		case 1,3,5,7,8,10,12:
			return "31";
		case 2:
			return "28";
		case 4,6,9,11:
			return "30";
		default:
			return "0";
		}
	}
}
