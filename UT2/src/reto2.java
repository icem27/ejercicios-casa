import java.util.Scanner;

public class reto2 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		boolean ordenDescendente = false, ordenAscendente = false, ordenDesorden = false;
		String resultado="";
		int i=1;
		
		int numeroAnterior, nuevoNumero=0;
		
		System.out.println("Introduce el primero número: ");
		numeroAnterior=leer.nextInt();
		
		while (numeroAnterior!=0) {
			System.out.println("Introduce el número "+i+":");
			nuevoNumero=leer.nextInt();
			if (nuevoNumero==0) {
				break;
			}
			
			if (nuevoNumero>=numeroAnterior && !ordenDesorden && !ordenDescendente) {
				ordenAscendente=true;
			} else if (nuevoNumero<=numeroAnterior && !ordenAscendente && !ordenDesorden) {
				ordenDescendente=true;
			} else {
				ordenAscendente=false;
				ordenDescendente=false;
				ordenDesorden=true;
			}
			
			numeroAnterior=nuevoNumero;
			i++;
		} 
		leer.close();
		
		if (ordenAscendente) {
			resultado = "Los números están en orden creciente";
		} else if (ordenDescendente){
			resultado = "Los números están en orden descreciente";
		} else if (ordenDesorden){
			resultado = "Los números estan desordenados.";
		} else {
			resultado = "No han introducido suficientes números.";
		}
		
		System.out.println(resultado);
		
		

	}

	}

