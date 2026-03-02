package EjemplosImplements;

public interface IVehiculo {
	
	public int dameVelocidad();
	public boolean transportaPasajeros();
	
	default String obtenerDatos() {
		return "Velocidad máxima: " + dameVelocidad() + " puede transportar viajeros: " + (transportaPasajeros() ? "Si":"No");
	}
}
