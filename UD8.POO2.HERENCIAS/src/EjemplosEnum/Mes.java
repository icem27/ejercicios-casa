package EjemplosEnum;

public enum Mes {
	ENERO(Estacion.INVIERNO), FEBRERO(Estacion.INVIERNO), MARZO(Estacion.PRIMAVERA), ABRIL(Estacion.PRIMAVERA), MAYO(Estacion.PRIMAVERA), JUNIO(Estacion.VERANO), JULIO(Estacion.VERANO), AGOSTO(Estacion.VERANO), SEPTIEMBRE(Estacion.OTOÑO), OCTUBRE(Estacion.OTOÑO), NOVIEMBRE(Estacion.OTOÑO), DICIEMBRE(Estacion.INVIERNO);
	
	private Estacion estacion;
	
	private Mes(Estacion estacion){
		this.estacion=estacion;
	}
	
	
	public Estacion getEstacion() {
		return estacion;
	}


	public static void main(String[] args) {
		Mes[] meses =Mes.values();
		
		for(Mes mes:meses) {
			System.out.println("El mes de "  + mes.name() + " pertenece a la estación de " +  mes.getEstacion());
		}
	}
}
