package Ejemplos;

public class pruebas {

	public static void main(String[] args) {
		String siglas = "IV";
		String consonantesAleatorias = "BCDFGHJKLMNPQRSTVWXYZ";
		String nivelAcceso = "AEIOU";
		String constantesAleatorioDos = "";
		char nivelAccesoDos = ' ';
		int cuatroNumerosAleatorio = 0;
		String guion = "-";
		boolean signasCorrectas = false;
		String mensaje = "";
		String mensaje2 = "";
		int mensaje1 = 0;
		int numAleatorioConstantes;
		int numAleatorioNivelAceso;
		int contadorLetras = 0, contadorNumeros = 0, contadorGuion = 0;
		int contadorFrase = 0;
		int contadorPro=0;
		int cantidadFrase = 0;
		int contadorMaestro=0;
		int contadorPrioritario=0;
		int contadorBasico=0;
		int contadorLetraA=0;
		int contadorDivisble=0;
		
		do {
		contadorPro++;	
		cuatroNumerosAleatorio = 0;
		nivelAccesoDos = ' ';
		constantesAleatorioDos = "";
		mensaje = "";
		contadorLetras=0;
		contadorNumeros=0;
		contadorGuion=0;
		int numerosAleatorios = (int) (Math.random() * (9999 - 1000 + 1) + 1000);
		/*
		numAleatorioConstantes = (int) (Math.random() * (consonantesAleatorias.length()));
		constantesAleatorioDos += consonantesAleatorias.charAt(numAleatorioConstantes);
*/
		for(int i=0;i<2;i++) {
			numAleatorioConstantes = (int)(Math.random()*(20-1+1)+1);
			constantesAleatorioDos+= consonantesAleatorias.charAt(numAleatorioConstantes);
		}
		numAleatorioNivelAceso = (int) (Math.random() * (nivelAcceso.length()));
		nivelAccesoDos += nivelAcceso.charAt(numAleatorioNivelAceso);
		nivelAccesoDos = Character.toUpperCase(nivelAccesoDos);
		
		cuatroNumerosAleatorio += numerosAleatorios;
		boolean numDivisible = cuatroNumerosAleatorio % 7 == 0;
		
		boolean ultimaLetraA = nivelAccesoDos=='A';

		String palabraFinalClave = new String(
				siglas + guion + constantesAleatorioDos + guion + cuatroNumerosAleatorio + guion + nivelAccesoDos);
		int pos = 1;
		boolean ultimaLetra = false;
		for (int i = 0; i < palabraFinalClave.length(); i++) {
			char c = palabraFinalClave.charAt(i);

			pos = palabraFinalClave.indexOf("IV");

			if (pos == 0) {
				signasCorrectas = true;
			}

			if (Character.isAlphabetic(c)) {
				contadorLetras++;
			}
			if (Character.isDigit(c)) {
				contadorNumeros++;
			}
			if (!Character.isAlphabetic(c) && !Character.isDigit(c)) {
				contadorGuion++;
			}
			
		}
		
		cantidadFrase=contadorLetras + contadorNumeros + contadorGuion;
		boolean fraseCompleta=false;
		if (cantidadFrase==12) {
			fraseCompleta=true;
		}
		if(fraseCompleta && contadorGuion==3) {
		if (numDivisible && ultimaLetraA) {
			mensaje = "Identificador maestro";
			contadorMaestro++;
		} else if (ultimaLetraA && !numDivisible) {
			mensaje = "Nivel de acceso prioritario";
			contadorPrioritario++;
		} else if (numDivisible){
			mensaje="Identificador estable";
			contadorDivisble++;
		} else {
			mensaje = "Identificador básico";
			contadorBasico++;
		}
		}
		String palabraFinalClave1 = new String(palabraFinalClave + " --> " + mensaje);
		System.out.println(palabraFinalClave1);
		} while(contadorPro<5);
		
		
		
		System.out.println("==== RESUMEN ====");
		System.out.println("Identificador basico: " + contadorBasico);
		System.out.println("Identificador prioritario: " + contadorLetraA);
		System.out.println("Identificador estable: " + contadorDivisble);
		System.out.println("Identificador maestros: " + contadorMaestro);

	}
}
