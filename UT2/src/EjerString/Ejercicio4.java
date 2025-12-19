package EjerString;

public class Ejercicio4 {
	public static void main(String[] args) {
		// Crea cuatro String con los valores "uno", "dos", "tres" y "cuatro".
		// A partir de estos String crear otro que contenga "uno, dos, tres y cuatro"
		
		String palabra1="uno";
		String palabra2="dos";
		String palabra3="tres";
		String palabra4="cuatro";
		
		String frase = String.format("%s, %s, %s y %s", palabra1, palabra2, palabra3, palabra4);
		System.out.println(frase);
	
}

}
