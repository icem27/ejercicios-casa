package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			File f = escribirFichero();
			leerFicheroBuf(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerFicheroBuf(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		System.out.println("En el fichero " + f.getName() + " se encuentra lo siguiente: ");
		while(linea!=null) {
			System.out.println(linea);
			linea=br.readLine();
		}
		br.close();
	}
	
	public static File escribirFichero() throws IOException {
		File f = new File("./src/Ejercicios/ejercicio2.txt");
		if (!f.exists()) {
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Bienvenido a mi aplicación. ");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Apellido: ");
		String apellido= sc.nextLine();
		System.out.print("Teléfono: ");
		String tel = sc.nextLine();
		bw.write(nombre);
		bw.newLine();
		bw.write(apellido);
		bw.newLine();
		bw.write(tel);
		bw.newLine();
		bw.close();
		return f;
	}

}
