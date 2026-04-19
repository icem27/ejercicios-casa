package EjercicioThrow;

public class Ejercicio1 {
	public static void main(String[] args) {
		try {
			verificarEdad(17);
			System.out.println("Acceso concedido");
		} catch (IllegalArgumentException x) {
			System.out.println(x.getMessage());
		}
	}
	
	public static void verificarEdad(int edad) {
		if (edad < 18) {
			 throw new IllegalArgumentException("Debes ser mayor de 18 años para acceder");
		}
	}

}
