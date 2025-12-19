package EstructurasRepetetivas;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Utilizando bucle FOR
		System.out.println("-------- FOR -------");
		for(int i = 2; i <= 20; i+=2) {
			System.out.println(i);
		} 
		//Utilizando bucle WHILE
		System.out.println("-------- WHILE -------");
		int k=2;
		while (k<=20){
			System.out.println(k);
			k+=2;
		}
		//Utilizando bucle DO WHILE
		System.out.println("-------- DO WHILE -------");
		int n=2;
		do {
			System.out.println(n);
			n+=2;
		} while (n<=20);
	}

}
