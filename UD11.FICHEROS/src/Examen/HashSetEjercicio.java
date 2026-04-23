package Examen;

import java.util.HashSet;

public class HashSetEjercicio {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(4);
		B.add(5);
		B.add(6);
		
		HashSet<Integer> C = new HashSet<Integer>(A);
		C.addAll(B);
		
		HashSet<Integer> D = new HashSet<Integer>(A);
		D.retainAll(B);
		
		HashSet<Integer> S = new HashSet<Integer>(C);
		S.removeAll(D);
		
		for(Integer o: A) {
			System.out.println(o);
		}

	}
}
