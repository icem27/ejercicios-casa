package RepasoJedi;

public class Ejercicio_9 {
	/*
	 * La letra del NIF se obtiene de la siguiente manera:
	 * 
	 * Se divide el número del DNI (NIF sin la letra) entre 23 y dependiendo del
	 * resto tendremos una letra según la siguiente equivalencia: 0: "T", 1: "R", 2:
	 * "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B",
	 * 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20:
	 * "C", 21: "K", 22: "E". Escribe un programa que pida el DNI y muestre por
	 * pantalla la letra asociada. Para ello se deberá crear una función a la que se
	 * le pase el número y devuelva la letra. Ejemplo: para el DNI 56321122 la letra
	 * del NIF es ‘X’
	 */

	public static void main(String[] args) {
		String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int nif=56948568;
		System.out.println(nif+formula(nif, letras));
		
	}
	public static String formula(int nif, String[] array) {
		int num = nif%23;
		return array[num];
	}

}
