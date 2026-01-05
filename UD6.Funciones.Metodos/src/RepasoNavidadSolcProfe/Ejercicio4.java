package RepasoNavidadSolcProfe;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int tam; 
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Introduce el tamaño del árbol:");
        tam = sc.nextInt();
        
		pintarArbol(tam);


	}
	public static void pintarArbol(int tam) {
		 int numAsteriscos = 1;
	        //Dibujo la copa
	        for (int i=0; i<= tam; i++){
	        	// Espacios
	        	for (int j=1; j<= tam -i; j++) System.out.print(' ');
	        	// Asteriscos
	        	for (int j=1; j<= numAsteriscos; j++) System.out.print('*');
	        	numAsteriscos +=2; 	
	        	System.out.println();
	        }
	        //Dibujo el tronco
	        for (int i=1; i <= tam; i++){
	        	for (int j=1; j <= tam; j++){
	        		System.out.print(" ");
	        	}
	        	System.out.println('+');
	        }
	}

}
