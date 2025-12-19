
public class prueba_examen {

	public static void main(String[] args) {
		final String SIGLAS = "IV";
		String constantes = "BCDFGHJKLMNPQRSTVWXYZ";
		String vocales = "AEIOU";
		
		for(int i=0;i<5;i++) {
			int random= (int)(Math.random()*constantes.length());
			System.out.println(random);
		}

	}

}
