package ArraysRepaso;

public class Temperatura {
	private int dia;
	private int mes;
	private int temperatura;
	
	public Temperatura(int dia, int mes, int temperatura) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.temperatura = temperatura;
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

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return temperatura + "º el dia " + dia + " del mes " + mes;
	}
	
	
}
