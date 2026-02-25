package EjerAbst;

public class Instrumento_Guitarra extends Instrumento {

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra");
	}
	
	@Override
	public void afinar() {
		System.out.println("Afinando las cuerdas.");
	}

}
