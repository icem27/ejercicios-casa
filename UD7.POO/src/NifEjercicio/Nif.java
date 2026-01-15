package NifEjercicio;

public class Nif {
	long dni;
	char letra;
	
	Nif(){
		this.dni=0;
		this.letra=' ';
	}
	
	Nif(int numDni){
		this.letra = CalcularLetra(numDni);
		this.dni = numDni;
	}
	public char CalcularLetra(int numDni) {
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int num = numDni%23;
		return this.letra=letras[num];
	}
	public void mostrar() {
		System.out.println(this.dni + "-" + this.letra);
	}

}
