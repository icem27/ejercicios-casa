package Vehiculo;

/*Programa una clase controladora llamada o identificada como CrearObjetoVehiculo que dentro del método main:

Instancie el objeto Monovolumen de la clase vehículo.
Dale a sus atributos los valores :
 marca = Renault
modelo=Space
pasajeros = 7
capacidad = 50
consumo =14
Calcula la autonomía del vehículo con el depósito lleno.*/
public class CrearObjetoVehiculo {

	public static void main(String[] args) {
		Vehiculo Monovolumen = new Vehiculo();
		Monovolumen.marca = "Renault";
		Monovolumen.modelo = "Space";
		Monovolumen.numPasajeros = 7;
		Monovolumen.capacidad = 50;
		Monovolumen.consumo = 14;
		double autonomia=Monovolumen.calcularAutonomia();
		System.out.println("El " + Monovolumen.marca + " " + Monovolumen.modelo + " tiene una autonomía de " + autonomia + " kms");
		
		Vehiculo Deportivo = new Vehiculo();
		Deportivo.marca = "Lexus";
		Deportivo.modelo = "F Sport";
		Deportivo.numPasajeros = 2;
		Deportivo.capacidad = 66;
		Deportivo.consumo = 18.8;
		double autonomiaDepotivo=Deportivo.calcularAutonomia();
		System.out.println("El " + Deportivo.marca + " " + Deportivo.modelo + " tiene una autonomía de " + autonomiaDepotivo + " kms");
	}

}
