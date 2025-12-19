package EjerString2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Obtener el número de palabras que hay en cualquier frase. 
		// Probarlo con “A ver cuántas palabras hay aquí.” 
		
		String frase = " A ver cuántas palabras hay aquí. ";
		frase=frase.trim();
		int contador = 1;
		
		for (int i=0; i<frase.length();i++) {
			if (frase.charAt(i)== ' ') {
				contador++;
			}
		}
		System.out.println("La frase contiene " + contador + " palabras");

	}

}
