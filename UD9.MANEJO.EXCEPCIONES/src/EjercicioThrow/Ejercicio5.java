package EjercicioThrow;

public class Ejercicio5 {

	public static void main(String[] args) {
		try {
			imprimirLongitud("Chaniel es muy tonto");
		} catch (NullPointerException x) {
			System.out.println(x.getMessage());
		}

	}
	
	public static void imprimirLongitud(String texto) {
		if(texto==null) {
			throw new NullPointerException("El texto no puede ser null");
		} else {
			System.out.println("El texto es de tamaño " + texto.length());
		}
	}

}
