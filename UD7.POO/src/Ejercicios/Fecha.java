package Ejercicios;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anio) {
		boolean fechaCorrecta= comprobarFecha(dia, mes, anio);
		if(fechaCorrecta)
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	public boolean comprobarFecha(int dia, int mes, int anio) {
		boolean mesViaje = true;
		boolean diaViaje = true;
		if (mes < 1 || mes > 12) { // Este if es para verificar si los meses están entre 1 y 12 meses
			mesViaje = false;
		}
		boolean bisiesto = esBisiesto(anio);
		if (dia < 1 || dia > 31) { // Este if es para verificar si los dias están entre 1 y 31 meses
			diaViaje =  false;
		} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
			diaViaje =  false;
		} else if (mes == 2 && dia > 28 && !(bisiesto && dia == 29)) {
			diaViaje =  false;
		}
		if (diaViaje && mesViaje) { // La logica para verificar si la fecha introducida es correcta
			return true;
		} else {
			return false;
		}
		
	}
	public boolean esBisiesto(int anio) {
		return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
}
