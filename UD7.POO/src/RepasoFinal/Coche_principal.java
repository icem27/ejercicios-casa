package RepasoFinal;

public class Coche_principal {

	static Coche[] parking = new Coche[10];
	public static void main(String[] args) {
		aparcar(new Coche("Skoda", "3645FVV"));
		aparcar(new Coche("Audi", "7268NHG"));
		mostrarParking();
		sacar("3645fvv");
		mostrarParking();
		
	}
	
	static void aparcar(Coche coche) {
		boolean aparcado=false;
		for(int i=0;i<parking.length;i++) {
			if(parking[i]==null) {
				parking[i]=coche;
				aparcado=true;
				System.out.println("El coche ha sido aparcado en la plaza " + i);
				break;
			}
		}
		
		if(!aparcado) {
			System.out.println("El parking actualmente se encuentra lleno. Lo siento");
		}
	}
	
	static void sacar(String matricula) {
		for(int i=0;i<parking.length;i++) {
			if(parking[i].getMatricula().equalsIgnoreCase(matricula)) {
				parking[i]=null;
				System.out.println("Coche retirado de la plaza " + i);
				break;
			} else {
				System.out.println("El matricula introducida no es correcta.");
			}
		}
	}
	
	static void mostrarParking() {
		for(int i=0;i<parking.length;i++) {
			if(parking[i]==null) {
				System.out.println("Plaza " + i + ": Libre");
			} else {
				System.out.println("Plaza " + i + ": "+ parking[i].mostrarInfo());
			}
		}
	}
}
