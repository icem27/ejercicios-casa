package EjerString;

public class Ejercio8 {

	public static void main(String[] args) {
		// Crea un programa que obtenga en qué posición aparece por primera vez  un espacio. 
		// Y después del primer espacio en qué posición aparece el tercer espacio. Prueba con la frase "En esta frase hay varios espacios"
		
		String frase="En esta frase hay varios espacios";
		int n = 0;
		int contador = 0;
		do {
			if(frase.charAt(n) == ' ') {
				contador++;
				if (contador == 1) {
					System.out.println("Hay un espacio por primera vez en la posición " + n);
				}
				if (contador == 3) {
					System.out.println("Hay un espacio por tercera en la posición "+n);
				}
			}
		n++;
		} while(frase.length() != n);

	}

}
