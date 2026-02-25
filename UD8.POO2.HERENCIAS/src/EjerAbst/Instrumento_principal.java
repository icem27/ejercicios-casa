package EjerAbst;

public class Instrumento_principal {

	public static void main(String[] args) {
		Instrumento ins = new Instrumento_Guitarra();
		ins.tocar();
		Instrumento ins1 = new Instrumento_piano();
		ins.afinar();

	}

}
