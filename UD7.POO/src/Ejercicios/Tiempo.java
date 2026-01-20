package Ejercicios;

public class Tiempo {
	private int segundos;
	
	Tiempo(int horas, int minutos, int segundos){
		this.segundos= horas * 3600 + minutos * 60 + segundos;
	}
	
	Tiempo(int segundos){
		this.segundos=segundos;
	}
	
	Tiempo suma(Tiempo t2) {
		return new Tiempo(this.segundos + t2.segundos);
	}
	Tiempo resta(Tiempo t2) {
		return new Tiempo(this.segundos - t2.segundos);
	}

	@Override
	public String toString() {
		return "Tiempo [segundos=" + segundos + "]";
	}
}
