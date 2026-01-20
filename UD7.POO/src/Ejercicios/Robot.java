package Ejercicios;

public class Robot {
	private int peso=3;
	
	Robot(){
	}
	
	Robot(int peso){
		this.peso=peso;
	}
	
	
	Robot recogerPieza(Robot robot) {
		return new Robot(this.peso=(this.peso+(robot.peso-1)));
	}
	public int recogerPieza(int peso) {
		return this.peso=(this.peso+(peso-1));
	}

	@Override
	public String toString() {
		return "Robot [peso=" + peso + "]";
	}
	

}
