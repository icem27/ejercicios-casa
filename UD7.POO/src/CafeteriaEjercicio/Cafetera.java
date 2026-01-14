package CafeteriaEjercicio;

public class Cafetera {
	/*
	 * Desarrolla una clase Cafetera con los atributos capacidadMaxima (la cantidad
	 * máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
	 * actual de café que hay en la cafetera).
	 * 
	 * Implementa, al menos, los siguientes métodos:
	 * 
	 * Constructor predeterminado: establece la capacidad máxima en 1000 (c.c.) y la
	 * actual en cero (cafetera vacía). Constructor con la capacidad máxima de la
	 * cafetera: inicializa la capacidad máxima poniendo la actual a cero.
	 * Constructor con la capacidad máxima y la cantidad actual: Si la cantidad
	 * actual es mayor que la capacidad máxima de la cafetera, la ajustará al
	 * máximo. llenarCafetera(): hace que la cantidad actual sea igual a la
	 * capacidad máxima. servirTaza(int cantidad): simula la acción de servir una
	 * taza con la capacidad indicada. Si la cantidad actual de café “no alcanza”
	 * para llenar la taza, se sirve lo que quede. vaciarCafetera(): pone la
	 * cantidad de café actual en cero. agregarCafe(int cantidad): añade a la
	 * cafetera la cantidad de café indicada. No se puede exceder la capacidad
	 * máxima Comprueba todos los métodos definidos desde una clase controladora en
	 * la que instancies diferentes cafeteras utilizando para ello cada uno de los
	 * constructores
	 */
	int capacidadMaxima;
	int cantidadActual;
	
	Cafetera(){
		this.capacidadMaxima=1000;
		this.cantidadActual=0;
	}
	Cafetera(int capacidadMax){
		this.capacidadMaxima=capacidadMax;
		this.cantidadActual=0;
	}
	Cafetera(int capacidadMax, int capacidadActual){
		if(capacidadActual>capacidadMax) {
			capacidadActual=capacidadMax;
		}
		this.capacidadMaxima=capacidadMax;
		this.cantidadActual=capacidadActual;
	}
	public void llenarCafeteria() {
		this.cantidadActual=this.capacidadMaxima;
	}
	public void servirTaza(int cantidad) {
		if(this.cantidadActual<cantidad) {
			this.cantidadActual=0;
		}
		else {
			this.cantidadActual=this.cantidadActual-cantidad; 
		}
	}
	public void vaciarCafetera() {
		this.cantidadActual=0;
	}
	public void rellenarCafetera(int cantidad) {
		this.cantidadActual+=cantidad;
		if(this.cantidadActual>this.capacidadMaxima) {
			this.cantidadActual=this.capacidadMaxima;
		}
	}
}
