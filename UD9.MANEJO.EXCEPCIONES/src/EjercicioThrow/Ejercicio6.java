package EjercicioThrow;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] array = cargarArray(pedirFilas(), pedirColumna());
		visualizarArray(array);

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
	
	public static int[][] cargarArray(int filas, int cols){
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
	
	public static int pedirFilas() {
		return pedirFilasColumnas(false);
	}
	
	public static int pedirColumna() {
		return pedirFilasColumnas(true);
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
