package Ejercicios;

public class Fecha_principal {

	public static void main(String[] args) {
		int dia=31, mes=12, anio=2019;
		Fecha nacimiento = new Fecha(dia, mes, anio);
		nacimiento.diaSiguiente();
		System.out.println(String.format("La fecha actual es: %02d-%02d-%04d", dia, mes, anio));
		System.out.println("La fecha al establecer el dia siguiente: " + nacimiento);
	}

}
