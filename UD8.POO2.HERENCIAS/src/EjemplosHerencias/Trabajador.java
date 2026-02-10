package EjemplosHerencias;

public class Trabajador {
	protected String nombre;
	protected String puesto;
	protected String direccion;
	
	public Trabajador(String nombre, String puesto, String direccion) {
		this.nombre = nombre;
		this.puesto = puesto;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Puesto: " + puesto + ", Dirección: " + direccion;
	}
	
	public double calcularPaga() {
		return 0;
	}
	
}
