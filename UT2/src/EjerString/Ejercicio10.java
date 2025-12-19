package EjerString;

public class Ejercicio10 {

	public static void main(String[] args) {
		// De cualquier palabra con un número par de letras, conseguir que la primera mitad esté en 
		// mayúsculas y la segunda mitad en minúsculas. Probar con "LoCoMoToRa"--> "LOCOMotora"
		
		String palabra = "LoCoMoToRa";
		int mitad = palabra.length()/2;
		
		String palabra1 = palabra.substring(0, mitad);
		String palabra2 = palabra.substring(mitad);
		
		System.out.println(palabra1.toUpperCase()+palabra2.toLowerCase());

	}

}
