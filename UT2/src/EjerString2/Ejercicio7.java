package EjerString2;

public class Ejercicio7 {

	public static void main(String[] args) {
		// En cualquier frase sustituir las últimas tres letras ‘a’ por tres asteriscos.
		// Probarlo con la frase “Esta es la frase en la que vamos a probar”.

		String frase = "Esta es la frase en la  que vamos a probar";
		int contador = 0;

		for (int i = frase.length() - 1; i >= 0; i--) {
			char c = frase.charAt(i);
			if (c == 'a' || c == 'A') {
				if (contador < 4) {
					c = '*';
					frase = frase.substring(0, i) + c + frase.substring(i + 1, frase.length());
				}
				contador++;
			}
		}
		System.out.println(frase);

	}

}
