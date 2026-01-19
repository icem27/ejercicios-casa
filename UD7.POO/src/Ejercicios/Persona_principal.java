package Ejercicios;

public class Persona_principal {

	public static void main(String[] args) {
		Persona miPersona = new Persona();
		miPersona.setNombre("Ismael");
		miPersona.setEdad(18);
		miPersona.setAltura(180);
		miPersona.setPeso(80);
		miPersona.setSexo('H');
		int pesoIdeal = miPersona.calcularIMC();
		boolean mayorEdad = miPersona.esMayorDeEdad();
		Persona miPersona1 = new Persona("Chaniel", 22, 'M', 89, 170);
		int pesoIdeal1 = miPersona1.calcularIMC();
		boolean mayorEdad1 = miPersona1.esMayorDeEdad();
		//Datos de la persona
		System.out.println(miPersona);
		//Comprobación del peso
		if(pesoIdeal>0) System.out.println("Tienes sobre peso");
		else if (pesoIdeal<0) System.out.println("Estas por debajo de su peso ideal");
		else System.out.println("Tu peso es el ideal");
		//Comprobar la mayoria de edad
		if(mayorEdad) System.out.println("Eres mayor de edad");
		else System.out.println("Eres menor de edad");
		//Comprobar sexo
		if(miPersona.sexoCorrecto(miPersona.getSexo())) System.out.println("El sexo es correcto");
		else System.out.println("El sexo es incorrecto");
		//Datos de la persona1
		System.out.println(miPersona1);
		//Comprobación del peso
		if(pesoIdeal1>0) System.out.println("Tienes sobre peso");
		else if (pesoIdeal1<0) System.out.println("Estas por debajo de su peso ideal");
		else System.out.println("Tu peso es el ideal");
		//Comprobar la mayoria de edad
		if(mayorEdad1) System.out.println("Eres mayor de edad");
		else System.out.println("Eres menor de edad");
		//Comprobar sexo
		if(miPersona1.sexoCorrecto(miPersona.getSexo())) System.out.println("El sexo es correcto");
		else System.out.println("El sexo es incorrecto");
	}

}
