package Ejercicios;

public class Robot {
	private int peso=3;
	
	Robot(){	
	}
	
	Robot(int peso){
		this.peso=peso;
	}
	
	
	public Robot recogerPieza(Robot otroRobot) {
		int nuevoValor = this.peso=this.peso+(otroRobot.peso-1);
		otroRobot.peso=0;
		return new Robot(nuevoValor);
	}
	
	public Robot recogerPieza(int peso) {
		return new Robot(this.peso=(this.peso+(peso-1)));
	}

	@Override
	public String toString() {
		return "Robot [peso=" + peso + "]";
	}
	

}
