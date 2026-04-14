package Ejemplos;
import java.io.*;
public class ejemplo2 {
	public static void main(String[] args) {
		//Mostrar una lista de los ficheros que hay en el directorio
		
		System.out.println("Ficheros en el directorio FILES de documentos: ");
		File f1 = new File("C://Users//manana//Documents//FILES");
		
		String[] archivos = f1.list();
		for(int i=0;i<archivos.length;i++) {
			System.out.println(archivos[i]);
		}
	}

}
