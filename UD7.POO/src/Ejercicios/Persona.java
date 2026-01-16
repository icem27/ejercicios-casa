package Ejercicios;

import NifEjercicio.Nif;

public class Persona {
	private Nif dni = new Nif(); 
	private String nombre;
	private String nif;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	Persona(){
		this.nombre=" ";
		this.edad=0;
		this.altura=0;
		this.peso=0;
		this.sexo = 'H';
		this.nif = generarDNI();
	}
	Persona(String nombre, int edad, char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	Persona(String nombre, int edad, char sexo, double peso, double altura){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo = sexo;
		this.peso=peso;
		this.altura=altura;
		this.nif = generarDNI();
	}
	public int calcularIMC() {
		final int POR_DEBAJO=-1, PESO_IDEA=0, SOBREPESO=1;
		double altura_en_metros=this.altura/100;
		double calcula=this.peso/Math.pow(altura_en_metros, 2);
		if(calcula>25) return POR_DEBAJO;
		else if(calcula<18.5) return SOBREPESO;
		else return PESO_IDEA;
	}
	public boolean esMayorDeEdad() {
		if(this.edad>=18) return true;
		return false;
	}
	public boolean comprobarSexo(char sexo) {
		if(this.sexo==sexo) return true;
		return false;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + nif + ", nombre=" + nombre + ", edad=" + edad + ", SEXO=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	public String generarDNI() {
		int numeroAleatorio = (int) (Math.random() * 90000000 + 10000000);
		this.dni.numero = numeroAleatorio;
		this.dni.CalcularLetra();
		String dni_final = this.dni.numero + "-" + this.dni.letra;
		return dni_final;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
