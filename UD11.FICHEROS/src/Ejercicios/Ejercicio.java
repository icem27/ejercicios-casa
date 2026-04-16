package Ejercicios;

import java.io.*;

public class Ejercicio {
	public static void main(String[] args) {
		File f = new File("./src/Ejercicios/capital.txt");
		try {
			contarCaracteres(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void contarCaracteres(File f) throws IOException {
		FileReader fr = new FileReader(f);
		
		int letra = fr.read();
		int totLetras=0;
		while(letra !=-1) {
			totLetras++;
			letra=fr.read();
		}
		fr.close();
		System.out.println("El fichero tiene " + totLetras + " caracteres");
		
	}

}
