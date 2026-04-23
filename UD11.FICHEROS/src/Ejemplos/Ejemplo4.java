package Ejemplos;

import java.io.*;
import java.util.Scanner;

public class Ejemplo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			File fichero = new File("./src/ejemplos/Fichero1.txt");
//			FileWriter fw = new FileWriter(fichero);
			PrintWriter fw = new PrintWriter(fichero);
			BufferedWriter bw=new BufferedWriter(fw);
			System.out.println("Añade un texto: ");
			String texto = sc.nextLine();
			System.out.println("Suma [1]: ");
			int num1=sc.nextInt();
			System.out.println("Suma [2]: ");
			int num2=sc.nextInt();
			int suma=num1+num2;
			bw.newLine();
			bw.write(texto);
			bw.newLine();
			bw.write("La suma de "+ num1 + "+" + num2 + ": " + suma);
			bw.close();
			System.out.println("Se ha añadido correctamente");
			leerFicheroBuf(fichero);
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
	
	public static void leerFichero(File f) throws IOException {
		FileReader fr = new FileReader(f);
		int cara=fr.read();
		
		while(cara!=-1) {
			System.out.print((char)cara);
			cara=fr.read();
		}
		fr.close();
	}

}
