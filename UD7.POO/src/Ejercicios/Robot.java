package Ejercicios;

public class Robot {
	private int peso;
	
	Robot(){
		this.peso=3;
	}
	
	Robot(int peso){
		this.peso=peso;
	}
	
	public int recogerPieza(int peso) {
		return this.peso+=(peso-1);
	}
	
	public void recogerPieza(Robot otroRobot) {
		this.peso=recogerPieza(otroRobot.peso);
		otroRobot.peso=0;
	}
	
	

	@Override
	public String toString() {
		return "Soy un robot chatarrero y peso " + peso + " kg";
	}

}
