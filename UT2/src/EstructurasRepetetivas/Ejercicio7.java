package EstructurasRepetetivas;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Sin utilizar la sentencia FOR hacer un listado de 10 al -10 y 
		// seguido otro de -10 a 10.
		
		int i=10;
		while (i>=-10) {
			System.out.println(i);
			i--;
		}
		
		int j=-10;
		do {
			System.out.println(j);
			j++;
		} while (j<=10);
	}

}
