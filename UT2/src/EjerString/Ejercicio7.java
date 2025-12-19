package EjerString;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Crea un programa que muestre cada una de las letras de una frase en una
		// línea,
		// exceptuando los espacios. Probar con "Esta es la frase del Ejercicio 5".

		String frase = "Esta es la frase del Ejercicio 5";

		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i);
			if (letra != ' ') {
				System.out.println(letra);
			}
		}

	}

}
