package Ejemplos;
import java.io.*;

public class Ejemplo3 {
	public static void main(String[] args) {
		System.out.println("INFORMACIÓN DEL FICHERO f1.txt");
		System.out.println("========-------=======------===");
		File f = new File("C://Users//manana//Documents//FILES//n1.txt");
		if(f.exists()) {
			System.out.println("Nombre del fichero: " + f.getName());
			System.out.println("Ruta relativa: " + f.getPath());
			System.out.println("Ruta absoluta: " + f.getAbsolutePath());
			System.out.println("¿Se puede leer?" + f.canRead());
			System.out.println("Se puede escribir" + f.canWrite());
			System.out.println("Tamaño: " + f.length());
			System.out.println("¿Es un directorio?" + f.isDirectory());
			System.out.println("¿Es un archivo?" + f.isFile());
		}
	}
}
