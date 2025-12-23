package RepasoProg;

public class Ejercicio_1 {
	/*Crea una función que reciba una palabra y devuelva cuántas vocales contiene.*/
	public static void main(String[] args) {
		buscaVocal("Ismael");
		
	}
	public static int buscaVocal(String palabra) {
		int contador=0;
		palabra = palabra.toUpperCase();
		for(int i=0;i<palabra.length();i++) {
			char c=palabra.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') contador++;
			
		}
		return contador;
	}
}
