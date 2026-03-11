package EscuelaMagia;

public abstract class MagoElemental {
	String nombre;
	abstract String lanzarHechizo();
	
	public MagoElemental(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
