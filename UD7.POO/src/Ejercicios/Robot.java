package Ejercicios;

public class Robot {
	private int peso=3;
	
	Robot(){	
	}
	
	Robot(int peso){
		this.peso=peso;
	}
	
	public void recogerPieza(Robot otroRobot) {
		this.peso+=(otroRobot.peso-1);
		otroRobot.peso=0;
	}
	
	public void recogerPieza(int peso) {
		this.peso+=(peso-1);
	}

	@Override
	public String toString() {
		return peso + " kg";
	}

}
