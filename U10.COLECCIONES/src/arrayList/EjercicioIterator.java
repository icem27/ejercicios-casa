package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EjercicioIterator {
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random()*(20-10+1))+10;
		ArrayList<Integer> nums = new ArrayList<Integer>(aleatorio);
		System.out.println("El tamaño del arraylist ahora es de:  " + nums.size());

		int min = -1;
		int max = -1;
		int suma = 0;
		int media = 0;
		for(int i=0;i<aleatorio;i++) {
			int numeros = (int) (Math.random()*(30+1));
			nums.add(numeros);
			min=numeros;
		}
		for(Integer a : nums) {
			System.out.println(a);
			if (min > a) {
				min = a;
			}
			if (max < a) {
				max=a;
			}
			suma+=a;
		}
		System.out.println("El tamaño del arraylist ahora es de:  " + nums.size());
		System.out.println("Mayor: " + max);
		System.out.println("Min: " + min);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + (suma/nums.size()));
		Iterator<Integer> it = nums.iterator();
		System.out.println("===================================================");
		System.out.println("Con el iterator: ");
		int eliminacion = (int) (Math.random()*(30+1));
		System.out.println("Se buscará el número " + eliminacion + " en el arraylist para su eliminación. ");
		while(it.hasNext()) {
			int valor = it.next();
			if (valor==eliminacion) {
				it.remove();
			}
			
		}
		suma=0;
		for(Integer a : nums) {
			System.out.println(a);
			if (min > a) {
				min = a;
			}
			if (max < a) {
				max=a;
			}
			suma+=a;
		}
		System.out.println("El tamaño del arraylist ahora es de:  " + nums.size());
		System.out.println("Mayor: " + max);
		System.out.println("Min: " + min);
		System.out.println("Suma: " + suma);
		System.out.println("Media: " + (suma/nums.size()));
		Collections.sort(nums);
		System.out.println("=============================");
		System.out.println("Ahora los números ordenados: ");
		for(Integer a : nums) {
			System.out.println(a);
		}
		
	}
}
