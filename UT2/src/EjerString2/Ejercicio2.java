package EjerString2;

public class Ejercicio2 {
	public static void main(String[] args) {
		// En cualquier frase sustituir todas las posiciones múltiplos  de 3 por ‘#’. 
		// Probarlo con “Esta es la frase donde vamos a  poner almohadillas”

		String frase = "Esta es la frase donde vamos a  poner almohadillas";
		frase = frase.trim();
		String fraseNueva = "";
		
		for (int i=0; i<frase.length();i++) {
			if (i % 3 != 0 || i==0) {
				fraseNueva = fraseNueva + frase.charAt(i);
			} else {
				fraseNueva=fraseNueva+'#';
			}
			
			
		}
		System.out.println(fraseNueva);
		
		
	}

}
