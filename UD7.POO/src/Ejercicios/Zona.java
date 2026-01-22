package Ejercicios;

public class Zona {
	private int entradasPorVender;
	private int entradas_vendidas;

	public Zona(int n) {
		entradasPorVender = n;
	}

	public int getEntradasPorVender() {
		return entradasPorVender;
	}
	
	
	public int getEntradas_vendidas() {
		return entradas_vendidas;
	}
	
	public void vender(int n) {
		if (this.entradasPorVender == 0) {
			System.out.println("Lo siento, las entradas para esa zona están agotadas.");
		} else if (this.entradasPorVender < n) {
			System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
		} else {
			entradasPorVender -= n;
			this.entradas_vendidas +=n;
			System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
		}
	}
	
}
