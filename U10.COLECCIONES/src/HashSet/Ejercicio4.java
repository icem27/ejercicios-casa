package HashSet;

import java.util.HashSet;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Dados los conjuntos A y B. Realiza un programa que calcule la diferencia
		 * simétrica entre A y B sabiendo que la diferencia simétrica es un conjunto que
		 * contiene todos los elementos de A y de B salvo aquellos que pertenecen a
		 * ambos.
		 */
		
		HashSet<Integer> a = new HashSet<Integer>();	
		HashSet<Integer> b = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		b.add(4);
		b.add(5);
		b.add(6);
		System.out.println("A: ");
		mostrar(a);
		System.out.println("B: ");
		mostrar(b);
		//Creo un conjunto a partir de A
		HashSet<Integer> unionA=new HashSet<Integer>(a);
		unionA.addAll(b);
		System.out.println("==== Unión AUB:");
		mostrar(unionA);
		HashSet<Integer> intersecA=new HashSet<Integer>(a);
		intersecA.retainAll(b);
		System.out.println("Intersección AvB:");
		mostrar(intersecA);
		System.out.println("====== Direferencia simétrica: ");
		unionA.removeAll(intersecA);
		mostrar(unionA);
	}
	
	public static void mostrar(HashSet<Integer> num) {
		for(int x:num) {
			System.out.println(x);
		}
	}

}
