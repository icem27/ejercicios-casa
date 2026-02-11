package Ejer2_herencias;

public class Trabajador extends Persona {
	/*
	 * Atributos: categoría profesional que puede tomar como valores A, B o C
	 * Antigüedad: entero (consideramos valor en meses) Constructores: por defecto y
	 * otro con parámetros para todos los atributos, incluso los de la clase
	 * Persona. Métodos set y get. Método toString para mostrar los valores de las
	 * cinco variables en una sola cadena.
	 */
	
	private Categoria_profesional categoria;
	private int antiguedad;
	
	Trabajador(){
	}
	
	void validadorCategoria(Categoria_profesional l) {
		if(l!=Categoria_profesional.A && l!=Categoria_profesional.B && l!=Categoria_profesional.C) {
			System.out.println("La categoria introducida no es correcta");
			this.categoria=null;
		} else {
			this.categoria=l;
		}
	}

	public Trabajador(String nombre, String telefono, int edad, Categoria_profesional categoria_profesional, int antiguedad) {
		super(nombre, telefono, edad);
//		this.categoria_profesional = categoria_profesional;
		this.antiguedad = antiguedad;
		validadorCategoria(categoria_profesional);
	}

	public Categoria_profesional getCategoria_profesional() {
		return categoria;
	}

	public void setCategoria_profesional(Categoria_profesional categoria_profesional) {
		validadorCategoria(categoria_profesional);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return super.toString()+" Trabajador [categoria_profesional=" + categoria + ", antiguedad=" + antiguedad + "]";
	}
	
	

}
