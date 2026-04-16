package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f = new File("./src/Ejercicios/ejercicio1.txt");
		try {
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("Bienvenido a mi aplicación. ");
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Apellido: ");
			String apellido= sc.nextLine();
			System.out.print("Teléfono: ");
			int tel = sc.nextInt();
			bw.newLine();
			bw.write(nombre);
			bw.newLine();
			bw.write(apellido);
			bw.newLine();
			bw.write(""+tel);
			bw.close();
			System.out.println("En el fichero " + f.getName() + " se encuentra lo siguiente: ");
			leerFicheroBuf(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void leerFicheroBuf(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		while(linea!=null) {
			System.out.println(linea);
			linea=br.readLine();
		}
		br.close();
	}

}
