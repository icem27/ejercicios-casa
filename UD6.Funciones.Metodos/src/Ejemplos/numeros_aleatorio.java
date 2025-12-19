package Ejemplos;

import java.util.Arrays;

public class numeros_aleatorio {
	public static void main(String[] args) {
		int cantidad=5;
		int[] nums = new int[cantidad];
		boolean[] salido = new boolean[cantidad];
		
		for(int i=0;i<cantidad;i++) {
			int random;
			do {
				random=(int)(Math.random()*cantidad);
			} while(salido[random] || random == i);
			salido[random]=true;
			nums[i]=random;
		}
		System.out.println(Arrays.toString(nums));
		
		
}
}


