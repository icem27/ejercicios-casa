package Vehiculo;

/*Programa una clase llamada o identificada como Vehículo con los siguientes atributos:

marca de tipo String
modelo de tipo String
numPasajeros numérico entero e inicializado a 4
capacidad numérico entero (capacidad del depósito en litros)
consumo  numérico decimal (consumo de combustible en Km/l)*/

public class Vehiculo {
	String marca;
	String modelo;
	int numPasajeros = 4;
	int capacidad;
	double consumo;
	double calcularAutonomia() {

	    return capacidad*consumo;

	}
}
