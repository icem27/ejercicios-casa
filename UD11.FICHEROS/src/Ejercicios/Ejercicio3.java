package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			File f = escribirFichero();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static File escribirFichero() throws IOException {
		File f = new File("./src/Ejercicios/datosTeclado.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		String texto="";
		System.out.println("Bienvenido a mi aplicación. ");
		do {
			System.out.print("Texto: ");
			texto = sc.nextLine();
			if (!texto.equals("JAJAVA")) {
				bw.write(texto);
				bw.newLine();
			}
		} 
		while(!texto.equals("JAJAVA"));
		System.out.println("Adiós!");
		bw.flush();
		bw.close();
		return f;
	}

}
