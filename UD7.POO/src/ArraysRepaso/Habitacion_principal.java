package ArraysRepaso;

public class Habitacion_principal {

	static Habitacion[] hotel = new Habitacion[10];

	public static void main(String[] args) {
		iniciarlizarArray();
		
		for(Habitacion habitacion:hotel) {
			if(habitacion.isOcupada()) {
				System.out.println(habitacion);
			} 
		}
	}
	
	public static void iniciarlizarArray() {
		int num=100;
		boolean ocupada=false;
		
		for(int i=0;i<hotel.length;i++) { 
			if(num%2==0) {
				ocupada=true;
			}
			hotel[i] = new Habitacion(num, ocupada);
			ocupada=false;
			num++;
		}
	}

}
