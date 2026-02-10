package Ejer2_herencias;

public class Trabajador extends Persona {
	/*
	 * Atributos: categoría profesional que puede tomar como valores A, B o C
	 * Antigüedad: entero (consideramos valor en meses) Constructores: por defecto y
	 * otro con parámetros para todos los atributos, incluso los de la clase
	 * Persona. Métodos set y get. Método toString para mostrar los valores de las
	 * cinco variables en una sola cadena.
	 */
	
	private char categoria_profesional;
	private int antiguedad;
	
	Trabajador(){
	}
	
	void validadorCategoria(char l) {
		char A = 'A', B = 'B', C = 'C';
		if(l!=A && l!=B && l!=C) {
			System.out.println("La categoria introducida no es correcta");
			this.categoria_profesional='X';
		} else {
			this.categoria_profesional=l;
		}
	}

	public Trabajador(String nombre, String telefono, int edad, char categoria_profesional, int antiguedad) {
		super(nombre, telefono, edad);
//		this.categoria_profesional = categoria_profesional;
		this.antiguedad = antiguedad;
		validadorCategoria(categoria_profesional);
	}

	public char getCategoria_profesional() {
		return categoria_profesional;
	}

	public void setCategoria_profesional(char categoria_profesional) {
		validadorCategoria(categoria_profesional);
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

//	@Override
//	public String toString() {
//		return super.toString()+" Trabajador [categoria_profesional=" + categoria_profesional + ", antiguedad=" + antiguedad + "]";
//	}
	
	

}
