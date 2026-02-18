package EjercicioHerencia;

import java.util.Locale;

public class Empresa_Empleado {
	protected String nombre, dni;
	protected int edad;
	protected boolean casado;
	protected double salario;
	
	public Empresa_Empleado(){
	}

	public Empresa_Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	public String calificacion_edad() {
		if(edad>35) {
			return "Senior";
		} else if (edad>=22 && edad<=35) {
			return "Intermedio";
		} else {
			return "Principiante";
		}
	}
	
	public String verificar_edad() {
		if(edad>=18 && edad<=45) {
			return String.valueOf(edad);
		} else 
			return "La edad introducida no es correcta";
	}
	
	public String estado_civil() {
		if(casado) {
			return "Casado";
		} else {
			return "Soltero";
		}
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nDNI: " + dni + "\nEdad: " + verificar_edad() + "\nEstado Civil: " + estado_civil()
				+ "\nSalario: " + String.format(Locale.GERMAN,"%,.2f€", salario) + "\nCalificiación segun la edad: "+ calificacion_edad();
	}
	

}
