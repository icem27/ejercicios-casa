package Ejercicios;

public class Tiempo_principal {

	public static void main(String[] args) {
		Tiempo tiempo1 = new Tiempo(140);
		Tiempo tiempo2 = new Tiempo(40);
		Tiempo t = new Tiempo(1, 20, 30);
		Tiempo t1=new Tiempo(3600);
		Tiempo suma_tiempo =  tiempo1.suma(tiempo2);
		System.out.println(suma_tiempo);
		Tiempo resta_tiempo = tiempo1.resta(tiempo2);
		System.out.println(resta_tiempo);
		Tiempo suma_tiempo1 = t.suma(t1);
		System.out.println(suma_tiempo1);
	}

}
