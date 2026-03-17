package EjercicioThrow;

public class Ejercicio3 {

	public static void main(String[] args) {
		try {
			validarContrasena("Hoaaa");
		} catch (IllegalArgumentException x) {
			System.out.println(x.getMessage());
		}

	}
	
	public static void validarContrasena(String pass) {
		if(pass.length()>=8) {
			System.out.println("Contraseña valida");
		} else {
			throw new IllegalArgumentException("Debes tener al menos 8 caracteres");
		}
	}

}
