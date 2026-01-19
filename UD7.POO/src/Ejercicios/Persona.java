package Ejercicios;

import NifEjercicio.Nif;

public class Persona {
	static final char HOMBRE='H', MUJER='M', OTRO='O';
	static final int POR_DEBAJO=-1, PESO_IDEA=0, SOBREPESO=1;
	
	private String nombre;
	private int edad=0;
	private Nif dni ;
	private char sexo=HOMBRE;
	private double peso=0;
	private double altura=0;
	
	Persona(){
	}
	
	Persona(String nombre, int edad, char sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		generarDNI();
	}
	Persona(String nombre, int edad, char sexo, double peso, double altura){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo = sexo;
		this.peso=peso;
		this.altura=altura;
	}
	public int calcularIMC() {
		double calcula=this.peso/Math.pow(this.altura, 2);
		if(calcula>25) return POR_DEBAJO;
		else if(calcula<18.5) return SOBREPESO;
		else return PESO_IDEA;
	}
	public boolean esMayorDeEdad() {
		if(this.edad>=18) return true;
		return false;
	}
	private char comprobarSexo(char sexo) {
		if(sexo==HOMBRE || sexo==MUJER || sexo==OTRO) {
		return sexo;
		} else {
			return HOMBRE;
		}
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", SEXO=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	private void generarDNI() {
		long numeroAleatorio = (long) (Math.random() * 90000000 + 10000000);
		char letra=dni.CalcularLetra();
		dni=new Nif(numeroAleatorio, letra);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public boolean sexoCorrecto(char sexo) {
		boolean esCorrecto=comprobarSexo(sexo)==this.sexo;
		return esCorrecto;
	}
	
}
