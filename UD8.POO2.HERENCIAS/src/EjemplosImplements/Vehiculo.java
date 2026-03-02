package EjemplosImplements;

public class Vehiculo {
	public static void main(String[] args) {
		IVehiculo[] vehiculos = new IVehiculo[3];
		vehiculos[0]= new Coche(150, 5);
		vehiculos[1]= new Moto(140);
		vehiculos[2]= new Bicicleta(50, false);
		
		for(IVehiculo v:vehiculos) {
			String vehiculo="Bici";
			if(v instanceof Coche) {
				vehiculo="Coche";
			} else if(v instanceof Moto) {
				vehiculo="Motor";
			}
			
			System.out.println("Datos de " + vehiculo + " es: " + v.obtenerDatos());
		}
	}
}
