package EjemplosImplements;

public class Coche implements IVehiculo {

	private int velocidadMax;
	private int capacidadPasajeros;
	
	
		
	public Coche(int velocidadMax, int capacidadPasajeros) {
		this.velocidadMax = velocidadMax;
		this.capacidadPasajeros = capacidadPasajeros;
	}

	@Override
	public int dameVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidadMax;
	}

	@Override
	public boolean transportaPasajeros() {
		// TODO Auto-generated method stub
		return (capacidadPasajeros>0);
	}

}
