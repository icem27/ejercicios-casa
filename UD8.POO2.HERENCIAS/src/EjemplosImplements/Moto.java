package EjemplosImplements;

public class Moto implements IVehiculo{

	private int velocidadMax;
	
	public Moto(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	@Override
	public int dameVelocidad() {
		// TODO Auto-generated method stub
		return this.velocidadMax;
	}

	@Override
	public boolean transportaPasajeros() {
		// TODO Auto-generated method stub
		return false;
	}

}
