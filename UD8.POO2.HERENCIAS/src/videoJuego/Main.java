package videoJuego;

public class Main {
	
	public static void main(String[] args) {
		
		Guerrero p1=new Guerrero("Pedro");
		Mago p2=new Mago("Loco");
		Arquero p3=new Arquero("Vini");
		
		System.out.println(p3.getVida());
		p2.getNombre();
		p3.recibirDanio(20);
		System.out.println(p3.getVida());
		
		
	}

}
