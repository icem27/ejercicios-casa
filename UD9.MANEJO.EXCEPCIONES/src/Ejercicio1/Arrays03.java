package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	}
	
	
	
	public static int[][] cargarArray(int filas, int cols){
		int[][] numeritos=new int[filas][cols];
		for(int i=0;i<numeritos.length;i++) {
			for(int j=0;i<numeritos[i].length;i++) {
				numeritos[i][j]=pedirFilasColumnas(false);
			}
		}
		return numeritos;
	}
	
	public static int pedirFilas() {
		return pedirFilasColumnas(false);
	}

	public static int pedirFilasColumnas(boolean filas) {
		int num = 0;
		boolean correcto=false;
		do {
		try {
			if(filas) {
				System.out.println("Introduce el número de filas: ");
			} else {
				System.out.println("Introduce el número de columnas:");
			}
			num = sc.nextInt();
			correcto = (num <4 && num >= 2);
		} catch  (InputMismatchException e) {
			System.out.println("Debes introducir un número");
			sc.nextLine();
		}
		} while(!correcto);
		return num;
	}
	
	
	
}
