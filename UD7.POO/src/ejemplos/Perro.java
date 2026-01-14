package ejemplos;

public class Perro {
	String raza;
	String color;
	String nombre;
	String tamanio;
	Perro(){
		
	}
	
	Perro(String raza, String color, String nombre, String tamanio){
		this.raza=raza;
		this.color=color;
		this.nombre=nombre;
		this.tamanio=tamanio;
	}
	public void ladrar() {
		System.out.println("Guau");
	}
	public void comer() {
		System.out.println("Comiendo");
	}
	public void jugar() {
		System.out.println("Jugando");
	}
}
