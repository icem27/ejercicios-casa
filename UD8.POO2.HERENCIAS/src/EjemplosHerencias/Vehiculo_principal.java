package EjemplosHerencias;

public class Vehiculo_principal {

	public static void main(String[] args) {
		Coche micoche = new Coche();
		Moto mimoto = new Moto();
		mimoto.marca="Kawasaki";
		mimoto.modelo="X1000";
		mimoto.anyoFabricacion=2025;
		mimoto.setTipoManillar("Cuadrado");
		micoche.marca="Ford";
		micoche.modelo="Kuga";
		micoche.anyoFabricacion=2025;
		micoche.setNumPuertas(4);
		micoche.mostrarInfo();
		mimoto.mostrarInfo();

	}

}
