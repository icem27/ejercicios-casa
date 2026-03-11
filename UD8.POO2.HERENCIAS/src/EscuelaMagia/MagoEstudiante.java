package EscuelaMagia;

public class MagoEstudiante extends MagoElemental implements Aprendiz {
	
	
	public MagoEstudiante(String nombre) {
		super(nombre);
	}

	@Override
	String lanzarHechizo() {
		return "Aún estoy en prácticas y no me han dado elemento...";
		
	}

	@Override
	public String mensaje() {
		return "Shhh, estoy estudiando";
	}
	
	

}
