package Ejemplos;

public class Ejercicio5Throw {
	public static void main(String[] args) {
		try {
			verificarEdad(15);
		} catch (IllegalArgumentException x) {
			System.out.println(x.getMessage());
		}
	}
	
	public static void verificarEdad(int edad) {
		if (edad > 18) {
			System.out.println("Acceso permitido");
		} else {
			throw new IllegalArgumentException("Debes ser mayor de edad para acceder");
		}
	}
}
