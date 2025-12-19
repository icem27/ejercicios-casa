package EjerString2;

public class Ejercicio9 {

	public static void main(String[] args) {
		String frase = "Esta es una frase con algunas letras a";
		frase = frase.trim();
		int contador=0;
		String fraseNueva = "";
		
		for (int i=0; i<frase.length();i++) {
			char letra=frase.charAt(i);
			if(letra=='a' || letra=='A') {
				contador++;
				if (contador%2!=0) {
				letra='A';	
				}
			}
			fraseNueva=fraseNueva+letra;
		}
		System.out.println(fraseNueva);
	}

}
