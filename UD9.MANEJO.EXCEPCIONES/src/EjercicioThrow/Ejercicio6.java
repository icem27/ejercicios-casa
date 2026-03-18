package EjercicioThrow;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
			int filas=0;
			int columnas=0;
			try {
				filas=pedirFilas();
			} catch (InputMismatchException x) {
				System.out.println(x.getMessage());
				sc.nextLine();
			} 
			try {
				columnas=pedirColumna();
			} catch (InputMismatchException x) {
				System.out.println(x.getMessage());
				sc.nextLine();
			} 
			int[][] array;
			try {
				array = cargarArray(filas, columnas);
				visualizarArray(array);
			} catch (ExcepcionRango e) {
				System.out.println(e.getMessage());
			}
			
	}
	
	public static void visualizarArray(int[][] array) {
		try {
		for(int[] a:array) {
			System.out.println(Arrays.toString(a));
		}
		} catch (Exception e) {
			System.out.println("El array esta null");
		}
	}
	
	public static void comprobarTamanio(int filas, int cols) throws ExcepcionRango {
		if(filas<2 || filas>4 || cols<2 || filas>4) {
			throw new ExcepcionRango("Error en el tamaño");
		}
	}
	
	public static int[][] cargarArray(int filas, int cols) throws ExcepcionRango{
		comprobarTamanio(filas,cols);
		int[][] numeritos=new int[filas][cols];
		boolean correcto = false;
		do {
		for(int i=0;i<numeritos.length;i++) {
			for(int j=0;j<numeritos[i].length;j++) {
				try {
				System.out.println("Introduce el valor de la fila " + (1+i) + " y la columna " +(j+1));
				numeritos[i][j]=sc.nextInt();
				correcto=true;
				} catch (InputMismatchException x) {
					System.out.println("El dato no es el correcto");
					System.out.println(x.getMessage());
					correcto = false;
					sc.nextLine();
					j--;
				} catch (ArrayIndexOutOfBoundsException y) {
					System.out.println("El rango no es el correcto. ");
					System.out.println(y.getMessage());
					correcto = false;
					sc.nextLine();
					j--;
				} catch (Exception x) {
					System.out.println("Este es el general");
					System.out.println(x.getMessage());
					correcto = false;
					sc.nextLine();
					j--;
				}
			}
		}
		} while(!correcto);
		
		return numeritos;
	}
	
	public static int pedirFilas() throws InputMismatchException {
		try {
			return pedirFilasColumnas(true);
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Error en la fila");
		}
	}
	
	public static int pedirColumna() {
		try {
			return pedirFilasColumnas(false);
		} catch (InputMismatchException e) {
			System.out.println("Error en la columna");
		}
		return 0;
	}

	public static int pedirFilasColumnas(boolean filas) throws InputMismatchException {
		int num = 0;
			if(filas) {
				System.out.println("Introduce el número de filas: ");
			} else {
				System.out.println("Introduce el número de columnas:");
			}
			num = sc.nextInt();
		return num;
	}
}
