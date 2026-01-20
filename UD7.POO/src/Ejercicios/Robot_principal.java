package Ejercicios;

public class Robot_principal {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.recogerPieza(2);
		System.out.println("Soy el robot R1 y peso: " + r1);
		Robot r2 = new Robot();
		r2.recogerPieza(4);
		System.out.println("Soy el robot R2 y peso: " + r2);
		r1.recogerPieza(r2);
		System.out.println("Soy el robot R1 y absorbí al R2 y tengo un peso: " + r1);
		System.out.println("Soy el robot R2 y peso: " + r2);
		r2.recogerPieza(3);
		System.out.println("Soy el robot R2 y peso: " + r2);

	}

}
