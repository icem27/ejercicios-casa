package EjercicioHerencia;

public class Empresa_Programador extends Empresa_Empleado {
	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;
	
	public Empresa_Programador() {
		
	}

	public Empresa_Programador(String nombre, String dni, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, dni, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	@Override
	public String toString() {
		return super.toString()+"\nlineas De Codigo Por Hora: " + lineasDeCodigoPorHora + "\nLenguaje Dominante: "
				+ lenguajeDominante;
	}
	
	
	
	
	
	
	
}
