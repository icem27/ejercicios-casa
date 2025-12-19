package EjerString2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// En cualquier frase cambiar la primera y la última palabra  a mayúsculas. 
		// Probarlo con la frase “Esta es la frase donde  vamos a hacer los cambios”
		
		String frase = "Esta es la frase donde vamos a hacer los cambios";
		frase=frase.trim();
		int primerEspacio = frase.indexOf(' ');
		int ultimoEspacio = frase.lastIndexOf(' ');
		String primerPalabra=frase.substring(0, primerEspacio).toUpperCase();
		String ultimaPalabra=frase.substring(ultimoEspacio).toUpperCase();
		String central=frase.substring(primerEspacio, ultimoEspacio);
		System.out.println(primerPalabra+central+ultimaPalabra);
	}

}
