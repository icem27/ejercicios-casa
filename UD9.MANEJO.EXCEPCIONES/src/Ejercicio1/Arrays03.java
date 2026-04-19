package Ejercicio1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arrays03 {
	static Scanner sc = new Scanner(System.in);
//	public static void main(String[] args) {
//		int[][] array = cargarArray(pedirFilas(), pedirColumna());
//		visualizarArray(array);
//
//	}
//	
//	public static void visualizarArray(int[][] array) {
//		try {
//		for(int[] a:array) {
//			System.out.println(Arrays.toString(a));
//		}
//		} catch (Exception e) {
//			System.out.println("El array esta null");
//		}
//	}
//	
//	public static int[][] cargarArray(int filas, int cols){
//		int[][] numeritos=new int[filas][cols];
//		boolean correcto = false;
//		do {
//		for(int i=0;i<numeritos.length;i++) {
//			for(int j=0;j<numeritos[i].length;j++) {
//				try {
//				System.out.println("Introduce el valor de la fila " + (1+i) + " y la columna " +(j+1));
//				numeritos[i][j]=sc.nextInt();
//				correcto=true;
//				} catch (InputMismatchException x) {
//					System.out.println("El dato no es el correcto");
//					System.out.println(x.getMessage());
//					correcto = false;
//					sc.nextLine();
//					j--;
//				} catch (ArrayIndexOutOfBoundsException y) {
//					System.out.println("El rango no es el correcto. ");
//					System.out.println(y.getMessage());
//					correcto = false;
//					sc.nextLine();
//					j--;
//				} catch (Exception x) {
//					System.out.println("Este es el general");
//					System.out.println(x.getMessage());
//					correcto = false;
//					sc.nextLine();
//					j--;
//				}
//			}
//		}
//		} while(!correcto);
//		
//		return numeritos;
//	}
//	
//	public static int pedirFilas() {
//		return pedirFilasColumnas(false);
//	}
//	
//	public static int pedirColumna() {
//		return pedirFilasColumnas(true);
//	}
//
//	public static int pedirFilasColumnas(boolean filas) {
//		int num = 0;
//		boolean correcto=false;
//		do {
//		try {
//			if(filas) {
//				System.out.println("Introduce el número de filas: ");
//			} else {
//				System.out.println("Introduce el número de columnas:");
//			}
//			num = sc.nextInt();
//			correcto = (num <4 && num >= 2);
//		} catch  (InputMismatchException e) {
//			System.out.println("Debes introducir un número");
//			sc.nextLine();
//		}
//		} while(!correcto);
//		return num;
//	}
	
	public static void main(String[] args) {
	      
        int f=0, c=0;
        Scanner entrada =new Scanner(System.in);
        f=pedirFilas(entrada);
        c=pedirColumnas(entrada);
        
        int tabla[][] = new int[f][c];
		
        cargarArray(tabla);
        System.out.println("Tabla creada con los valores introducidos:");
        mostrarArray(tabla);
            
		
    }
    
    public static int pedirFilas(Scanner entrada){

        int filas=0;
        boolean validar;
        do {
            validar=true;
            try {
                System.out.println("Introduce numero de filas(min 2, max 4):");
                filas=entrada.nextInt();
                if (filas < 2 || filas > 4) {
                   System.out.println ("Error, el tamanyo debe estar entre 2 y 4.");
                    validar=false;
                }
            }
            catch (InputMismatchException a) {
                entrada.next();  //Limpiar el objeto para que no entre en bucle infinito
                System.out.println("Error, se pide un dato de tipo int");
                System.out.println(a.getMessage());
                validar=false;
            }
            catch (Exception a) {
                a.printStackTrace();  //metodo que muestra la secuencia de operaciones que han provocado la excepci�n:
                validar=false;
            }
        }while (validar==false); 
        return filas;
    }
    
    public static int pedirColumnas(Scanner entrada){
      
        int columnas=0;
        boolean validar;
        do {
            validar=true;
            try {
                System.out.println("Introduce numero de columnas(min 2, max 4):");
                columnas=entrada.nextInt();
                if (columnas < 2 || columnas> 4) {
                   System.out.println ("Error, el tamanyo debe estar entre 2 y 4.");
                    validar=false;
                }
            }
            catch (InputMismatchException a) {
                entrada.next();  //Limpiar el objeto para que no entre en bucle infinito
                System.out.println("Error, se pide un dato de tipo int");
                System.out.println(a.getMessage());
                validar=false;
            }
            catch (Exception a) {
                a.printStackTrace();  //metodo que muestra la secuencia de operaciones que han provocado la excepci�n:
                validar=false;
            }
        }while (validar==false); 
        return columnas;
    }
        
    
    public static void cargarArray (int array[][]) {
        Scanner entrada = new Scanner(System.in);
        try {
            for (int i=0; i<array.length; i++) {
                for (int j=0; j<array[i].length; j++) {
                    System.out.print("Introduce valor fila " +(i+1) + " columna " + (j+1) + ": ");
                    try {
                    array[i][j]=entrada.nextInt();
                    }
                    catch (InputMismatchException a) {
                            entrada.next();  //Limpiar el objeto para que no entre en bucle infinito
                            System.out.println("Error, se pide un dato de tipo int");
                            j--;
                    }	
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Se ha excedido la dimension del array.");
        }
    }
	
    public static void mostrarArray (int array[][]) {
    
    	
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    	}
	
}
