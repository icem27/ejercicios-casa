package Mision3;

public class prueba {

	public static void main(String[] args) {
		String siglas= "IV";
		String consonantesAleatorias = "BCDFGHJKLMNPQRSTVWXYZ";
		String nivelAcceso = "AEIOU";
		String constantesAleatorioDos="";
		String nivelAccesoDos="";
		String cuatroNumerosAleatorio="";
		String guion ="-";
		boolean signasCorrectas = false;
		String mensaje="";
		int numAleatorioConstantes;
		int numAleatorioNivelAceso;
		int contadorLetras=0, contadorNumeros=0, contadorGuion=0;
		int contadorFrase=0;
		
		int numerosAleatorios = (int)(Math.random()*(9999-1000+1)+1000);
		for(int i=0;i<2;i++) {
			numAleatorioConstantes = (int)(Math.random()*(consonantesAleatorias.length()));
			constantesAleatorioDos+= consonantesAleatorias.charAt(numAleatorioConstantes);
		}
		
		for(int i=0;i==0;i++) {
			numAleatorioNivelAceso = (int)(Math.random()*(nivelAcceso.length()));
			nivelAccesoDos+= nivelAcceso.charAt(numAleatorioNivelAceso);
		}
		
		for(int i=0;i==0;i++) {
			cuatroNumerosAleatorio+= numerosAleatorios;
		}
		
		String palabraFinalClave = new String (siglas+guion+constantesAleatorioDos+guion+cuatroNumerosAleatorio+guion+nivelAccesoDos);
		

		int pos=1;
		
		for(int i=0;i<palabraFinalClave.length();i++) {
			char c = palabraFinalClave.charAt(i);
			
		pos=palabraFinalClave.indexOf("IV");
		
		if(pos==0) {
			signasCorrectas=true;
		}
		
		if (Character.isAlphabetic(c)) {
			contadorLetras++;
		} 
		if(Character.isDigit(c)) {
			contadorNumeros++;
		} 
		if (!Character.isAlphabetic(c) && !Character.isDigit(c) ) {
			contadorGuion++;
		}
		
		if(nivelAccesoDos.equals("A")) {
			mensaje = "Nivel de acceso prioritario";
		}

		System.out.println(palabraFinalClave);
	}	
		System.out.println(contadorLetras+contadorNumeros+contadorGuion);
		System.out.println(mensaje);
		
		
	}
	}
