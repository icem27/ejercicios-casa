package EjerString2;

public class Ejercicio6 {

	public static void main(String[] args) {
		// En cualquier frase sustituir las primeras tres letras ‘a’ por  tres asteriscos. 
		// Probarlo con la frase “Esta es la frase en la  que vamos a probar”. 
		
		String frase = "Esta es la frase en la que vamos a probar";
		String fraseFinal="";
		int contador=0;
		
		for (int i=frase.length(); i<=0;i++) {
			char c=frase.charAt(i);
			if(c=='a'||c=='A') {
				contador++;
				if(contador<4) {
					c='*';
				}
			}
			fraseFinal=fraseFinal+c;
		}

		System.out.println(fraseFinal);

	}

}
