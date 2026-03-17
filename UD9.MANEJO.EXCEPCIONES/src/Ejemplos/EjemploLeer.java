package Ejemplos;

import java.io.IOException;

public class EjemploLeer {

	public static void main(String[] args) {
		System.out.println("Introduce letra: ");
		try {
			char letra = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
