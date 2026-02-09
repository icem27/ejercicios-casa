package EjemplosHerencias;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected int anyoFabricacion;
	
	public void mostrarInfo() {
		System.out.println("El vehiculo es de la marca " + marca + ", modelo: " + modelo + ", fabricado: " + anyoFabricacion);
	}

}
