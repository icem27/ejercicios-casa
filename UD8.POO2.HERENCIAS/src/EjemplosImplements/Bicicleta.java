package EjemplosImplements;

public class Bicicleta implements IVehiculo {

	private int velocidadMax;
	private boolean tieneAsientoPasajero;
	
	public Bicicleta(int velocidadMax, boolean tieneAsientoPasajero) {
		this.velocidadMax = velocidadMax;
		this.tieneAsientoPasajero = tieneAsientoPasajero;
	}

	@Override
	public int dameVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidadMax;
	}

	@Override
	public boolean transportaPasajeros() {
		// TODO Auto-generated method stub
		return tieneAsientoPasajero;
	}

}
