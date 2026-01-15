package NifEjercicio;

public class Nif {
	public long numero;
	public char letra;
	public Nif(){
		this.numero=0;
		this.letra=' ';
	}
	
	public Nif(long numero, char letra){
		this.numero = numero;
		this.letra = letra;
	}
	public char CalcularLetra() {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num =(int) (this.numero%23);
		this.letra=letras[num];
		return letras[num];
	}
	public void mostrar() {
		System.out.println(String.format("%08d-%s", this.numero, this.letra));
	}

}
