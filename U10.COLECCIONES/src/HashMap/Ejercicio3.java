package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Se quiere implementar el control de acceso al área restringida de un
	 * programa. Para ello:
	 * 
	 * Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce
	 * los datos correctamente, el programa dirá “Ha accedido al área restringida”.
	 * El usuario tendrá un máximo de 3 oportunidades. Si se agotan las
	 * oportunidades el programa dirá “Lo siento, no tiene acceso al área
	 * restringida ” y finalizará. Los nombres de usuario con sus correspondientes
	 * contraseñas deben estar almacenados en una estructura de la clase HashMap
	 * (debes crearlos en el main directamente).
	 */

	static Scanner leer = new Scanner(System.in);
	static int fallos = 0;

	public static void main(String[] args) {

		HashMap<String, String> accesos = new HashMap<String, String>();
		accesos.put("usuario1", "pass1");
		accesos.put("usuario2", "pass2");
		accesos.put("usuario3", "pass3");
		accesos.put("usuario4", "pass4");
		accesos.put("usuario5", "pass5");
		accesos.put("usuario6", "pass6");

		do {
			if (pedirDatos(accesos)) {

				break;
			}
		} while (fallos < 3);
		if (fallos < 3) {
			System.out.println("Ha accedido al área restringida");
		} else {
			System.out.println("Lo siento, no tiene acceso al área restringida");
		}

	}

	public static boolean pedirDatos(HashMap<String, String> accesos) {
		System.out.println("Introduce el usuario y la contraseña:");
		String usuario = leer.next();
		String pass = leer.next();
		if (accesos.containsKey(usuario) && accesos.get(usuario).equals(pass)) {
			return true;
		} else {
			fallos++;
			return false;
		}

	}

}
