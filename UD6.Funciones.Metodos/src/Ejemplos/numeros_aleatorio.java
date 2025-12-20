package Ejemplos;

public class numeros_aleatorio {
	public static void main(String[] args) {
//		int cantidad=5;
//		int[] nums = new int[cantidad];
//		boolean[] salido = new boolean[cantidad];
//		
//		for(int i=0;i<cantidad;i++) {
//			int random;
//			do {
//				random=(int)(Math.random()*cantidad);
//			} while(salido[random] || random == i);
//			salido[random]=true;
//			nums[i]=random;
//		}
//		System.out.println(Arrays.toString(nums));
		String posicion = "10";
		int posicion0 = Integer.parseInt(Character.toString(posicion.charAt(0)));
		int posicion1 = Integer.parseInt(Character.toString(posicion.charAt(1)));
		System.out.println(posicion0 + " " + posicion1);
		
}
}


