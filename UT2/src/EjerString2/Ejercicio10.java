package EjerString2;

public class Ejercicio10 {

	public static void main(String[] args) {
		String palabra = "Ana";
		String palabraReves = "";
		
		for (int i = palabra.length() - 1; i >= 0; i--) {
			char letra=palabra.charAt(i);
			palabraReves=palabraReves+letra;
		}
		
		if(palabra.equalsIgnoreCase(palabraReves)) {
			System.out.println("La palabra " + palabra + " es un palindromo");
		} else {
			System.out.println("La palabra no es un palindromo");
		}
	}

}
