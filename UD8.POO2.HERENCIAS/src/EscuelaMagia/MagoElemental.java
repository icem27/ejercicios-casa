package EscuelaMagia;

public abstract class MagoElemental implements Comparable<MagoElemental>{
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

	@Override
	public int compareTo(MagoElemental o) {
		return this.nombre.compareTo(o.nombre);
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + " presente";
	}
	
	

}
