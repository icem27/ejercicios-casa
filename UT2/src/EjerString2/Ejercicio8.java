package EjerString2;

public class Ejercicio8 {

	public static void main(String[] args) {
		String palabra = "Terremoto";
		String resultado ="";
		
		if (palabra.length()%2!=0) {
			int centro=palabra.length()/2;
			String izq=palabra.substring(0,centro).toLowerCase();
			String central=palabra.substring(centro, centro+1).toUpperCase();
			String dch=palabra.substring(centro+1).toLowerCase();
			resultado = izq+central+dch;
			System.out.println(resultado);
		} else {
			System.out.println("La palabra tiene que tener caracteres impares");
		}

	}

}
