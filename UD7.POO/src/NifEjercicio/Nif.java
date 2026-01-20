package NifEjercicio;

public class Nif {
	public long numero;
	public char letra;
	public Nif(){
		this.numero=0;
		this.letra=' ';
	}
	
	public Nif(long numero){
		this.numero = numero;
		this.letra = CalcularLetra();
	}
	public char CalcularLetra() {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num =(int) (this.numero%23);
		this.letra=letras[num];
		return letras[num];
	}
	public String mostrar() {
		return String.format("%08d-%s", this.numero, this.letra);
	}

}
