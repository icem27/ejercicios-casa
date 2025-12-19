package EstructurasRepetetivas;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Obtener un listado con los números del 1 al 10. 
		// En la posición del cinco en lugar de salir el número ha de salir la palabra ‘CINCO’.

		for (int i=1; i<=10; i+=1) {
			if (i==5) {
				System.out.println("Cinco");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
