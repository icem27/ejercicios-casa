package EjerAbst;

public abstract class Instrumento {
	
	public abstract void tocar();
	
	public void afinar() {
		System.out.println("Afinando el instrumento...");
	}
	
}
