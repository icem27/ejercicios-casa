package EjerAbst;

public class Instrumento_piano extends Instrumento {

	@Override
	public void tocar() {
		System.out.println("Tocando el piano");
	}
	
	@Override
	public void afinar() {
		System.out.println("Afinando el piano");
	}

}
