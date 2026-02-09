package EjemplosEnum;

public class Pelicula_principal {

	public static void main(String[] args) {
		Pelicula pelicula1=new Pelicula("Avatar 3", TipoPelicula.ESTRENO);
		Pelicula pelicula2=new Pelicula("Avatar 1", TipoPelicula.ESTRENO);
		
		System.out.println(pelicula1);
		System.out.println(pelicula2);

	}

}
