package Ejemplos;

public class Ejemplo_mision {

	public static void main(String[] args) {
		int[] array = new int[10];
		int aleatorio;
		array[0] = (int) (Math.random() * 151);
		int max = array[0], min = array[0];

		for (int i = 0; i < array.length; i++) {
			aleatorio = (int) (Math.random() * 151);
			array[i] = aleatorio;
			min = Math.min(min, array[i]);
			max = Math.max(max, array[i]);
		}

		for (int a : array) {
			System.out.println(a);
		}
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		int media = suma / array.length;

		if (media > 90 && media < 110) {
			System.out.println("Flujo temporal estable");
		} else {
			System.out.println("Inestabilidad detectada, es necesaria la recalibración");
		}
		
		if(max>140) {
			System.out.println("¡Alerta! Pico de energía crítico detectado, riesgo de ruptura temporal");
		}
		if(min<95) {
			System.out.println("Advertencia: nivel de energía bajo detectado, posible debilitamiento del portal.");
		}
		
		System.out.println("Max: " + max + " | Min: " + min + " | media: " + media);
	}

}
