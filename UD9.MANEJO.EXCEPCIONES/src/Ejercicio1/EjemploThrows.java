package Ejercicio1;

public class EjemploThrows {
	public static void main(String[] args) {
//		verificarEdad(12);
		try {
			verificarEdad(12);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void verificarEdad(int edad) throws IllegalArgumentException {
		if(edad >=18) {
			System.out.println("acceso");
		} else {
			throw new IllegalArgumentException("Acceso denegado");
		}
	}
}
