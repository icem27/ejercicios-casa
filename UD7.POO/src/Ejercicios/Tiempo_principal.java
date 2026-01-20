package Ejercicios;

public class Tiempo_principal {

	public static void main(String[] args) {
		Tiempo tiempo1 = new Tiempo(40);
		Tiempo tiempo2 = new Tiempo(40);
		Tiempo suma_tiempo =  tiempo1.suma(tiempo2);
		System.out.println(suma_tiempo);
		Tiempo resta_tiempo = tiempo1.resta(tiempo2);
		System.out.println(resta_tiempo);

	}

}
