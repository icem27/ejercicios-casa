package Ejercicios;

public class Fecha_principal {

	public static void main(String[] args) {
		int dia=31, mes=12, anio=2022;
		Fecha nacimiento = new Fecha(dia, mes, anio);
		boolean fecha = nacimiento.comprobarFecha(dia, mes, anio);
		nacimiento.diaSiguiente();
		System.out.println(fecha);
		System.out.println(nacimiento);
	}

}
