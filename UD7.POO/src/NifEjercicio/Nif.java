package NifEjercicio;

public class Nif {
	long dni;
	String letra;
	
	Nif(){
		this.dni=0;
		this.letra="";
	}
	
	Nif(int numDni){
		String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int num = numDni%23;
		this.letra=letras[num];
		this.dni = numDni;
	}
	public void CalcularLetra(int numDni) {
		String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		int num = numDni%23;
		this.letra=letras[num];
		this.dni = numDni;
	}
	public void mostrar() {
		System.out.println(this.dni + "-" + this.letra);
	}

}
