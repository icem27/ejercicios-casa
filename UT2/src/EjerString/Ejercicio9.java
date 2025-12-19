package EjerString;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Crea un programa que cuente el número de veces que aparece la letra "e" (Mayúscula o minúscula). 
		// Probar con la frase "Este ejercicio es el primero que cuenta letras"
		
		String frase = "Este ejercicio es el primero que cuenta letras";
		int contador = 0;
		for (int i=0; i<frase.length();i++) {
			if (frase.charAt(i)=='e'||frase.charAt(i)=='E') {
				contador++;
			}	
		}

		System.out.println("La letra e aparece "+contador);
	}

}
