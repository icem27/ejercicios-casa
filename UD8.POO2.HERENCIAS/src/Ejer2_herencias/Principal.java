package Ejer2_herencias;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Realizar una clase de prueba que contendrá el método main, en la que:
		 * 
		 * Se creen dos objetos de la clase Trabajador. El primero se instanciará con el
		 * constructor por defecto y posteriormente se le introducirá el contenido a sus
		 * atributos utilizando los correspondientes métodos set. El segundo se
		 * instanciará utilizando el constructor que utiliza todos los parámetros y al
		 * que le pasaremos como valores la información leída desde teclado. Visualizar
		 * contenido de los dos objetos utilizando el método toString() que has
		 * programado. Recuerda que este método no imprime directamente el contenido del
		 * objeto, sino que devuelve un String al programa que lo invoca, en ese
		 * programa se hará lo necesario con esta cadena. Visualizar el nombre del
		 * trabajador de más antigüedad. Una vez que te ha funcionado el programa hasta
		 * esta parte, comenta el método toString() en las dos clases y ejecuta de nuevo
		 * el programa sin suprimir la llamada al método toString().
		 * 
		 * ¿Qué pasa cuando utilizas el método toString y por qué?
		 */
		
		Trabajador t1 = new Trabajador();
		t1.setNombre("Juan");
		t1.setTelefono("987654728");
		t1.setEdad(34);
		t1.setCategoria_profesional(Categoria_profesional.B);
		t1.setAntiguedad(12);
		System.out.println(t1.toString());
		
		

		Trabajador t2 = new Trabajador("Ismael", "659865986", 25, Categoria_profesional.A, 24);
		System.out.println(t2.toString());
		
		if(t1.getAntiguedad()>t2.getAntiguedad()) {
			System.out.println("El trabajador con más antiguedad es: " + t1.getNombre());
		} else {
			System.out.println("El trabajador con más antiguedad es: " + t2.getNombre());
		}
		/*No se visualiza el contenido del objeto al comentar el toString, solo se visualiza el espacio de memoria donde se ubica*/
	}

}
